package com.emp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSetup {

	WebDriver driver;
	public static String browser;
	
	
	/*switch(browser)
	{
	case : Chrome
		driver = new ChromeDriver();
	case : Firefox
		driver = new FirefoxDriver();
	case : Internet Explorer
		driver = new InternetExplorerDriver();
	}*/
	
	public void setDriverPath()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Welcome\\Documents\\eclipse_workspace\\chromedriver.exe");
	}
	
	public void createDriver()
	{
		driver = new ChromeDriver();
	}
	
	
}
