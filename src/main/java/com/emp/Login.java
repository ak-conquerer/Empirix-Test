package com.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends TestSetup {
	
	
	public static void openURL()
	{
		System.out.println("Opening Browser and navigating to page");
		driver.get("https://services.empirix.com");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@type='submit']"))));
	}
	
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
	}
	
	
}
