package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChargerofApple

// Since it is  new page on the amazon website after clicking on the charger, we have created the this page (ChargerofApple) 
{
	
	@FindBy(xpath= "(//div[contains(@class,'a-section a-spacing-base')])[1]") // created a locator
	private WebElement ClickOnCard;
	
	public ChargerofApple(WebDriver driver) // since its a new page we would created a constructor 
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonFirstCard() // since we have created xpath so it can accessed on the next page we have to create a method for it 
	{
		ClickOnCard.click(); // copy the veriable name form the top and paste it .click();
	}
// since we have create a new file Charger of Apple we need to create Object of it in BuyMobilePhone.java
}
