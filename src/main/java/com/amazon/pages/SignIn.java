package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

//  Day 60 29 Aug 2023
	
	@FindBy(id= "ap_email") // the link is from amazon sign in page
	private WebElement signin;
	
	@FindBy(id= "continue") // since the btn is in the same page in amazon we 
	private WebElement ClickOnBtn;
	
	public SignIn( WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fillingIntoBox( String Email)  // it will fill the text or email in the box
	{
		signin.sendKeys(Email); 
	}
	
	public void ClickingOnBtn() // this is for clicking of line 15 of this page and 
	{
		ClickOnBtn.click();
	}
}
