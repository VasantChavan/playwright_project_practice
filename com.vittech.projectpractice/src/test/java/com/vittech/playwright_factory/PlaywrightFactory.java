package com.vittech.playwright_factory;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {

	Browser browser;
	Page page;
	
	
	public Page browserfactory(String browserName)
	{
		browserName.trim().toLowerCase();
		
		switch(browserName)
		{
		
		case "chromium":
			 browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
		      break;
		    
		
		case "firefox":
			browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
			break;
			
			
		case "webkit":
			browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
		    break;
		  
		  
		 default:
			 browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
		      break;
		  
		}
		
		page = browser.newPage();
		page.navigate("https://freelance-learn-automation.vercel.app/login");
		
		
		return page;
		
	}
}
