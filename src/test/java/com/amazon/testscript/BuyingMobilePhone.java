package com.amazon.testscript;

import java.util.ArrayList;

import org.testng.annotations.Test;
import com.amazon.pages.AllProducts;
import com.amazon.pages.BuyNow;
import com.amazon.pages.ChargerofApple;
import com.amazon.pages.LandingPage;
// Day 61  Aug 303 2023
public class BuyingMobilePhone extends BaseStartApp
{
	@Test
	public void BuyMobilefromAmazon()
	{
		LandingPage	mobile= new LandingPage(driver);
		mobile.ClickOnMobile();
		
		AllProducts hover = new AllProducts(driver) ;  // the rule to access AllProducts.java we have to use the file name and we need to create object of it 
		hover.HoverkOnLaptopAndAccessories(); //after writing hover when you put a dot ,it will show you the link 
		
		hover.ClickOnAppleLink(); // we should access the method .Since we have already used the method of AllProducts we will only use hover.Click
	
		ChargerofApple charger = new ChargerofApple(driver); // to create an object of ChargerofApple file 
		charger.clickonFirstCard();
		
		// the ArrayList... below make the tab to open in the same tab not in the new tab 
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		// tab.get(1) 
		
		BuyNow buy = new BuyNow(driver); // and we will create object from the BuyNow page 
		buy.clickOnBuyNowBtn();
		
		
		
		
		
	
	
	
	}
	
	
	
	
	
}
