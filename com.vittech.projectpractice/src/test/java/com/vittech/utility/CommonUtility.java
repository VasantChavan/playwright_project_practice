package com.vittech.utility;
import com.microsoft.playwright.*;

public class CommonUtility {
	

	
	    public static void main(String[] args) {

	        // Start Playwright
	        Playwright playwright = Playwright.create();

	        // Open browser
	        Browser browser = playwright.chromium().launch(
	                new BrowserType.LaunchOptions().setHeadless(false)
	        );
	        // Open page
	        Page page = browser.newPage();

	        // Open website
	        page.navigate("https://freelance-learn-automation.vercel.app/login");

	        // Enter username & password
	        page.locator("//input[@id='email1']").fill ("saundankar.rohit@gmail.com");
	        page.locator("//input[@id='password1']").fill("Computer@1");

	        // Click login button
	        page.locator("//button[@type='submit']").click();


	       // Close browser
        browser.close();
        playwright.close();
    }
}