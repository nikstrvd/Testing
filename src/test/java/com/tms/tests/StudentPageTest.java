package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StudentsPage;

public class StudentPageTest extends BaseTest{
	
	private StudentPageTest() {}
	
	LoginPage lp = new LoginPage(); 
	DashboardPage dp = new DashboardPage(); 
	StudentsPage sp = new StudentsPage();
	BasePage bp = new BasePage();
	
	@Test
	public void ClickonViewStudentListPage(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		dp.clickonMenu(data.get("menuname"));
		sp.viewaction();
		String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");
	}

	@Test
	public void ClickonCloseStudentListPage(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		dp.clickonMenu(data.get("menuname"));
		sp.viewaction();	
		sp.Close();
		String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");
	}
}
