package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Boleteria;
import pages.Login;

public class BoleteriaTestNG {


    Boleteria boleteria = new Boleteria();
    Login loginPage = new Login();

    @BeforeSuite
    public void navigateTo(){
        boleteria.navigateToBoleteria();

    }

    @Test
    public void login(){
        boleteria.clickElement(boleteria.loginButton);
        loginPage.login();
        loginPage.clickElement(loginPage.loginButton);

    }

    @AfterTest
    public void logOut(){
        boleteria.clickElement(boleteria.miCuenta);

    }

    @AfterSuite
    public void closeChrome(){
        boleteria.closeBrowser();
    }



}
