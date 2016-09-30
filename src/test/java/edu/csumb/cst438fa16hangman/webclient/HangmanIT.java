package edu.csumb.cst438fa16hangman.webclient;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * User story:
 *   As a user I want to be greeted by the name of my choice to become amused
 * Class name ends in IT so it runs with "mvn integration-test", not "mvn test".
 */
public class HangmanIT {
    // Requires chromedriver. See:
    // http://docs.seleniumhq.org/docs/03_webdriver.jsp#chromedriver
    // On Mac you can install it with "brew install googledriver" if you have Homebrew.
    WebDriver driver = new ChromeDriver();

    @Before
    public void setUp() {
        driver.get("http://localhost:8080/hangman.html");
    }

    @After
    public void tearDown() {
        driver.quit(); // close browser
    }

    @Test
    public void testLetterPrompt() {
        driver.findElement(By.id("newGuesses")).sendKeys("a");
        driver.findElement(By.id("submit")).click();
        (new WebDriverWait(driver, 10))
        .until(ExpectedConditions.textToBe(By.id("oldGuesses"), "a"));

        // Success
    }
}
