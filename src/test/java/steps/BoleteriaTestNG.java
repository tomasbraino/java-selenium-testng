package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pages.Boleteria;

public class BoleteriaTestNG {


    Boleteria boleteria = new Boleteria();

    @Test
    public void navigateTo(){
        boleteria.navigateToBoleteria();
    }

    @Test(dependsOnMethods = "navigateTo")
    public void clickOnLogin(){
        boleteria.login();
    }

    /*@AfterTest
    public void closeBrowser(){
        boleteria.
    }*/

}
