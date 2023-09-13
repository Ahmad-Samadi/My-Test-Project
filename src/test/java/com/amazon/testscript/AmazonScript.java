package com.amazon.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.LandingPage;
import com.amazon.pages.SignIn;

public class AmazonScript extends BaseStartApp // to reuse the code we can extend the class 
// we just extend the file and same codes can be used even in other files

{	

	@Test
	public void MouseHoveringOnSignInPage()
	{
		LandingPage land = new LandingPage(driver);
		land.Methodofhovering();
		
		land.ClickOnSignIn();
		
		SignIn sign = new SignIn(driver); // this is SignIn.java file  ( Day 60 29 Aug 2023)
	//	just put a random email
		sign.fillingIntoBox("asdfg12345433456@gmail.com"); // it is already defined in the in the SignIn.java page file 
		
		sign.ClickingOnBtn();
		
	}
	
	
	
}
