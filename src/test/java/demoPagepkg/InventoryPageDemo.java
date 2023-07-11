package demoPagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPageDemo {
	

	WebDriver driver;
	
	By addCartbtn = By.id("add-to-cart-sauce-labs-backpack");
//	By cartIcon = By.xpath("//div[@id='shopping_cart_container']/a");
	By cartIcon = By.className("shopping_cart_link");
	
	public InventoryPageDemo(WebDriver driver) {

		this.driver = driver;
	}

	public void clickAddTocart()
	{
		
		driver.findElement(addCartbtn).click();
	}
	
	public void clickCartIcon()
	{
		
		driver.findElement(cartIcon).click();
	}

}
