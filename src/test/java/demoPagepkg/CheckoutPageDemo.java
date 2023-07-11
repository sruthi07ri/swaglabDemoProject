package demoPagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageDemo {
	
WebDriver driver;
	
	By firstname = By.id("first-name");
	By lastname = By.id("last-name");
	By zipcode = By.id("postal-code");
	By continuebtn = By.id("continue");
	
	
	
	public CheckoutPageDemo(WebDriver driver) {
		
		this.driver = driver;
	}

	public void setinfo(String fname, String lname, String zip)
	{
		
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(zipcode).sendKeys(zip);
	}
	
	public void clickContinue()
	{
		
		driver.findElement(continuebtn).click();
	}

}
