package com.tms.pages;

import org.openqa.selenium.By;

import com.tms.enums.WaitStrategy;

public class VenuePage extends BasePage {
	
	private final By Addnew = By.xpath("//a[.=' Add Venue']");
	private final By Editrecord = By.xpath("(//a[.=' Edit'])[1]");
	private final By block = By.xpath("//input[@name='block']");
	private final By street = By.xpath("//input[@name='street']");
	private final By floor = By.xpath("//input[@name='floor']");
	private final By unit = By.xpath("//input[@name='unit']");
	private final By building = By.xpath("//input[@name='building']");
	private final By room = By.xpath("//input[@name='room']");
	private final By postalcode = By.xpath("//input[@name='postal_code']");
	private final By wheelchairaccess = By.xpath("//div//label[.='Wheel Chair Access ']");
	private final By Status = By.xpath("//div//label[text()='Status : ']");
	private final By updateprofile = By.cssSelector(".btn.btn-primary.mar-r-10");
	private final By cancelprofile = By.cssSelector(".btn.btn-danger");
	private final By Listdots = By.xpath("(//span[@class='list-dots'])[1]");
	
	public void clickonListdotsButton()
	{
		click(Listdots, WaitStrategy.CLICKABLE, "listdotsclick button");
	}
	
	
	public void Addnewrecord()
	{
		click(Addnew, WaitStrategy.CLICKABLE, "Add New button");

	}
	
	public void ClickonStatus()
	{
		click(Status, WaitStrategy.CLICKABLE, "Status button");

	}
	
	public void ClickonWheelchairaccess()
	{
		click(wheelchairaccess, WaitStrategy.CLICKABLE, "Wheelchairaccess button");

	}
	
	public VenuePage EnterdetailInBlock(String Block)
	{
		clear(block, Block, WaitStrategy.PRESENSE, "Block Textbox field");
		sendKeys(block, Block, WaitStrategy.PRESENSE, "Block Textbox field");
		return this;
	}
	
	public VenuePage EnterdetailInStreet(String Street)
	{
		clear(street, Street, WaitStrategy.PRESENSE, "Street Textbox field");
		sendKeys(street, Street, WaitStrategy.PRESENSE, "Street Textbox field");
		return this;
	}
	
	public VenuePage EnterdetailInFloor(String Floor)
	{
		clear(floor, Floor, WaitStrategy.PRESENSE, "Floor Textbox field");
		sendKeys(floor, Floor, WaitStrategy.PRESENSE, "Floor Textbox field");
		return this;
	}
	
	public VenuePage EnterdetailInUnit(String Unit)
	{
		clear(unit, Unit, WaitStrategy.PRESENSE, "Unit Textbox field");
		sendKeys(unit, Unit, WaitStrategy.PRESENSE, "Unit Textbox field");
		return this;
	}
	
	public VenuePage EnterdetailInBuilding(String Building)
	{
		clear(building, Building, WaitStrategy.PRESENSE, "Building Textbox field");
		sendKeys(building, Building, WaitStrategy.PRESENSE, "Building Textbox field");
		return this;
	}
	
	public VenuePage EnterdetailInRoom(String Room)
	{
		clear(room, Room, WaitStrategy.PRESENSE, "Room Textbox field");
		sendKeys(room, Room, WaitStrategy.PRESENSE, "Room Textbox field");
		return this;
	}
	
	public VenuePage EnterdetailInPostalcode(String Postalcode)
	{
		clear(postalcode, Postalcode, WaitStrategy.PRESENSE, "PostalCode Textbox field");
		sendKeys(postalcode, Postalcode, WaitStrategy.PRESENSE, "PostalCode Textbox field");
		return this;
	}
	
	public void Editrecord()
	{
		click(Editrecord, WaitStrategy.CLICKABLE, "Editrecord button");

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
