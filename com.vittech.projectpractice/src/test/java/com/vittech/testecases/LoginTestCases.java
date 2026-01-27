package com.vittech.testecases;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.vittech.pages.LoginPage;
import com.vittech.testbase.TestBase;

public class LoginTestCases extends TestBase {
	
	
	@Test()
	public void login()
	{
		
		
		LoginPage lp = new LoginPage(page);
		
		lp.LoginPageUrl();
		lp.LoginPageTitle();
		lp.setPassword("sarikadaundkar6@gmail.com");
		lp.setPassword("sarika");
		lp.clickButton();
	}

}
