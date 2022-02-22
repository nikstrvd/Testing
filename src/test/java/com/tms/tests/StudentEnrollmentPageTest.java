package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StudentEnrollmentPage;

public class StudentEnrollmentPageTest extends BaseTest {

	private StudentEnrollmentPageTest() { }
	
	LoginPage lp = new LoginPage(); 
	DashboardPage dp = new DashboardPage(); 
	StudentEnrollmentPage se = new StudentEnrollmentPage();
	BasePage bp = new BasePage();
	
	@Test
	  public void AddStudentEnrollmentRecordTest(Map<String, String> data) 
	  { 
		  
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  se.Addrecord();
		  se.selectSession();
		  se.selectsessionfromdropdown();
		  se.selectSponsered();
		  se.selectSponseredfromdropdown();
		  se.EnterdetailIncompanysme(data.get("Company SME"));
		  se.selectnationality();
		  se.selectnationalitydropdown();
		  se.EnterdetailInAge(data.get("Age"));
		  se.EnterdetailInName(data.get("Name3"));
		  se.EnterdetailInNric(data.get("Nric"));
		  se.EnterdetailInemail(data.get("Email"));
		  se.EnterdetailInmobileno(data.get("Mobile No"));
		  se.EnterdetailIndob(data.get("Date Of Birth"));
		  se.selecteducation();
		  se.selecteducationdropdown();
		  se.selectdesignation();
		  se.selectdesignationdropdown();
		  se.selectsalary();
		  se.selectsalarydropdown();
		  se.EnterdetailIncompanyname(data.get("Company Name"));
		  se.EnterdetailIncompanycontactperson(data.get("Company Contact Person"));
		  se.EnterdetailIncompanycontactpersonemail(data.get("Company Contact Person Email"));
		  se.EnterdetailIncompanycontactpersonnumber(data.get("Company Contact Person Number"));
		  bp.scroll3();
		  se.EnterdetailInbillingmail(data.get("Billing Email"));
		  se.EnterdetailInbillingzip(data.get("Billing Zip"));
		  se.EnterdetailInbillingaddress(data.get("Billing Address"));
		  se.selectbillingcounty();
		  se.selectbillingcountydropdown();
		  se.EnterdetailInRemark(data.get("Remarks"));
		  se.EnterdetailInPaymentamount(data.get("Payment Amount"));
		  se.selectpaymentstatus();
		  se.selectpaymentstatusdropdown();
		  se.EnterdetailInMealrestriction(data.get("Meal Restrictions"));
		  se.EnterdetailInMealrestrictiontype(data.get("Meal Restrictions Type"));
		  se.EnterdetailIncomputernavskill(data.get("Computer Navigation Skill"));
		  se.EnterdetailIncoursebroucher(data.get("Course Brochure Determined"));
		  se.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");
	  }	
	  
	
	@Test
	  public void EditStudentEnrollmentRecordTest(Map<String, String> data) 
	  { 
		  
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  se.clickonListdotsButton();
		  se.Editrecord();
		  se.selectSponsered();
		  se.selectSponseredfromdropdown();
		  se.EnterdetailIncompanysme(data.get("Company SME"));
		  se.selectnationality();
		  se.selectnationalitydropdown();
		  se.EnterdetailInAge(data.get("Age"));
		  se.selectlearningmode();
		  se.selectlearningmodedropdown();
		  se.EnterdetailInemail(data.get("Email"));
		  se.EnterdetailInmobileno(data.get("Mobile No"));
		  se.EnterdetailIndob(data.get("Date Of Birth"));
		  se.selecteducation();
		  se.selecteducationdropdown();
		  se.selectdesignation();
		  se.selectdesignationdropdown();
		  se.selectsalary();
		  se.selectsalarydropdown();
		  se.EnterdetailIncompanyname(data.get("Company Name"));
		  se.EnterdetailIncompanycontactperson(data.get("Company Contact Person"));
		  se.EnterdetailIncompanycontactpersonemail(data.get("Company Contact Person Email"));
		  se.EnterdetailIncompanycontactpersonnumber(data.get("Company Contact Person Number"));
		  bp.scroll3();
		  se.EnterdetailInbillingmail(data.get("Billing Email"));
		  se.EnterdetailInbillingzip(data.get("Billing Zip"));
		  se.EnterdetailInbillingaddress(data.get("Billing Address"));
		  se.selectbillingcounty();
		  se.selectbillingcountydropdown();
		  se.EnterdetailInRemark(data.get("Remarks"));
		  se.EnterdetailInPaymentamount(data.get("Payment Amount"));
		  se.selectpaymentstatus();
		  se.selectpaymentstatusdropdown();
		  se.EnterdetailInMealrestriction(data.get("Meal Restrictions"));
		  se.EnterdetailInMealrestrictiontype(data.get("Meal Restrictions Type"));
		  se.EnterdetailIncomputernavskill(data.get("Computer Navigation Skill"));
		  se.EnterdetailIncoursebroucher(data.get("Course Brochure Determined"));
		  se.updaterecord();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");
	  }	
	 
	@Test
	  public void ViewStudentEnrollmentRecordTest(Map<String, String> data) 
	  { 
		  
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  se.clickonListdotsButton();
		  se.View();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Student Enrolment - TMS");
	  }	
	
	@Test
	  public void ViewPaymentStudentEnrollmentRecordTest(Map<String, String> data) 
	  { 
		  
		  DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		  dp.clickonMenu(data.get("menuname"));
		  se.clickonListdotsButton();
		  se.Viewpayments();
		  String ActualTitle = lp.getTitle();
		  Assert.assertEquals(ActualTitle, "Student Enrolment List - TMS");
	  }	
	  
}
