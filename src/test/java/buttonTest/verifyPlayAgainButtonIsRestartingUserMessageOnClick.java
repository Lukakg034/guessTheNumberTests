package buttonTest;

import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Base64;

public class verifyPlayAgainButtonIsRestartingUserMessageOnClick extends BaseTest {

    @Test
    public void test(){
        HomePage homePage = new HomePage(driver);
        homePage.getbuttonCheckNumber().click();
        Assert.assertEquals("Please follow the rules. Pick a number between 1 and 5.", homePage.getUserMessage().getText());
        homePage.getPlayAgainButton().click();
        Assert.assertEquals("Start guessing...", homePage.getUserMessage().getText());

    }

}
