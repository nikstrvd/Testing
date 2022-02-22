package com.tms.tests;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.CoursePage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StaffPage;
import com.tms.pages.VenuePage;

public class CoursePageTest extends BaseTest {

	private CoursePageTest() {
	}
	
	BasePage bp = new BasePage();
	CoursePage cp = new CoursePage();
	LoginPage lp = new LoginPage(); 
	DashboardPage dp = new DashboardPage(); 

	@Test
	public void AddnewCourseRecordTest(Map<String, String> data) {
		
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.Addnewrecord();
		  cp.EnterdetailInName(data.get("name1"));
		  cp.Selectcoursemodule();
		  cp.Coursetype();
		  cp.Selectcoursetype();		  
		  cp.EnterdetailInReferenceNumber(data.get("reference"));
		  cp.EnterdetailInSkill(data.get("Skill"));
		  cp.SelectModeofTraining1();
		  cp.SelectTrainers();
		  cp.ClickProgramType();
		  cp.ClickProgram();
		  cp.SelectProgramType();
		  bp.scroll2();
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Courses List - TMS");
	}

	@Test()
	public void EditCourseRecordTest(Map<String, String> data) {
		 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.Editrecord();
		  cp.EnterdetailInName(data.get("name1"));
		  cp.EnterdetailInReferenceNumber(data.get("reference"));
		  cp.EnterdetailInCoursecode(data.get("coursecode"));
		  cp.Selectcoursemodule();
		  cp.SelectTrainers();
		  bp.scroll2();
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Courses List - TMS");
	}
	
	@Test
	public void ViewCourseRunTest(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.ClickonViewCourseRunfromListDotsButton();
		  cp.Addnewrecord();
		  cp.Coursetype();
		  cp.Selectcoursetype();
		  cp.Assistenttrainer();
		  cp.SelectAssitent();
		  cp.Selectmodeoftraining();
		  cp.Selectoption();
		  cp.Courseprimatyvenue();
		  cp.Selectvenue();
		  cp.Scheduleinfo(data.get("Scheduleinfo"));
		  cp.Scheduleinfodesc(data.get("Scheduleinfodesc"));
		  cp.Coursevacdesc(data.get("Coursevacdesc"));
		  cp.Coursevacancycode();
		  cp.Selectcoursevacancycode();
		  cp.Scheduleinformation(data.get("Scheduleinformation"));
		  cp.Minintakesize(data.get("Minintakesize"));
		  cp.Maxintakesize(data.get("Maxintakesize"));
		  cp.Threshold(data.get("Threshold"));
		  cp.Publish();
		  cp.updaterecord();
		
	}
	
	@Test
	public void ClickonAddCourseRunButtonFromListDrop(Map<String, String> data)
	{
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.clickonListdotsButton();
		  cp.ClickonAddCourseRunfromListDotsButton();
		  cp.Coursetype();
		  cp.Selectcoursetype();
		  cp.Assistenttrainer();
		  cp.SelectAssitent();
		  cp.Selectmodeoftraining();
		  cp.Selectoption();
		  cp.Courseprimatyvenue();
		  cp.Selectvenue();
		  cp.Scheduleinfo(data.get("Scheduleinfo"));
		  cp.Scheduleinfodesc(data.get("Scheduleinfodesc"));
		  cp.Coursevacdesc(data.get("Coursevacdesc"));
		  cp.Coursevacancycode();
		  cp.Selectcoursevacancycode();
		  cp.Scheduleinformation(data.get("Scheduleinformation"));
		  cp.Minintakesize(data.get("Minintakesize"));
		  cp.Maxintakesize(data.get("Maxintakesize"));
		  cp.Threshold(data.get("Threshold"));
		  cp.Publish();
		  cp.updaterecord();
	}
	
	@Test
	public void AddnewCourseFromCoursemodule(Map<String, String> data) {
		
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonSubMenu(data.get("menuname"), data.get("submenu"));
		  cp.EnterdetailInName(data.get("name1"));
		  cp.EnterdetailInReferenceNumber(data.get("reference"));
		  cp.EnterdetailInCoursecode(data.get("coursecode"));
		  cp.Selectcoursemodule();
		  cp.SelectTrainers();
		  bp.scroll2();
		  cp.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Courses List - TMS");
	}
	
}
