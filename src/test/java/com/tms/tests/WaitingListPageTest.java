package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.CourseSoftBookingsPage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.TrainerPage;
import com.tms.pages.WaitingListPage;

public class WaitingListPageTest extends BaseTest {

	private WaitingListPageTest() { }
	
	LoginPage lp = new LoginPage(); 
	  DashboardPage dp = new DashboardPage(); 
	  CourseSoftBookingsPage cp = new CourseSoftBookingsPage();
	  BasePage bp = new BasePage();
	  WaitingListPage wp = new WaitingListPage();
	
	
	  @Test 
	  public void AddnewWaitingListRecordTest(Map<String, String> data) 
	  { 
		  
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu")); 
		  wp.Addnewrecord();
		  wp.SelectCourseRun();
		  wp.selectcourserunfromdropdown();
		  //cp.EnterdetailInDeadlinedate(data.get("Deadline Date"));
		  wp.EnterdetailInName(data.get("Name2"));
		  wp.EnterdetailInContactnumber(data.get("Contact Number"));
		  bp.scroll();
		  wp.EnterdetailInEmail(data.get("Email1"));
		  wp.EnterdetailInNric(data.get("Nric"));
		  wp.Status1();
		  wp.Selectstatus();
		  wp.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "Waiting List Course - TMS");
  
	  }	
	  
	  @Test
	  public void EditWaitingListRecordTest(Map<String, String> data) 
	  { 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  wp.clickonListdotsButton();
		  wp.Editrecord();
		  wp.SelectCourseRun();
		  wp.selectcourserunfromdropdown();
		  wp.EnterdetailInName1(data.get("Name2"));
		  wp.EnterdetailInContactnumber1(data.get("Contact Number"));
		  bp.scroll();
		  wp.EnterdetailInEmail1(data.get("Email1"));
		  wp.EnterdetailInNric1(data.get("Nric"));
		  wp.Status();
		  wp.Selectstatus();
		  wp.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "Waiting List Course - TMS");
  
	  }	
}
