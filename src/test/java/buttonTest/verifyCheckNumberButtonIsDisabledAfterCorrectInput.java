package buttonTest;

import Pages.HomePage;
import baseTest.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyCheckNumberButtonIsDisabledAfterCorrectInput extends BaseTest {

    @Test
    public void test(){
        HomePage homePage = new HomePage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Long jsSecretNumber = (Long) js.executeScript("return secretNumbers");

        homePage.getInputField().sendKeys(String.valueOf(jsSecretNumber));
        homePage.getbuttonCheckNumber().click();
        Assert.assertFalse(homePage.getbuttonCheckNumber().isEnabled());
    }
}
