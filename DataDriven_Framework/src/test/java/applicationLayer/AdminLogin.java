package applicationLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogin {
//define repository
    @FindBy(name = "txtUsername")
    WebElement Objuser;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement Objpass;
    @FindBy(id = "btnLogin")
    WebElement Objlogin;
    //write method for login
    public void verifyLogin(String Username,String Password)
    {
    	Objuser.sendKeys(Username);
    	Objpass.sendKeys(Password);
    	Objlogin.click();
    }

}
