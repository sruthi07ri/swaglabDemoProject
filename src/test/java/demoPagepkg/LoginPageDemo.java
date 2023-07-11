package demoPagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageDemo {
	
WebDriver driver;
	
	By uname = By.id("user-name");
	By pass = By.id("password");
	By loginbtn = By.id("login-button");
	

	public LoginPageDemo(WebDriver driver) {
		
		this.driver = driver;
	}
	
		
	public void setValues(String usrname, String pswd)
	{
		
		driver.findElement(uname).sendKeys(usrname);
		driver.findElement(pass).sendKeys(pswd);
		
	}
	
	public void clickLogin()
	{
		
		driver.findElement(loginbtn).click();
	}
	

}
