package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage 
{
// Day 59 28 Aug 2023
	Actions action;
	
	@FindBy(id = "nav-tools")  
	private WebElement clickSign;
	
	@FindBy(linkText = "Sign in")
	private WebElement signIn;
// Clicking on mobile for BuyingMobilePhone.java	
	@FindBy(linkText = "Mobiles")
	private WebElement ClickMobile;
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	public void Methodofhovering()
	{
		action.moveToElement(clickSign).build().perform();
		
	}
	
	public void  ClickOnSignIn()
	{
		signIn.click();
		
	}
	// Clicking on mobile for BuyingMobilePhone.java
	public void ClickOnMobile()
	{
		ClickMobile.click();
	}
	
	
}
