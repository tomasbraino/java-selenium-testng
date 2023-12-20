package pages;

import org.openqa.selenium.WebDriver;

public class Boleteria extends SandBoxPage{

    Login loginPage = new Login();

    //constructor
    public Boleteria(){
        super(driver);
    }

    //locators
    public final String loginButton = "//li[@id='aLogIn']";
    private final String registerButton = "//li[@id='aRegister']";

    public final String searchBar = "//input[@id='input_buscador']";

    public final String logOut = "//*[@id='miCuenta']/ul/li[3]/a";
    public final String forgotMyPassword = "//*[@id=aLogIn]/ul/li[2]/a";
    public final String register = "//*[@id=aLogIn/ul/li[1]/a/i";

    public final String miCuenta = "//a[contains(text(),'Mi Cuenta')]";


    //methods
    public void navigateToBoleteria(){
        navigateTo("https://natacionygimnasia.boleteriadigital.com.ar/default");

    }

    public void logOut(){
        selectFromDropDown(miCuenta, 2);

    }




}
