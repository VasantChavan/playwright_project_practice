package com.vittech.testecases;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.vittech.pages.LoginPage;
import com.vittech.testbase.TestBase;

public class LoginTestCases extends TestBase {
	
	
	@Test()
	public void login()
	{	
		lp = new LoginPage(page);
		
		System.out.println(lp.LoginPageUrl());
		System.out.println(lp.LoginPageTitle());
		lp.login("sarikadaundkar6@gmail.com","sarika");
		
	}

}
