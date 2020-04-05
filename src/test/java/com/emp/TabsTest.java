package com.emp;

import org.testng.annotations.Test;

public class TabsTest extends VerifyTabs {
	
	@Test
	public static void tTest()
	{
		VerifyTabs.getDashboard();
		VerifyTabs.getAlert();
		VerifyTabs.getNotifications();
		VerifyTabs.getTest();
		VerifyTabs.getVariables();
		
	}

}
