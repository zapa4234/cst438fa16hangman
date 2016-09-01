# Hangman example for JUnit exercises
For the CSUMB course CST438, Fall 2016.

## Reading
Read the first 4 chapters (Part 1) of the book Pragmatic Unit Testing in Java 8 with JUnit.

See the [commit history](../commits/master) of this repository to see how it was generated
initially with the Maven command:

    mvn -B archetype:generate \
    -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart \
    -DgroupId=edu.csumb.cst438fa16hangman -DartifactId=cst438fa16hangman

as explained in the note [JUnit with Maven](http://goo.gl/bPFA9P).

## Exercise 1
Follow the directions in the note [JUnit with Maven](http://goo.gl/bPFA9P) to import the
Maven project into Eclipse and run the unit tests in Eclipse. See also the instructions to run
JUnit in Eclipse in chapter 1 of the Pragmatic Unit Testing book.

HINT 1: Follow the directions in the JUnit with Maven note to upgrade the project to JUnit 4
(e.g. version 4.11 used in the book).

HINT 2: If you run an older version of Java than Java 8, you need to roll back the changes to
HashSetTest.java in [this commit](../commit/115e7338).

## Exercise 2
Write JUnit unit tests for the Hangman class.

HINT: Create a HangManTest class in <tree/master/src/test/java/edu/csumb/cst438fa16hangman>, like HashSetTest.

## Exercise 3
Clean up AppTest and upgrade it to JUnit 4.

HINT: Change the imports and remove most of the methods. Add @Test annotation to the method you keep.

## Exercise 4
Make AppTest truly test the App class by testing that the main() method prints "Hello World!".

HINT: <http://stackoverflow.com/a/1119559>
