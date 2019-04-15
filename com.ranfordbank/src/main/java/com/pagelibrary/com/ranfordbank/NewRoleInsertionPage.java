package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewRoleInsertionPage extends Base {
	public static WebElement roleName_editBox()
	{
		return driver.findElement(getElement("roleName"));
	}
	
	public static WebElement roleDesc_editBox()
	{
		return driver.findElement(getElement("roleDesc"));
	}
	
	public static WebElement roleType_select()
	{
		return driver.findElement(getElement("roleType"));
	}
	
	public static WebElement submit_Button()
	{
		return driver.findElement(getElement("submitRole"));
	}
}
