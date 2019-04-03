package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;
import TestBase.Base;

public class NewBranchEntryPage extends Base {
	public static WebElement branchName_editBox()
	{
		return driver.findElement(getElement("branchname"));
	}
	
	public static WebElement address1_editBox()
	{
		return driver.findElement(getElement("address1"));
	}
	
	public static WebElement address2_editBox()
	{
		return driver.findElement(getElement("address2"));
	}
	
	public static WebElement address3_editBox()
	{
		return driver.findElement(getElement("address3"));
	}
	
	public static WebElement area_editBox()
	{
		return driver.findElement(getElement("area"));
	}
	
	public static WebElement zipCode_editBox()
	{
		return driver.findElement(getElement("zipcode"));
	}
	
	public static WebElement country1_select()
	{
		return driver.findElement(getElement("country_1"));
	}
	
	public static WebElement state1_select()
	{
		return driver.findElement(getElement("state_1"));
	}
	
	public static WebElement city1_select()
	{
		return driver.findElement(getElement("city_1"));
	}
	
	public static WebElement submit_button()
	{
		return driver.findElement(getElement("submit"));
	}
	
	public static WebElement reset_button()
	{
		return driver.findElement(getElement("reset"));
	}
	
	public static WebElement cancel_button()
	{
		return driver.findElement(getElement("cancel"));
	}
	
}
