package demoPagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageDemo {

WebDriver driver;
	
	By checkoutbtn = By.id("checkout");
	
	
	
	public CartPageDemo(WebDriver driver) {
		
		this.driver = driver;
	}



	public void clickCheckout()
	{
		driver.findElement(checkoutbtn).click();
	}
}
