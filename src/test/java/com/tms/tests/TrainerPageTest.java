package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.TrainerPage;

public class TrainerPageTest extends BaseTest {

	private TrainerPageTest() { }
	
	
	  @Test 
	  public void AddnewTrainerRecordTest(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  TrainerPage tp = new TrainerPage();
		  tp.Addnewrecord();
		  tp.EnterdetailInName(data.get("name"));
		  tp.EnterdetailInEmail(data.get("email"));
		  tp.EnterdetailInPhonenumber(data.get("phonenumber"));
		  tp.EnterdetailInExperience(data.get("Experience"));
		  tp.EnterdetailInLinkedin(data.get("linkedIn URL"));
		  tp.selectLevel();
		  tp.selectValue();
		  tp.selectStatus();
		  tp.ClickonTimezone();
		  tp.ClickonTimezoneSelection();
		  tp.EnterdetailInDescrption(data.get("Description"));
		  tp.EnterdetailInDomain(data.get("Domain Area of Practice"));
		  tp.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Trainers - TMS");
  
	  }	
	  
	  @Test
	  public void EditTrainerRecordTest(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  TrainerPage tp = new TrainerPage();
		  tp.Editrecord();
		  tp.EnterdetailInName(data.get("name"));
		  tp.EnterdetailInPhonenumber(data.get("phonenumber"));
		  tp.EnterdetailInExperience(data.get("Experience"));
		  tp.EnterdetailInLinkedin(data.get("linkedIn URL"));
		  tp.selectLevel();
		  tp.selectValue();
		  tp.selectStatus();
		  tp.ClickonTimezone();
		  tp.ClickonTimezoneSelection();
		  tp.EnterdetailInDescrption(data.get("Description"));
		  tp.EnterdetailInDomain(data.get("Domain Area of Practice"));
		  tp.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Trainers - TMS");
  
	  }	
}
