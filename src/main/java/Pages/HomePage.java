package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    By buttonPlayAgain = By.cssSelector(".button-again");
    By buttonCheckNumber = By.id("check-button");

    By inputField = By.cssSelector(".guess");

    By mainHeading = By.cssSelector(".main-heading");

    By userMessage = By.cssSelector(".message");

    By secretNumber = By.cssSelector(".secret-number");

    By rulesMessage = By.cssSelector(".between");


    public WebElement getPlayAgainButton(){
        return driver.findElement(buttonPlayAgain);
    }
    public WebElement getbuttonCheckNumber(){
        return driver.findElement(buttonCheckNumber);
    }
    public WebElement getInputField(){
        return driver.findElement(inputField);
    }
    public WebElement getMainHeading(){
        return driver.findElement(mainHeading);
    }
    public WebElement getUserMessage(){
        return driver.findElement(userMessage);
    }
    public WebElement getSecretNumber(){
        return driver.findElement(secretNumber);
    }
    public WebElement getRulesMessage(){
        return driver.findElement(rulesMessage);
    }
    public String messageOnHigherNumber = "Number is too high!";

    public String messageOnSmallerNumber = "Number is too low!";

    public String messageOnCorrectNumber = "Number is right!";
}
