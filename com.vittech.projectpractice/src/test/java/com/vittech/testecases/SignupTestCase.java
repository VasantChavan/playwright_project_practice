
package com.vittech.testecases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vittech.pages.Signup;
import com.vittech.testbase.TestBase;

public class SignupTestCase extends TestBase {
	
	
	@Test(priority=1)
public void verifySignupPageTitleTest() {
	String actual_Title = sp.getSignPageTitle();
	Assert.assertEquals(actual_Title, "Learn Automation Courses");
}
@Test(priority=2)
public void verifyLoginPageURLTest() {
	String actual_URL=sp.getSignPageURL();
	Assert.assertEquals(actual_URL, "https://freelance-learn-automation.vercel.app/signup");
	
}
	@Test()
	public void Signup()
	{
				
		Signup sp = new Signup(page);
		
		sp.getSignPageTitle();
		sp.getSignPageURL();
		sp.setUsername("Swati");
		sp.setEmail("swatimurkute1999@gmail.com");
		sp.setPassword("123456");
		sp.clickCheckbox();
		sp.clickCheckbox1();
		sp.clickRadio();
		sp.clickRadio1();
		sp.selectState();
		sp.selectHobbies();		
		sp.clickButton();
	}

}