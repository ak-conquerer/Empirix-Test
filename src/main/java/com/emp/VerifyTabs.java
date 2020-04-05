package com.emp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyTabs extends TestSetup {

	public static void getDashboard()
	{
		WebElement dash = driver.findElement(By.linkText("Dashboard"));
		dash.click();
			
	}
	
	public static void getAlert()
	{
		WebElement alert = driver.findElement(By.linkText("Alert"));
		alert.click();
			
	}
	
	public static void getTest()
	{
		WebElement test = driver.findElement(By.linkText("Tests"));
		test.click();
			
	}
	

	public static void getVariables()
	{
		WebElement variable = driver.findElement(By.linkText("Variables"));
		variable.click();
			
	}
	
	public static void getNotifications()
	{
		WebElement notif = driver.findElement(By.linkText("Notifications"));
		notif.click();
			
	}
}
