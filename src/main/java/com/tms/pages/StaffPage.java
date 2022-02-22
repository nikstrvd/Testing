package com.tms.pages;

import org.openqa.selenium.By;

import com.tms.enums.WaitStrategy;

public class StaffPage extends BasePage {
	
	private final By Addnew = By.xpath("//a[text()=' Add New']");
	private final By Editrecord = By.xpath("(//i[@class='fas fa-pencil-alt text-info font-16'])[3]");
	private final By name = By.xpath("//input[@name='name']");
	private final By email = By.xpath("//input[@name='email']");
	private final By phonenumber = By.xpath("//input[@name='phone_number']");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.mar-r-10");
	private final By cancelprofile = By.cssSelector(".btn.btn-danger");
	private final By Status = By.cssSelector(".custom-control.custom-switch.switch-success");
	private final By Timezone = By.id("select2-timezone-container");
	private final By Timezoneselection = By.xpath("//ul[@class='select2-results__options']/li[.='(UTC +08:00) Asia/Singapore']");
	private final By validation = By.xpath("//label[.='The email has already been taken.']");
	
	public void Checkvalidation()
	{
		click(validation, WaitStrategy.PRESENSE, "Validatiob message");
	}
	public void Addnewrecord()
	{
		click(Addnew, WaitStrategy.CLICKABLE, "Add New button");

	}
	
	public void Editrecord()
	{
		click(Editrecord, WaitStrategy.CLICKABLE, "Editrecord button");

	}
	
	public void ClickonTimezone()
	{
		click(Timezone, WaitStrategy.CLICKABLE, "Timezone button");

	}
	
	public void ClickonTimezoneSelection()
	{
		click(Timezoneselection, WaitStrategy.CLICKABLE, "Timezoneselection button");

	}
	
	public void ClickonStatus()
	{
		click(Status, WaitStrategy.CLICKABLE, "Status button");

	}
	
	public StaffPage EnterdetailInName(String Name)
	{
		clear(name, Name, WaitStrategy.PRESENSE, "Name Textbox field");
		sendKeys(name, Name, WaitStrategy.PRESENSE, "Name Textbox field");
		return this;
	}
	
	public StaffPage EnterdetailInEmail(String Email)
	{
		clear(email, Email, WaitStrategy.PRESENSE, "Email Textbox field");
		sendKeys(email, Email, WaitStrategy.PRESENSE, "Email Textbox field");
		return this;
	}
	
	public StaffPage EnterdetailInPhonenumber(String Phonenumber)
	{
		clear(phonenumber, Phonenumber, WaitStrategy.PRESENSE, "phonenumber Textbox field");
		sendKeys(phonenumber, Phonenumber, WaitStrategy.PRESENSE, "phonenumber Textbox field");
		return this;
	}
	
	public void updaterecord()
	{
		click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
	}
	
	public void cancelreocrd()
	{
		click(cancelprofile, WaitStrategy.CLICKABLE, "Cancel button");
	}
}
