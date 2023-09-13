package com.amazon.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseStartApp 
{

	WebDriver driver;
//  Day 60 29 Aug 2023
		
		@BeforeTest
		public void StartApp()
		{
			System.setProperty("webdriver.chorme.driver", "chromedriver.exe");
			ChromeOptions option = new ChromeOptions();	
			option.addArguments("-- remote-allow-origins=*");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");	
		}
		@AfterTest
		public void CloseApp()
		{
	//		driver.close();
		}
}
