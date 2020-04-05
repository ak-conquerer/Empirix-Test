package com.emp;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.emp.Login;

public class LoginTest extends Login{

	@Test
	public static void loginPortal() throws InterruptedException
	{
		Login.setFirefoxDriverPath();
		//Login.setChromeDriverPath();
		//Login.driver = new ChromeDriver();
		Login.driver = new FirefoxDriver();
		//Login.wait = new WebDriverWait(driver, 60);
		Login.openURL();
		Login.credentials("QA_traininguser25","Empirix!");
		Login.submitForm();
	}
	
}
