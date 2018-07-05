package ReusableMethod;

import org.openqa.selenium.By;

/**
 * Created by Welcome on 05/07/2018.
 */
public class RegisterPage extends Utils {

    public void registerUser(){
        String email= "Ram"+randomDate()+"lal@gmail.com";    // made it dynamic email address
        System.out.println(email);

        clickElement(By.id("gender-male"));   // click on gender female
        enterText(By.id("FirstName"),"Ram");  // enter first name
        enterText(By.id("LastName"),"Lal");  // enter last name
        //waitForElementVIsible(By.id("thanks"),20);
        enterText(By.id("Email"),email);  // enter email
        enterText(By.id("Company"),"Aaja Phasaja");  // enter the company name
        enterText(By.id("Password"),"lal1234");  // enter password
        enterText(By.id("ConfirmPassword"),"lal1234");  // enter confirm password
        clickElement(By.id("register-button"));  // click on register

    }

}
