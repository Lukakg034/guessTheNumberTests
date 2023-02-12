package messageDisplayTest;

import Pages.HomePage;
import baseTest.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyValidUserMessageIsDisplayedOnWrongNumber extends BaseTest {

    @Test
    public void messageOnHigherNumber(){
        HomePage homePage = new HomePage(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Long jsSecretNumber = (Long) js.executeScript("return secretNumbers");

        homePage.getInputField().sendKeys(String.valueOf(jsSecretNumber +1));
        homePage.getbuttonCheckNumber().click();
        Assert.assertEquals(homePage.getUserMessage().getText(), homePage.messageOnHigherNumber);
    }

    @Test
    public void messageOnLowerNumber(){
        HomePage homePage = new HomePage(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Long jsSecretNumber = (Long) js.executeScript("return secretNumbers");

        homePage.getInputField().sendKeys(String.valueOf(jsSecretNumber -1));
        homePage.getbuttonCheckNumber().click();
        Assert.assertEquals(homePage.getUserMessage().getText(),homePage.messageOnSmallerNumber);
    }
}
