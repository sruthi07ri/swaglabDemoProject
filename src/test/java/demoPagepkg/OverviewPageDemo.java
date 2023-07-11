package demoPagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPageDemo {
	
WebDriver driver;
	
	By finishbtn = By.id("finish");
	
	
	public OverviewPageDemo(WebDriver driver) {
		
		this.driver = driver;
	}


	public void clickfinish()
	{
		
		driver.findElement(finishbtn).click();
	}

}
