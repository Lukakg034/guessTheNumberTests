package messageDisplayTest;

import Pages.HomePage;
import baseTest.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class verifyValidUserMessageIsDisplayedOnGuessedNumber extends BaseTest {

    @Test
    public void test (){
        HomePage homePage = new HomePage(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Storing the js variable value in the Long type variable

        Long jsSecretNumber = (Long) js.executeScript("return secretNumbers");
        homePage.getInputField().sendKeys(String.valueOf(jsSecretNumber));
        homePage.getbuttonCheckNumber().click();
        Assert.assertEquals(homePage.getUserMessage().getText(), homePage.messageOnCorrectNumber);
        }
    }
