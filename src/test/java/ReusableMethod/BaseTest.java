package ReusableMethod;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 04/07/2018.
 */
public class BaseTest extends BasePage {

   // @Test
    @BeforeMethod

    public void openBrowser (){
        System.setProperty("webdriver.chrome.driver","src\\Resources\\BrowserDriver\\chromedriver.exe");

        driver= new ChromeDriver();
        driver.get("http://demo.nopcommerce.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }
//@AfterMethod
//    public void closeBrowser(){
//
//        driver.quit();
}
//}
