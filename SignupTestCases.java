
package com.vittech.testecases;

import org.testng.annotations.Test;

import com.vittech.pages.Signup;
import com.vittech.testbase.TestBase;

public class SignupTestCases extends TestBase {
	
	
	@Test()
	public void Signup()
	{
		
		
		Signup sp = new Signup(page);
		
		sp.getSignPageTitle();
		sp.getSignPageURL();
		sp.setUsername("Swati Chavan");
		sp.setEmail("swatimurkute1999@gmail.com");
		sp.setPassword("123456");
		sp.setCheckbox();
		sp.setCheckbox1();
		sp.setRadio();
		sp.setRadio1();
		sp.setState();
		sp.setHobbies();		
		sp.clickButton();
	}

}
