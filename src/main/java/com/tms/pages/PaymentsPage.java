package com.tms.pages;

import org.openqa.selenium.By;

import com.tms.enums.WaitStrategy;

public class PaymentsPage extends BasePage {
	
	private final By Addnew = By.xpath("//button[text()=' Add New']");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.mar-r-10");
	private final By Paymentmode = By.xpath("//select[@name='payment_mode']");
	private final By Selectpaymentmode = By.xpath("//option[contains(.,'Cash')]");
	private final By Feespaidamount = By.id("fee_amount");
	private final By Studentenrollment = By.id("select2-student_enrolments_id-container");
	private final By Entertext = By.cssSelector(".select2-search__field");
	private final By Selectdata = By.xpath("//li[@class='select2-results__option select2-results__option--selectable']");
	private final By Selectdata1 = By.xpath("//li[@class='select2-results__option']");
	private final By Listdots = By.xpath("(//span[@class='list-dots'])[1]");
	private final By view = By.xpath("(//i[@class='fas fa-eye font-16'])[1]");
	private final By Edit = By.xpath("(//i[@class='fas fa-edit font-16'])[1]");
	
	public void clickonListdotsButtonforPaymentList()
	{
		click(Listdots, WaitStrategy.CLICKABLE, "Listdots button");
	}
	
	public void clickonViewfromListdotsButtonforPaymentList()
	{
		click(view, WaitStrategy.CLICKABLE, "view button");
	}

	
	public void Editrecord()
	{
		click(Edit, WaitStrategy.CLICKABLE, "Editrecord button");

	}
	
	public void Addnewrecord()
	{
		click(Addnew, WaitStrategy.CLICKABLE, "Add New button");

	}
	
	public void Paymentmode()
	{
		click(Paymentmode, WaitStrategy.CLICKABLE, "Paymentmode button");

	}

	
	public void Selectpaymentmode()
	{
		click(Selectpaymentmode, WaitStrategy.CLICKABLE, "Selectpaymentmode button");

	}
	
	public PaymentsPage EnterdetailInFeespaidamount(String feespaidamount)
	{
		clear(Feespaidamount, feespaidamount, WaitStrategy.PRESENSE, "Feespaidamount Textbox field");
		sendKeys(Feespaidamount, feespaidamount, WaitStrategy.PRESENSE, "Feespaidamount Textbox field");
		return this;
	}
	
	public void Studentenrollment()
	{
		click(Studentenrollment, WaitStrategy.CLICKABLE, "Studentenrollment button");

	}	
	
	public PaymentsPage Entertext(String entertext)
	{
		clear(Entertext, entertext, WaitStrategy.PRESENSE, "Entertext Textbox field");
		sendKeys(Entertext, entertext, WaitStrategy.PRESENSE, "Entertext Textbox field");
		return this;
	}
	
	
	public void Selectdata()
	{
		click(Selectdata, WaitStrategy.CLICKABLE, "Selectdata button");

	}
	
	public void Selectdata1()
	{
		click(Selectdata1, WaitStrategy.CLICKABLE, "Selectdata button");

	}	
		
	public void updaterecord()
	{
		click(updateprofile, WaitStrategy.CLICKABLE, "Update button");
	}
	
}
