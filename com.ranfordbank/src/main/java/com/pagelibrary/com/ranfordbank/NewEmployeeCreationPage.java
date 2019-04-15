package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewEmployeeCreationPage extends Base {
	public static WebElement employerName_editBox()
	{
		return driver.findElement(getElement("employerName"));
	}
	
	public static WebElement loginPassword_editBox()
	{
		return driver.findElement(getElement("loginPassword"));
	}
	
	public static WebElement employeeRole_Select()
	{
		return driver.findElement(getElement("employeeRole"));
	}
	
	public static WebElement employeeBranch_Select()
	{
		return driver.findElement(getElement("employeeBranch"));
	}
	
	public static WebElement submit_Button()
	{
		return driver.findElement(getElement("submitEmployee"));
	}
}
