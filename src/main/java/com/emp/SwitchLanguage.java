package com.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SwitchLanguage extends TestSetup {

	public static void englishSelected()
	{
		WebElement drop = driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']"));
		drop.click();
		
		WebElement english = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/section[1]/div/div/div/ul/li[1]/ul/div/div/div"));
		english.click();
		
	}
	
	public static void japaneseSelected()
	{
		WebElement drop = driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']"));
		drop.click();
		
		WebElement japanese = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/section[1]/div/div/div/ul/li[1]/ul/div/div/a"));
		japanese.click();
		
	}
}
