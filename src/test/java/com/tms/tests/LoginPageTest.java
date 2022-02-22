package com.tms.tests;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;

public final class LoginPageTest extends BaseTest {
	
	private LoginPageTest()
	{
		
	}
	
	@Test
	public void forgetpasswordlinktest(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		lp.ForgetPassword();
		lp.EnterForgetPasswordEmail(data.get("username"));
		lp.clickReset();
		lp.Checkvalidation1();
		lp.clickLogin();
	}
	
	@Test
	public void forgetpasswordlinktest1(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		lp.ForgetPassword();
		lp.EnterForgetPasswordEmail(data.get("username"));
		lp.clickReset();
		lp.Checkvalidation();
		lp.clickLogin();
	}
	
	@Test
	public void forgetpasswordlinktest2(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		lp.ForgetPassword();
		lp.EnterForgetPasswordEmail(data.get("username"));
		lp.clickReset();
		lp.Checkvalidation2();
		lp.clickLogin();
	}
	
	@Test
	public void loginlogouttest2(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		lp.CheckLoginvalidation();
	}
	
	@Test
	public void loginlogouttest3(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		lp.CheckLoginvalidation1();
	}
	
	@Test
	public void loginlogouttest4(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		lp.CheckLoginvalidation2();
	}
	
	@Test
	public void loginlogouttest(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
	}
	
	@Test
	public void loginlogouttest1(Map<String, String> data)
	{
		
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		String title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin().clickSuperAdmin().clickLogout().getTitle();
		
		Assertions.assertThat(title).isEqualTo("Login - TMS");
	}
	
	@DataProvider(name="LoginTestDataProvider", parallel=true)
	public Object [][] getData()
	{	
		return new Object[][]
		{
			{"superadmin@mail.com", ""},
			{"superadmin@mail.com", "      "},
			{"superadmin@mail.com", "12345632"},
			{"", "123456"},
			{"      ", "123456"},
			{"test@test.com", "123456"},
			{"superadmin@mail.com", "123456"}
		};
}
}


