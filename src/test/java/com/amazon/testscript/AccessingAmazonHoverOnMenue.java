package com.amazon.testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.amazon.pages.LandingPage;

public class AccessingAmazonHoverOnMenue {
	
	WebDriver driver;
	
	@BeforeTest
	public void startApplication()
	{	
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");	
	}
	
	@Test
	public void Hover()
	{
		LandingPage landingPage =new LandingPage(driver);
		landingPage.hoverOnPoint();
	}

}
