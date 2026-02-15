package com.vittech.testbase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import com.vittech.pages.LoginPage;
import com.vittech.playwright_factory.PlaywrightFactory;
import com.vittech.utility.CommonUtility;

public class TestBase {

	protected Page page;
	protected LoginPage lp;
	protected CommonUtility cu;
	
	@BeforeTest()
	public void setup()
	{
		
		PlaywrightFactory pf=new PlaywrightFactory();
	    page = pf.browserfactory("Chromium");
	    
	    lp = new LoginPage(page);
		
	}
	
	@AfterTest()
	public void teardown()
	{
		page.close();
	}
}
