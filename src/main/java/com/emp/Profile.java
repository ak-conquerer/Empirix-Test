package com.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Profile extends TestSetup {

	public static void getProfile()
	{
		 WebElement prof = driver.findElement(By.linkText("Profile"));
		 prof.click();
	}
}
