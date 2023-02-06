package userInputTest;

import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.annotations.Test;

public class verifyInputFieldAcceptNumberInput extends BaseTest {

    @Test(enabled = false)
    public void test (){
        HomePage homePage = new HomePage(driver);

        int[] inputNumbers = {0,1,2,3,4,5,6,7,8,9};
    }
}
