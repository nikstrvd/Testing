package com.tms.pages;

import org.openqa.selenium.By;

import com.tms.enums.WaitStrategy;

public class StudentsPage extends BasePage  {
	
	private final By viewaction = By.xpath("(//i[@class='fas fa-eye text-info font-16'])[1]");
	private final By Close = By.xpath("(//button[@type='button'])[2]");
	
	public void viewaction()
	{
		click(viewaction, WaitStrategy.CLICKABLE, "viewaction button");

	}
	
	public void Close()
	{
		click(Close, WaitStrategy.CLICKABLE, "Close button");

	}

}
