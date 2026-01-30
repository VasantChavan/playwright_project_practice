package com.vittech.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
    Page page;
	
	private static String username_txt="//input[@name='email1']";
	private static String password_txt="//input[@name='password1']";
	private static String button_txt="//button[@type='submit']";
	
	
	public LoginPage(Page page)
	{
		this.page=page;
	}
	
	public String LoginPageUrl()
	{
		
		String url=page.url();
		return url;
	}
	
	public String LoginPageTitle()
	{
		String title = page.title();
		return title;
	}
	
	
	public void login(String username,String password)
	{
		try {
			page.locator(username_txt).fill(username);
			page.locator(password_txt).fill(password);
			page.locator(button_txt).click();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
