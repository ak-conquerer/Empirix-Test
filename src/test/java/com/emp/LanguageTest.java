package com.emp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LanguageTest extends SwitchLanguage {

	@Test
	public static void lTest()
	{
		SwitchLanguage.setDriverPath();
		SwitchLanguage.driver = new ChromeDriver();
		SwitchLanguage.wait = new WebDriverWait(driver, 10);
		SwitchLanguage.openURL();
		SwitchLanguage.credentials("QA_traininguser25","Empirix!");
		SwitchLanguage.submitForm();
		SwitchLanguage.japaneseSelected();
		
	}
	
}
