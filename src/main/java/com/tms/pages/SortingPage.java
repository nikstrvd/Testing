package com.tms.pages;

import org.openqa.selenium.By;
import com.tms.enums.WaitStrategy;

public class SortingPage extends BasePage {
	
	private final By Studentname = By.xpath("//tr/th[2]");
	private final By NRIC = By.xpath("//tr/th[3]");
	private final By Email = By.xpath("//tr/th[4]");
	private final By Coursecode = By.xpath("//tr/th[5]");
	private final By Status = By.xpath("//tr/th[6]");
	
	public void clickonStudnetnamecolumnheader()
	{
		click(Studentname, WaitStrategy.CLICKABLE, "Studentname Columnheader");
	}
	
	public void ClickonNRICColumnHeader()
	{
		click(NRIC, WaitStrategy.CLICKABLE, "NRIC Columnheader");
	}
	
	public void ClickonEmailColumnHeader()
	{
		click(Email, WaitStrategy.CLICKABLE, "Email Columnheader");
	}
	
	public void ClickonCourseCodeColumnHeader() {
	
		click(Coursecode, WaitStrategy.CLICKABLE, "Coursecode Columnheader");
	}
	
	public void ClickonStatusColumnHeader()
	{
		click(Status, WaitStrategy.CLICKABLE, "Status Columnheader");
	}

	public void ClickonStudentcolumnheadertoSorting()
	{
		sortinglist();
	}
	
	public void ClickonNRICColumnHeadertoSorting()
	{
		sortinglist1();
	}
	
	public void ClickonEmailColumnHeadertoSorting()
	{
		sortinglist2();
	}
	
	public void ClickonCourseCodeColumnHeadertoSorting()
	{
		sortinglist3();
	}
	
	
	

}
