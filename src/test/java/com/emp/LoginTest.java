package com.emp;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.emp.Login;

public class LoginTest extends Login{

	@Test
	public static void loginPortal()
	{
		Login.setDriverPath();
		Login.driver = new ChromeDriver();
		Login.wait = new WebDriverWait(driver, 10);
		Login.openURL();
		Login.credentials("QA_traininguser25","Empirix!");
		Login.submitForm();
	}
	
}
