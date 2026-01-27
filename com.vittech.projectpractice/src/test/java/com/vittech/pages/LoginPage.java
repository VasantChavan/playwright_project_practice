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
	
	public void LoginPageUrl()
	{
		System.out.println(page.url());
	}
	
	public void LoginPageTitle()
	{
		System.out.println(page.title());
	}
	
	
	public void setUsername(String username)
	{
		try {
			page.locator(username_txt).fill(username);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void setPassword(String password)
	{
		try {
			page.locator(password_txt).fill(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

 public void clickButton()
 {
	 page.locator(button_txt).click();
 }
	

}
