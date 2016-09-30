package feature.prompts;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import cucumber.api.Format;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;

public class PromptSteps {
   WebDriver driver = new ChromeDriver();
   //driver.get("http://localhost:8080/hangman.html");

    @When("^I am on the hangman homepage$")
    public void i_am_on_the_hangman_homepage(){
	this.driver.get("http://localhost:8080/hangman.html");
    }

    /*
    @Then("^the prompt should read Letter?$")
    public void the_prompt_should_read() throws Throwable {
        assertThat(this.driver.findElement(By.id("prompt")), equalTo("Letter?"));
    }*/
    @Then("^the prompt should read Letter$")
    public void the_prompt_should_read_Letter() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://localhost:8080/hangman.html");
        assertThat(driver.findElement(By.id("prompt")).getText(), equalTo("Letter"));
    }
}
