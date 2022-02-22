package com.tms.pages;

import org.openqa.selenium.By;


import com.tms.enums.WaitStrategy;

public class TrainerPage extends BasePage {
		
	private final By Addnew = By.xpath("//a[text()=' Add New']");
	private final By Editrecord = By.xpath("(//i[@class='fas fa-pencil-alt text-info font-16'])[3]");
	private final By name = By.xpath("//input[@name='name']");
	private final By email = By.xpath("//input[@name='email']");
	private final By phonenumber = By.xpath("//input[@name='phone_number']");
	private final By experience = By.xpath("//textarea[@name='experience']");
	private final By linkedinurl = By.xpath("//input[@name='linkedInURL']");
	private final By description = By.xpath("//input[@name='qualifications[0][description]']");
	private final By domainarea = By.xpath("//input[@name='domainArea']");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.mar-r-10");
	private final By cancelprofile = By.cssSelector(".btn.btn-danger");
	private final By Timezone = By.id("select2-timezone-container");
	private final By Timezoneselection = By.xpath("//ul[@class='select2-results__options']/li[.='(UTC +08:00) Asia/Singapore']");
	private final By selectlevel = By.cssSelector(".select2-selection.select2-selection--single");
	private final By selectvalue = By.xpath("//ul[@class='select2-results__options']/li[6]");
	private final By status = By.cssSelector(".custom-control.custom-switch.switch-success");
	
	public void selectStatus()
	{
		click(status, WaitStrategy.CLICKABLE, "status button");
	}
	
	public void selectLevel() {
		
		click(selectlevel, WaitStrategy.CLICKABLE, "selectlevel button");
	}
	
public void selectValue() {
		
		click(selectvalue, WaitStrategy.CLICKABLE, "selectvalue button");
	}
	
	public void Addnewrecord()
	{
		click(Addnew, WaitStrategy.CLICKABLE, "Add New button");

	}
	
	public void ClickonTimezone()
	{
		click(Timezone, WaitStrategy.CLICKABLE, "Timezone button");

	}
	
	public void ClickonTimezoneSelection()
	{
		click(Timezoneselection, WaitStrategy.CLICKABLE, "Timezoneselection button");

	}
	
	public void Editrecord()
	{
		click(Editrecord, WaitStrategy.CLICKABLE, "Editrecord button");

	}
	
	public TrainerPage EnterdetailInName(String Name)
	{
		clear(name, Name, WaitStrategy.PRESENSE, "Name Textbox field");
		sendKeys(name, Name, WaitStrategy.PRESENSE, "Name Textbox field");
		return this;
	}
	
	public TrainerPage EnterdetailInEmail(String Email)
	{
		clear(email, Email, WaitStrategy.PRESENSE, "Email Textbox field");
		sendKeys(email, Email, WaitStrategy.PRESENSE, "Email Textbox field");
		return this;
	}
	
	public TrainerPage EnterdetailInExperience(String Experience)
	{
		clear(experience, Experience, WaitStrategy.PRESENSE, "Experience Textbox field");
		sendKeys(experience, Experience, WaitStrategy.PRESENSE, "Experience Textbox field");
		return this;
	}
	
	public TrainerPage EnterdetailInLinkedin(String Linkedinurl)
	{
		clear(linkedinurl, Linkedinurl, WaitStrategy.PRESENSE, "linkedinurl Textbox field");
		sendKeys(linkedinurl, Linkedinurl, WaitStrategy.PRESENSE, "linkedinurl Textbox field");
		return this;
	}
	
	public TrainerPage EnterdetailInDomain(String Domainarea)
	{
		clear(domainarea, Domainarea, WaitStrategy.PRESENSE, "domainarea Textbox field");
		sendKeys(domainarea, Domainarea, WaitStrategy.PRESENSE, "domainarea Textbox field");
		return this;
	}
	
	public TrainerPage EnterdetailInDescrption(String Description)
	{
		clear(description, Description, WaitStrategy.PRESENSE, "Description Textbox field");
		sendKeys(description, Description, WaitStrategy.PRESENSE, "Description Textbox field");
		return this;
	}
	
	public TrainerPage EnterdetailInPhonenumber(String Phonenumber)
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
