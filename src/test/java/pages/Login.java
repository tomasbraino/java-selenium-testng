package pages;

public class Login extends SandBoxPage {

    public Login() {
        super(driver);
            }

    //locators
    public final String userName = "//input[@id='ContentPlaceHolder1_txtUsuario']";
    public final String passwordField = "//input[@id='ContentPlaceHolder1_txtClave']";
    public final String loginButton = "//input[@id='ContentPlaceHolder1_btnLogin']";
    public final String registerButton = "//*[@id='Form_login']/a[1]"; //locator ?
    public final String forgotMyPasswordButton = "//*[@id='Form_login']/a[2]";//locator ?

    //methods
    public void login(){
        write(userName, "tomasbraino@gmail.com");
        write(passwordField, "tomasb10");
    }



}

