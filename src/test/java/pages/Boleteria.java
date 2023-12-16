package pages;

import org.openqa.selenium.WebDriver;

public class Boleteria extends SandBoxPage{

    //constructor
    public Boleteria(){
        super(driver);
    }

    //locators
    private final String loginButton = "//li[@id='aLogIn']";
    private final String registerButton = "//li[@id='aRegister']";

    private final String searchBar = "//input[@id='input_buscador']";


    private final String forgotMyPassword = "//*[@id=aLogIn]/ul/li[2]/a";
    private final String register = "//*[@id=aLogIn/ul/li[1]/a/i";


    //methods
    public void navigateToBoleteria(){
        navigateTo("https://natacionygimnasia.boleteriadigital.com.ar/default");

    }

    public void login(){
        clickElement(loginButton);

    }
    public void register(){
        clickElement(registerButton);
    }


    public void search(){
        clickElement(searchBar);
    }


}
