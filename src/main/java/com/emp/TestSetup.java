package com.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSetup {
	
	public static void setChromeDriverPath()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Welcome\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	}
	
	public static void setFirefoxDriverPath()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Welcome\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
	}
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void openURL() throws InterruptedException{
	{
		wait = new WebDriverWait(driver, 60);
		System.out.println("Opening Browser and navigating to page");
		driver.get("https://services.empirix.com");
		Thread.sleep(50000);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='submit']"))));
	}
	
	/*
	public static void credentials(String a, String b)
	{
		WebElement uname = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		
		uname.sendKeys(a);
		pwd.sendKeys(b);
	}
	
	
	public static void submitForm()
	{
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
	}*/
	
	

	}
}
