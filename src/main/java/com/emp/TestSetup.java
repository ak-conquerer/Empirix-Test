package com.emp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSetup {
	
	public static void setDriverPath()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Welcome\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
}
