package ReusableMethod;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Welcome on 04/07/2018.
 */
public class TestSuits extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldAbleToCompareProducts(){
        homePage.compareList();
    }


    @Test
    public  void userShouldBeAbleToRegisterSuccessfully() {
        homePage.navigateToRegisterPage();
        registerPage.registerUser();

        String acualMsg = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]")).getText();
        Assert.assertEquals(acualMsg,"Your registration completed");
        System.out.println("Your registration completed");

    }






}