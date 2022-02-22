package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.CourseSoftBookingsPage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.TrainerPage;

public class CourseSoftBookingsPageTest extends BaseTest {

	private CourseSoftBookingsPageTest() { }
	
	LoginPage lp = new LoginPage(); 
	  DashboardPage dp = new DashboardPage(); 
	  CourseSoftBookingsPage cp = new CourseSoftBookingsPage();
	  BasePage bp = new BasePage();
	
	
	  @Test 
	  public void AddnewCourseSoftBookingsRecordTest(Map<String, String> data) 
	  { 
		  
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu")); 
		  cp.Addnewrecord();
		  cp.SelectCourseRun();
		  cp.selectcourserunfromdropdown();
		  //cp.EnterdetailInDeadlinedate(data.get("Deadline Date"));
		  cp.EnterdetailInName(data.get("Name2"));
		  cp.EnterdetailInContactnumber(data.get("Contact Number"));
		  bp.scroll();
		  cp.EnterdetailInEmail(data.get("Email1"));
		  cp.EnterdetailInNric(data.get("Nric"));
		  cp.Status1();
		  cp.Selectstatus();
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "Soft Booking Course - TMS");
  
	  }	
	  
	  @Test
	  public void EditCourseSoftBookingsRecordTest(Map<String, String> data) 
	  { 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.Editrecord();
		  cp.SelectCourseRun();
		  cp.selectcourserunfromdropdown();
		  cp.EnterdetailInDeadlinedate(data.get("Deadline Date"));
		  cp.EnterdetailInName1(data.get("Name2"));
		  cp.EnterdetailInContactnumber1(data.get("Contact Number"));
		  bp.scroll();
		  cp.EnterdetailInEmail1(data.get("Email1"));
		  cp.EnterdetailInNric1(data.get("Nric"));
		  cp.Status();
		  cp.Selectstatus();
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "Soft Booking Course - TMS");
  
	  }	
}
