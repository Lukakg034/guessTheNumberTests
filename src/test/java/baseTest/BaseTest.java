package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

     public WebDriver driver;

     @BeforeMethod
     public void initialize(){
          System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver_109\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://lukakg034.github.io/guessTheNumber/");
     }

     @AfterMethod
     public void teardown(){
          driver.close();
          driver.quit();
     }
}
