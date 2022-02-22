package com.tms.pages;

import org.openqa.selenium.By;
import com.tms.enums.WaitStrategy;

public class DashboardPage extends BasePage{

	private final By linkSuperadmin = By.cssSelector(".mdi.mdi-chevron-down");
	private final By linkLogout = By.xpath("//a[text()=' Logout']");
	private final By changepassword = By.xpath("//a[text()=' Change Password']");
	private final By oldpassword = By.id("old_password");
	private final By newpassword = By.id("new_password");
	private final By confirmnewpassword = By.id("confirm_new_password");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.px-4.float-right");
	private final By cancelprofile = By.cssSelector(".btn.btn-danger");
	private final By Viewallbtn = By.xpath("(//a[text()='View All'])[1]");
	private final By Viewallbtn1 = By.xpath("(//a[text()='View All'])[2]");
	private final By listdotsclick = By.xpath("(//span[@class='list-dots'])[1]");
	private final By listdotsforCourserun = By.xpath("(//span[@class='list-dots'])[6]");
	private final By view = By.xpath("(//i[@class='fas fa-eye font-16'])[1]");
	private final By view1 = By.xpath("(//i[@class='fas fa-eye font-16'])[6]");
	private final By Studentlist = By.xpath("(//a[text()='Students List'])[1]");
	private final By Attendance = By.xpath("(//i[@class='fas fa-eye font-16'])[8]");
	private final By Edit = By.xpath("(//i[@class='fas fa-pencil-alt font-16'])[1]");
	private final By Edit1 = By.xpath("(//i[@class='fas fa-pencil-alt font-16'])[6]");
	
	public void clickonListdotsButtonforNewStudentList()
	{
		click(listdotsclick, WaitStrategy.CLICKABLE, "listdotsclick button");
	}
	
	public void clickonViewbuttonfromListdotsButtonforNewStudentList()
	{
		click(view, WaitStrategy.CLICKABLE, "view button");
	}	
		
	public void clickonEditbuttonfromListdotsButtonforNewStudentList()
	{
		click(Edit, WaitStrategy.CLICKABLE, "Edit button");
	}
	
	public void clickonListdotsButtonforUpcomingCourseRun()
	{
		click(listdotsforCourserun, WaitStrategy.CLICKABLE, "listdotsforCourserun button");
	}
	
	public void clickonAttendanceButtonListdotsButtonforUpcomingCourseRun()
	{
		click(Attendance, WaitStrategy.CLICKABLE, "Attendance button");
	}
	
	public void clickonStudentlistButtonListdotsButtonforUpcomingCourseRun()
	{
		click(Studentlist, WaitStrategy.CLICKABLE, "Studentlist button");
	}
	
	public void clickonEditButtonListdotsButtonforUpcomingCourseRun()
	{
		click(Edit1, WaitStrategy.CLICKABLE, "Edit1 button");
	}
	
	public void clickonViewButtonListdotsButtonforUpcomingCourseRun()
	{
		click(view1, WaitStrategy.CLICKABLE, "view1 button");
	}
	public void clickonViewAllButtonforNewStudentList()
	{
		click(Viewallbtn, WaitStrategy.CLICKABLE, "Viewallbtn button");
	}
	
	public void clickonViewAllButtonforUpcomingCourseRun()
	{
		click(Viewallbtn1, WaitStrategy.CLICKABLE, "Viewallbtn1 button");
	}
		
	
	public void clickonMenu(String menu)
	{
		String menupath = "//a[text()='"+menu+"']";
		click(By.xpath(menupath), WaitStrategy.CLICKABLE, menu);
	}
	
	public void clickonSubMenu(String submenu, String submenu1)
	{
		String menupath = "//ul[@class='nav metismenu in mm-show']//i//following-sibling::span[text()='"+submenu+"']";
		click(By.xpath(menupath), WaitStrategy.CLICKABLE, submenu);
		String menupath1 = "//ul[@class='nav metismenu in mm-show']//i//following-sibling::span[text()='"+submenu+"']/ancestor::a/following-sibling::ul/li/a[text()='"+submenu1+"']";
		click(By.xpath(menupath1), WaitStrategy.CLICKABLE, submenu1);
		
	}
	
	public void clickonLoggedinUserDropdownlist()
	{
		click(linkSuperadmin, WaitStrategy.CLICKABLE, "Super Admin button");
	}
	
	public void clickonChangepassword()
	{
		click(changepassword, WaitStrategy.CLICKABLE, "Changepassword button");
	}
	
	public DashboardPage oldpassword(String oldpassword1)
	{
		sendKeys(oldpassword, oldpassword1, WaitStrategy.PRESENSE, "Oldpassword Field");
		return this;
	}
	
	public DashboardPage newpassword(String newpassword1)
	{
		sendKeys(newpassword, newpassword1, WaitStrategy.PRESENSE, "Newpassword Field");
		return this;
	}
	
	public DashboardPage confirmpassword(String confirmpassword)
	{
		sendKeys(confirmnewpassword, confirmpassword, WaitStrategy.PRESENSE, "Confirmpassword Field");
		return this;
	}
	
	public void updatepassword()
	{
		click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
	}
	
	public void cancelpassword()
	{
		click(cancelprofile, WaitStrategy.CLICKABLE, "Cancel button");
	}	
		
	public DashboardPage clickSuperAdmin()
	{

		click(linkSuperadmin, WaitStrategy.CLICKABLE, "SuperAdmin Button");
		return this;
	}
	
	public LoginPage clickLogout()
	{
		
		click(linkLogout, WaitStrategy.CLICKABLE, "Logout Button");
		return new LoginPage();
	}
	
	
}
