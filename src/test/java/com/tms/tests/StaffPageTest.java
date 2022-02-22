package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StaffPage;

public class StaffPageTest extends BaseTest {

	private StaffPageTest() { }
	
	  @Test 
	  public void AddnewRecordTest(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  StaffPage sp = new StaffPage();
		  sp.Addnewrecord();
		  sp.EnterdetailInName(data.get("name"));
		  sp.EnterdetailInEmail(data.get("email"));
		  sp.EnterdetailInPhonenumber(data.get("phonenumber"));
		  sp.ClickonStatus();
		  sp.ClickonTimezone();
		  sp.ClickonTimezoneSelection();
		  sp.updaterecord();
		  Assert.assertTrue(true);
		  Assert.assertEquals(lp.getTitle(), "Staff Users - TMS");
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Staff Users - TMS");
		 
  
	  }	
	  
	  @Test 
	  public void EditRecordTest(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  StaffPage sp = new StaffPage();
		  sp.Editrecord();
		  sp.EnterdetailInName(data.get("name"));
		  sp.EnterdetailInPhonenumber(data.get("phonenumber"));
		  sp.ClickonStatus();
		  sp.ClickonTimezone();
		  sp.ClickonTimezoneSelection();
		  sp.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Staff Users - TMS");
  
	  }	
}
