package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SignIn extends TestBase
{

	@FindBy(xpath="//*[contains(text(),'Hello, sign in')]")
	WebElement signin;
	
	@FindBy(xpath="//*[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//*[@id='signInSubmit']")
	WebElement signIn;
	
	@FindBy(xpath="//*[@role='img']")
	WebElement logo;
	
	
	
	public SignIn()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Action
	
	public String validateTitle()
	{
		return driver.getTitle();
		
	}
	
	
	
	public void signIn()
	{
		signin.click();
		
	}
	
	public boolean validateLogo()
	{
		return logo.isDisplayed();
		
	}
	
	public void signInuser(String un,String pwd)
	{
		email.sendKeys(un);
		submit.click();
		password.sendKeys(pwd);
		
	
		
	
	}
	
}
