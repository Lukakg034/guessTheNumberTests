package buttonTest;

import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyPlayAgainButtonIsPresentOnPage extends BaseTest {

@Test
    public void test(){
    HomePage homePage = new HomePage(driver);

    Assert.assertEquals(true, homePage.getPlayAgainButton().isDisplayed());
}
}
