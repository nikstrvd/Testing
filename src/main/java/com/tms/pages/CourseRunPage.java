package com.tms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;

import com.tms.enums.WaitStrategy;

public class CourseRunPage extends BasePage {
	
	
	private final By updateprofile = By.cssSelector(".btn.btn-primary.mar-r-10");
	private final By Coursetype = By.xpath("//select[@name='course_type']");
	private final By Selectcoursetype = By.xpath("//option[text()='non-WSQ']");
	private final By Assistenttrainer = By.xpath("//ul[@class='select2-selection__rendered']");
	private final By SelectAssitent = By.xpath("//li[text()='Nikhil Trivedi']");
	private final By Selectmodeoftraining = By.xpath("(//span[@class='select2-selection__rendered'])[2]");
	private final By Selectoption = By.xpath("//li[text()='Classroom']");
	private final By Scheduleinfo = By.id("schinfotype_code");
	private final By Scheduleinfodesc = By.id("schinfotype_desc");
	private final By Courseprimatyvenue = By.xpath("//span[@id='select2-venue_id-container']");
	private final By Selectvenue = By.xpath("//li[text()='AugustTesting AugustBuliding - 654321']");
	private final By Coursevacancycode = By.xpath("//select[@name='coursevacancy_code']");
	private final By Selectcoursevacancycode = By.xpath("//option[text()='Limited Vacancy']");
	private final By Coursevacdesc = By.id("coursevacancy_desc");
	private final By Scheduleinformation = By.id("sch_info");
	private final By Coursecode = By.id("course_code");
	private final By Minintakesize = By.id("minintakesize");
	private final By Maxintakesize = By.id("intakesize");
	private final By Threshold = By.id("threshold");
	private final By Publish = By.cssSelector(".custom-control.custom-switch.switch-success");
	private final By Viewcourserun = By.xpath("(//a[@data-original-title='View Course Run'])[1]");
	private final By Editcourserun = By.xpath("(//a[@data-original-title='Edit'])[1]");
	private final By Listdots = By.xpath("(//span[@class='list-dots'])[1]");
	private final By View = By.xpath("(//li[.='View'])[1]");
	private final By StudentList = By.xpath("(//li[.='Students List'])[1]");
	private final By Attendence = By.xpath("(//li[.='Attendance & Assessments'])[1]");
	private final By Editrecord = By.xpath("(//a[.='Edit'])[1]");	
		
	
	public void clickonListdotsButton()
	{
		click(Listdots, WaitStrategy.CLICKABLE, "listdotsclick button");
	}
	
	public void clickonViewFromListdotsButton()
	{
		click(View, WaitStrategy.CLICKABLE, "View button");
	}
	
	public void clickonStudentListFromListdotsButton()
	{
		click(StudentList, WaitStrategy.CLICKABLE, "StudentList button");
	}
	
	public void clickonAttendenceListFromListdotsButton()
	{
		click(Attendence, WaitStrategy.CLICKABLE, "Attendence button");
	}
	
	public void clickonEditrecordFromListdotsButton()
	{
		click(Editrecord, WaitStrategy.CLICKABLE, "Editrecord button");
	}
	
	public void Viewcourserun()
	{
		click(Viewcourserun, WaitStrategy.CLICKABLE, "Viewcourserun button");

	}
	
	public void Editcourserun()
	{
		click(Editcourserun, WaitStrategy.CLICKABLE, "Editcourserun button");

	}
	
	public void Coursetype()
	{
		click(Coursetype, WaitStrategy.CLICKABLE, "Coursetype button");

	}
	
	public void Selectcoursetype()
	{
		click(Selectcoursetype, WaitStrategy.CLICKABLE, "Selectcoursetype button");

	}
	
	public void Assistenttrainer()
	{
		click(Assistenttrainer, WaitStrategy.CLICKABLE, "Assistenttrainer button");

	}
	
	public void SelectAssitent()
	{
		click(SelectAssitent, WaitStrategy.CLICKABLE, "SelectAssitent button");

	}
	
	public void updaterecord()
	{
		click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
	}
	
	public void Selectmodeoftraining()
	{
		click(Selectmodeoftraining, WaitStrategy.CLICKABLE, "Selectmodeoftraining button");

	}
	
	public void Selectoption()
	{
		click(Selectoption, WaitStrategy.CLICKABLE, "Selectoption button");

	}
	
	public void Courseprimatyvenue()
	{
		click(Courseprimatyvenue, WaitStrategy.CLICKABLE, "Courseprimatyvenue button");

	}
	
	public void Selectvenue()
	{
		click(Selectvenue, WaitStrategy.CLICKABLE, "Selectvenue button");

	}
	
	public void Coursevacancycode()
	{
		click(Coursevacancycode, WaitStrategy.CLICKABLE, "Coursevacancycode button");

	}
	
	public void Selectcoursevacancycode()
	{
		click(Selectcoursevacancycode, WaitStrategy.CLICKABLE, "Selectcoursevacancycode button");

	}
	
	public void Publish()
	{
		click(Publish, WaitStrategy.CLICKABLE, "Publish button");

	}	
	
	public CourseRunPage Coursecode(String coursecode)
	{
		clear(Coursecode, coursecode, WaitStrategy.PRESENSE, "Coursecode Textbox field");
		sendKeys(Coursecode, coursecode, WaitStrategy.PRESENSE, "Coursecode Textbox field");
		return this;
	}
	
		
	public CourseRunPage Scheduleinfo(String scheduleinfo)
	{
		clear(Scheduleinfo, scheduleinfo, WaitStrategy.PRESENSE, "Scheduleinfo Textbox field");
		sendKeys(Scheduleinfo, scheduleinfo, WaitStrategy.PRESENSE, "Scheduleinfo Textbox field");
		return this;
	}
	
	public CourseRunPage Scheduleinfodesc(String scheduleinfodesc)
	{
		clear(Scheduleinfodesc, scheduleinfodesc, WaitStrategy.PRESENSE, "Scheduleinfodesc Textbox field");
		sendKeys(Scheduleinfodesc, scheduleinfodesc, WaitStrategy.PRESENSE, "Scheduleinfodesc Textbox field");
		return this;
	}
	
	public CourseRunPage Coursevacdesc(String coursevacdesc)
	{
		scroll();
		clear(Coursevacdesc, coursevacdesc, WaitStrategy.PRESENSE, "Coursevacdesc Textbox field");
		sendKeys(Coursevacdesc, coursevacdesc, WaitStrategy.PRESENSE, "Coursevacdesc Textbox field");
		return this;
	}
	
	public CourseRunPage Scheduleinformation(String scheduleinformation)
	{
		clear(Scheduleinformation, scheduleinformation, WaitStrategy.PRESENSE, "Scheduleinformation Textbox field");
		sendKeys(Scheduleinformation, scheduleinformation, WaitStrategy.PRESENSE, "Scheduleinformation Textbox field");
		return this;
	}
	
	public CourseRunPage Minintakesize(String minintakesize)
	{
		clear(Minintakesize, minintakesize, WaitStrategy.PRESENSE, "Minintakesize Textbox field");
		sendKeys(Minintakesize, minintakesize, WaitStrategy.PRESENSE, "Minintakesize Textbox field");
		return this;
	}
	
	public CourseRunPage Maxintakesize(String maxintakesize)
	{
		clear(Maxintakesize, maxintakesize, WaitStrategy.PRESENSE, "Maxintakesize Textbox field");
		sendKeys(Maxintakesize, maxintakesize, WaitStrategy.PRESENSE, "Maxintakesize Textbox field");
		return this;
	}
	
	public CourseRunPage Threshold(String threshold)
	{
		clear(Threshold, threshold, WaitStrategy.PRESENSE, "Threshold Textbox field");
		sendKeys(Threshold, threshold, WaitStrategy.PRESENSE, "Threshold Textbox field");
		return this;
	}

}
