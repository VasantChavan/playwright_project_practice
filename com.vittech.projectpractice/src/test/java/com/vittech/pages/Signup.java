package com.vittech.pages;

import com.microsoft.playwright.Page;

public class Signup {
	
	private static String username_text="//input[@name='name']";
	private static String email_text="//input[@name='email']";
	private static String password_text="//input[@name='password']";
	private static String button_txt="//button[@type='submit']";
	private Page page;
	
	
	public Signup(Page page)
	{
		this.page=page;
	}
	
	public String getSignPageTitle() {
		String title = page.title();
		System.out.println("App title is: "+title);
		return title;
	}
	public String getSignPageURL() {
		String url = page.url();
		System.out.println("App url is:"+url);
		return url;
	}

	
	public void setUsername(String username)
	{
		try {
			page.locator(username_text).fill(username);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setEmail(String username)
	{
		try {
			page.locator(email_text).fill(username);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void setPassword(String password)
	{
		try {
			page.locator(password_text).fill(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void setCheckbox() {
		page.locator("#69577eb8fb4b8faaf9ad27ed").check();

	}
	public void setCheckbox1() {
		page.locator("#69577ebffb4b8faaf9ad27f7").check();
	}
	
	
	
	public void setRadio() {
	
		page.locator("#gender1").click();
	}
	
	public void setRadio1()
	{
		page.locator("#gender2").click();
	}
	
	public void setState()
	{
		page.locator("select#state");
	}
	
	public void setHobbies() {
	page.locator("select#hobbies");
	}
	

 public void clickButton()
 {
	 page.locator(button_txt).click();
 }
	

}