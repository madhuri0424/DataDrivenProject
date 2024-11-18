package applicationLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogout {
@FindBy(xpath = "//a[@id='welcome']")
WebElement ClickWelcome;
@FindBy(xpath = "//a[normalize-space()='Logout']")
WebElement ClickLogout;
public void verifyLogout()throws Throwable
{
	ClickWelcome.click();
	Thread.sleep(2000);
	ClickLogout.click();
}
}
