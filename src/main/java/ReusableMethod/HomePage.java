package ReusableMethod;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Welcome on 04/07/2018.
 */
public class HomePage extends Utils {


    public void compareList() {
        clickElement(By.xpath("//input[@value='Add to compare list']"));

        clickElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[4]/div/div[2]/div[3]/div[2]/input[2]"));
        clickElement(By.xpath("//a[contains(text(),'product comparison')]"));


    }


    //    public void navigateToRegisterPage() {
//        driver.get("http://demo.nopcommerce.com/register");
//    }    // navigate to book page method
//    }
    public void navigateToRegisterPage() {    //  navigate To Register Page

        clickElement(By.linkText("Register"));  // click on ragister
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void userOnRagisteredPage() {    // method of ragistered page
        driver.get("http://demo.nopcommerce.com/registerresult/1");   // get url
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // implicity wait
    }
}
