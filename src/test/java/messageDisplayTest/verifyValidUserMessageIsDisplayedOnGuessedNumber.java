package messageDisplayTest;

import Pages.HomePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class verifyValidUserMessageIsDisplayedOnGuessedNumber extends BaseTest {

    @Test(enabled = false)
    public void test (){
        HomePage homePage = new HomePage(driver);

        int[] secretNumbers = {1, 2, 3, 4, 5};
        for (int number : secretNumbers) {
            String inputToSend = Integer.toString(number);
            System.out.println(number);
            homePage.getInputField().sendKeys(inputToSend);
            homePage.getbuttonCheckNumber().click();
            homePage.getInputField().clear();
            homePage.getInputField().sendKeys(Arrays.toString(secretNumbers));

//            if (homePage.getUserMessage().getText() == "Number is too low!"){
//                homePage.getInputField().clear();
//
//
//                System.out.println("Message is valid for higher number");
//            } else if (homePage.getUserMessage().getText() == "Number is too low!"){
//                System.out.println("Message is valid for lower number");
//            } else if (homePage.getUserMessage().getText() == "Number is right!"){
//                System.out.println("Number is right message!");
//            }
        }
//        for (int i=1; i <= secretNumbers.length; i++){
//            homePage.getInputField().sendKeys();
//            homePage.getbuttonCheckNumber().click();
//            if (homePage.getUserMessage().getText() == "Number is too low!" || homePage.getUserMessage().getText() == "Number is too high!"){
//                homePage.getInputField().sendKeys();
//            }
//            System.out.println(i);
//            System.out.println(homePage.getUserMessage().getText());
//        }
    }

}
