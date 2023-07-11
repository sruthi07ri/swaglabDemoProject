package demoTestpkg;

import org.testng.annotations.Test;

import demoPagepkg.CartPageDemo;
import demoPagepkg.CheckoutPageDemo;
import demoPagepkg.InventoryPageDemo;
import demoPagepkg.LoginPageDemo;
import demoPagepkg.OverviewPageDemo;

public class DemoTest extends BaseClassDemo {
	
	
	@Test (priority = 0)
	public void login()
	{
		LoginPageDemo lpd = new LoginPageDemo(driver);
		lpd.setValues("standard_user","secret_sauce");
		lpd.clickLogin();
		
	}
	
	@Test (priority = 1)
	public void addToCart()
	{
		InventoryPageDemo ipd = new InventoryPageDemo(driver);
		ipd.clickAddTocart();
		ipd.clickCartIcon();
		
	}
	
	@Test (priority = 2)
	public void checkout()
	{
		CartPageDemo cpd = new CartPageDemo(driver);
		cpd.clickCheckout();
	}

	@Test (priority = 3)
	public void placeOrder()
	{
		CheckoutPageDemo copd = new CheckoutPageDemo(driver);
		copd.setinfo("meera", "c.k", "12345");
		copd.clickContinue();
		
	}
	
	@Test (priority = 4)
	public void orderFinish()
	{
		OverviewPageDemo opd = new OverviewPageDemo(driver);
		opd.clickfinish();
	}
}
