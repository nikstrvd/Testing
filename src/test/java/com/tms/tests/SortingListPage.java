package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.SortingPage;
import com.tms.pages.StudentEnrollmentPage;

public class SortingListPage extends BaseTest {

	private SortingListPage() { }
	  
	  @Test
	  public void SortingStudentEnrollmentGridList(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  SortingPage sp = new SortingPage();
		  sp.clickonStudnetnamecolumnheader();
		  sp.ClickonStudentcolumnheadertoSorting();
	  }	
	  
	  @Test
	  public void SortingNRICColumnHeaderGridList(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  SortingPage sp = new SortingPage();
		  sp.clickonStudnetnamecolumnheader();
		  sp.ClickonNRICColumnHeadertoSorting();
	  }
	  
	  @Test
	  public void EmailColumnHeadertoSortingGridList(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  SortingPage sp = new SortingPage();
		  sp.clickonStudnetnamecolumnheader();	
		  sp.ClickonEmailColumnHeadertoSorting();
	  }
	  
	  @Test
	  public void CourseCodeColumnHeadertoSortingGridList(Map<String, String> data) 
	  { 
		  LoginPage lp = new LoginPage(); 
		  DashboardPage dp = new DashboardPage(); 
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  SortingPage sp = new SortingPage();
		  sp.clickonStudnetnamecolumnheader();
		  sp.ClickonCourseCodeColumnHeadertoSorting();
	  }
	  
	  
}
