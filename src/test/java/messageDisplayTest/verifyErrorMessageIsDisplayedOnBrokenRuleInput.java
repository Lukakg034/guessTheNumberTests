package messageDisplayTest;

import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyErrorMessageIsDisplayedOnBrokenRuleInput extends BaseTest {

    @Test
    public void invalidInputNumber0Test(){
        HomePage homePage = new HomePage(driver);

        homePage.getInputField().sendKeys("0");
        homePage.getbuttonCheckNumber().click();
        Assert.assertEquals(homePage.getUserMessage().getText(), "Please follow the rules. Pick a number between 1 and 5.");
    }

    @Test
    public void invalidInputNumber6Test(){
        HomePage homePage = new HomePage(driver);
        homePage.getInputField().sendKeys("6");
        homePage.getbuttonCheckNumber().click();
        Assert.assertEquals(homePage.getUserMessage().getText(), "Please follow the rules. Pick a number between 1 and 5.");

    }
}
