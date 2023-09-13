package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// this is test 
public class BuyNow {

	
	@FindBy(id="buy-now-button")
	private WebElement clickOnBuyNow;  // this is the veriable 
	
	public BuyNow( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnBuyNowBtn()  // create a method 
	{
		clickOnBuyNow.click();  // we put the same veriable from the top and paste it .click
		// copy the BuyNow class name from top go back to BuyMobilePhone.java where we run the code.
	}
	
}
