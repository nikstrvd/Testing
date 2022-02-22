package com.tms.pages;

import org.openqa.selenium.By;
import com.tms.enums.WaitStrategy;

public final class LoginPage extends BasePage {

	private final By textUsername = By.id("email");
	private final By textPassword = By.id("password");
	private final By buttonLogin = By.xpath("//button");
	private final By forgetpassword = By.xpath("//a[text()=' Forgot password?']");
	private final By resetbutton = By.xpath("//button[@type='submit']");
	private final By forgetpasswordvalidation = By.cssSelector(".col-md-12.alert.alert-success");
	private final By forgetpassword2 = By.xpath("//li[.=\"We can't find a user with that email address.\"]");
	private final By forgetpassword3 = By.xpath("//li[.='The email must be a valid email address.']");
	private final By logindata = By.xpath("//li[.='The email field is required.']");
	private final By logindata1 = By.xpath("//li[.='The password field is required.']");
	private final By logindata2 = By.xpath("//li[.='These credentials do not match our records.']");
	
	
	public void CheckLoginvalidation()
	{
		click(logindata, WaitStrategy.PRESENSE, "logindata message");
	}
	
	public void CheckLoginvalidation1()
	{
		click(logindata1, WaitStrategy.PRESENSE, "logindata message");
	}
	
	public void CheckLoginvalidation2()
	{
		click(logindata2, WaitStrategy.PRESENSE, "logindata message");
	}
	
	public void Checkvalidation()
	{
		click(forgetpasswordvalidation, WaitStrategy.PRESENSE, "forgetpasswordvalidation message");
	}
	
	public void Checkvalidation1()
	{
		click(forgetpassword2, WaitStrategy.PRESENSE, "forgetpasswordvalidation message");
	}
	
	public void Checkvalidation2()
	{
		click(forgetpassword3, WaitStrategy.PRESENSE, "forgetpasswordvalidation message");
	}
	
	
	public LoginPage enterUserName(String username)
	{
		sendKeys(textUsername, username, WaitStrategy.PRESENSE, "Username Field");
		return this;
	}
	
	public LoginPage enterPassword(String password)
	{
		sendKeys(textPassword, password, WaitStrategy.PRESENSE, "Password Field");
		return this;
	}
	
	public DashboardPage clickLogin()
	{
		click(buttonLogin, WaitStrategy.CLICKABLE, "Login Button");
		return new DashboardPage();
	}
	
	public void ForgetPassword()
	{
		click(forgetpassword, WaitStrategy.CLICKABLE, "Click on ForgetPassword Link");
	}
	
	public void EnterForgetPasswordEmail(String username)
	{
		sendKeys(textUsername, username, WaitStrategy.PRESENSE, "Username Field");
	}	
	
	public void clickReset()
	{
		click(resetbutton, WaitStrategy.CLICKABLE, "Reset Button");
	}

	
	public String getTitle()
	{
		return getPageTitle();
	}	
}
