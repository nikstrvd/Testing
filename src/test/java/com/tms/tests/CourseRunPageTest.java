package com.tms.tests;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.CoursePage;
import com.tms.pages.CourseRunPage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StaffPage;
import com.tms.pages.VenuePage;

public class CourseRunPageTest extends BaseTest {
	

	private CourseRunPageTest() {
	}
	
	LoginPage lp = new LoginPage(); 
	DashboardPage dp = new DashboardPage();
	CoursePage cp = new CoursePage();
	CourseRunPage cr = new CourseRunPage();
	BasePage bp = new BasePage();

	@Test()
	public void AllCourseRunRecordTest(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));		  
		  cr.clickonListdotsButton();
		  cr.clickonViewFromListdotsButton();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Courses Run View - TMS");
		  
	}
	
	@Test()
	public void ClickonStudentListfromAllCourseRunRecordTest(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));		  
		  cr.clickonListdotsButton();
		  cr.clickonStudentListFromListdotsButton();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Courses Run Student List - TMS");
		  
	}
	
	@Test()
	public void ClickonAssessmentAndAttendancefromAllCourseRunRecordTest(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));		  
		  cr.clickonListdotsButton();
		  cr.clickonAttendenceListFromListdotsButton();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Attendance Assessment List - Course Run - TMS");
		  
	}
	
	@Test()
	public void EditCourseRunRecordTest(Map<String, String> data) {
		
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cr.clickonListdotsButton();
		  cr.clickonEditrecordFromListdotsButton();
		  cr.Coursetype();
		  cr.Selectcoursetype();
		  cr.Assistenttrainer();
		  cr.SelectAssitent();
		  cr.Selectmodeoftraining();
		  cr.Selectoption();
		  cr.Courseprimatyvenue();
		  cr.Selectvenue();
		  cr.Scheduleinfo(data.get("Scheduleinfo"));
		  cr.Scheduleinfodesc(data.get("Scheduleinfodesc"));
		  cr.Coursevacdesc(data.get("Coursevacdesc"));
		  cr.Coursevacancycode();
		  cr.Selectcoursevacancycode();
		  cr.Scheduleinformation(data.get("Scheduleinformation"));
		  cr.Minintakesize(data.get("Minintakesize"));
		  cr.Maxintakesize(data.get("Maxintakesize"));
		  cr.Threshold(data.get("Threshold"));
		  cr.Publish();
		  cr.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "All Course Runs - TMS");
	}
	
	@Test()
	public void CompletedCourseRunRecordTest(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));		  
		  cr.clickonListdotsButton();
		  cr.clickonViewFromListdotsButton();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "All Completed Course Runs - TMS");
		  
	}
	
	@Test()
	public void ClickonCompletedStudentListfromAllCourseRunRecordTest(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));		  
		  cr.clickonListdotsButton();
		  cr.clickonStudentListFromListdotsButton();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "All Completed Course Runs - TMS");
		  
	}
	
	@Test()
	public void ClickonCompletedAssessmentAndAttendancefromAllCourseRunRecordTest(Map<String, String> data) {
		   
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));		  
		  cr.clickonListdotsButton();
		  cr.clickonAttendenceListFromListdotsButton();
		 bp.scroll2();
		  String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "All Completed Course Runs - TMS");
		  
	}
	
	@Test()
	public void EditCompletedCourseRunRecordTest(Map<String, String> data) {
		
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cr.clickonListdotsButton();
		  cr.clickonEditrecordFromListdotsButton();
		  cr.Coursetype();
		  cr.Selectcoursetype();
		  cr.Assistenttrainer();
		  cr.SelectAssitent();
		  cr.Selectmodeoftraining();
		  cr.Selectoption();
		  cr.Courseprimatyvenue();
		  cr.Selectvenue();
		  cr.Scheduleinfo(data.get("Scheduleinfo"));
		  cr.Scheduleinfodesc(data.get("Scheduleinfodesc"));
		  cr.Coursevacdesc(data.get("Coursevacdesc"));
		  cr.Coursevacancycode();
		  cr.Selectcoursevacancycode();
		  cr.Scheduleinformation(data.get("Scheduleinformation"));
		  cr.Minintakesize(data.get("Minintakesize"));
		  cr.Maxintakesize(data.get("Maxintakesize"));
		  cr.Threshold(data.get("Threshold"));
		  cr.Publish();
		  cr.updaterecord();
		  String ActualTitle = lp.getTitle();
			Assert.assertEquals(ActualTitle, "All Completed Course Runs - TMS");
	}
}
