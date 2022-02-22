package com.tms.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tms.pages.BasePage;
import com.tms.pages.DashboardPage;
import com.tms.pages.LoginPage;
import com.tms.pages.StaffPage;
import com.tms.pages.VenuePage;

public class VenuePageTest extends BaseTest {

	private VenuePageTest() {
	}
	
	LoginPage lp = new LoginPage();
	DashboardPage dp = new DashboardPage();
	VenuePage vp = new VenuePage();
	BasePage bp = new BasePage();

	@Test
	public void AddnewVenueRecordTest(Map<String, String> data) {
		
		LoginPage lp = new LoginPage();
		DashboardPage dp = new DashboardPage();
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		new DashboardPage().clickonMenu(data.get("menuname"));
		vp.Addnewrecord();
		vp.EnterdetailInBlock(data.get("Block"));
		vp.EnterdetailInStreet(data.get("Street"));
		vp.EnterdetailInFloor(data.get("Floor"));
		vp.EnterdetailInUnit(data.get("Unit"));
		vp.EnterdetailInBuilding(data.get("Building"));
		vp.EnterdetailInRoom(data.get("Room"));
		vp.EnterdetailInPostalcode(data.get("Postalcode"));
		vp.ClickonStatus();
		vp.ClickonWheelchairaccess();
		vp.updaterecord();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Venues - TMS");
	}

	@Test
	public void EditVenueRecordTest(Map<String, String> data) {
		
		DashboardPage title = lp.enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
		new DashboardPage().clickonMenu(data.get("menuname"));
		bp.Horizonatalscroll();
		vp.clickonListdotsButton();
		vp.Editrecord();
		vp.EnterdetailInBlock(data.get("Block"));
		vp.EnterdetailInStreet(data.get("Street"));
		vp.EnterdetailInFloor(data.get("Floor"));
		vp.EnterdetailInUnit(data.get("Unit"));
		vp.EnterdetailInBuilding(data.get("Building"));
		vp.EnterdetailInRoom(data.get("Room"));
		vp.EnterdetailInPostalcode(data.get("Postalcode"));
		vp.ClickonStatus();
		vp.ClickonWheelchairaccess();
		vp.updaterecord();
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, "Venues - TMS");
	}
}
