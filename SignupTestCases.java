
package com.vittech.testecases;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.vittech.pages.Signup;
import com.vittech.testbase.TestBase;

public class SignupTestCases extends TestBase {
	
	
	@Test()
	public void Signup()
	{
		
		
		Page page = null;
		Signup lp = new Signup(page);
		
		lp.SignupPageUrl();
		lp.SignupTitle();
		lp.setUsername("Swati Chavan");
		lp.setEmail("swatimurkute1999@gmail.com");
		lp.setPassword("123456");
		lp.setCheckbox();
		lp.setCheckbox1();
		lp.setRadio();
		lp.setRadio1();
		lp.setState();
		lp.setHobbies();		
		lp.clickButton();
	}

}