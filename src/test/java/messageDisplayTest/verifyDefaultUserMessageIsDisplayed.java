package messageDisplayTest;

import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyDefaultUserMessageIsDisplayed extends BaseTest {

    @Test
    public void test(){
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals("Start guessing...", homePage.getUserMessage().getText());
    }
}
