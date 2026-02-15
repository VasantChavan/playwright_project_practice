package com.vittech.testecases;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.vittech.pages.LoginPage;
import com.vittech.testbase.TestBase;
import com.vittech.utility.CommonUtility;

public class LoginTestCases extends TestBase {
	
	
	@Test
	public void getUrlandTitle()
	{
		lp = new LoginPage(page);
		System.out.println(lp.LoginPageUrl());
		System.out.println(lp.LoginPageTitle());
	}
	
	@Test()
	public void login()
	{	
		cu=new CommonUtility(page);
		lp.login("sarikadaundkar6@gmail.com","sarika");
		cu.getScreenShots("./Screenshots/fullscreenshot.png");
	}

}
