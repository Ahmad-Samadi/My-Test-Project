package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProducts {
	
	Actions action;

	// for hovering we use Action Class
	
	@FindBy(linkText= "Laptops & Accessories")//if link is wrapped in the anchor tag (<a) then we would use linkText so we have to copy the
	private WebElement ClickOnLaptopAndAccessories;
	// the name from the source code code 
	
	@FindBy(linkText= "Apple") // Since Laptops & Accessores are on the same webpage we can just use click on Apple in here.
	private WebElement ClickOnApple;
	
// since it is something new , we would create a constructor for it 
	public AllProducts (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		action = new Actions(driver); // we need to initialize it with a driver so we declared it in line 10 and we need to create a constructor
		}
		// below we will create a method
		public void HoverkOnLaptopAndAccessories()
		{
			action.moveToElement(ClickOnLaptopAndAccessories).build().perform();	
		}	
		
		public void ClickOnAppleLink()
		{
			ClickOnApple.click();
		}
	
}

