package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.SignIn;



public class SignInPageTest extends TestBase
{

	SignIn Sin;
	
	public SignInPageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		
		initialization();
		Sin=new SignIn();
		
	}

	

	@Test(priority = 3)
	public void ClickOnSignInButtonTest()
	{
		Sin.signIn();
		Sin.validateLogo();
		
		
	}
	
@Test(priority = 2)

public void titleTest()
{
	
	String title=Sin.validateTitle();
    Assert.assertEquals(title, "Amazon Sign In");
}
	 
	@Test(priority = 1)
	public void enterUserDetailsTest()
	{
		Sin.signIn();
		Sin.signInuser(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
