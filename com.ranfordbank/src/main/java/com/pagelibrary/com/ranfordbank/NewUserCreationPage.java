package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewUserCreationPage extends Base {
	public static WebElement role_Select()
	{
		return driver.findElement(getElement("rolesSelect1"));
	}
	
	public static WebElement branch_Select()
	{
		return driver.findElement(getElement("branchSelect1"));
	}
	
	public static WebElement customerID_Select()
	{
		return driver.findElement(getElement("customeridSelect"));
	}
	
	public static WebElement customerName_editBox()
	{
		return driver.findElement(getElement("customerName"));
	}
	
	public static WebElement userName_editBox()
	{
		return driver.findElement(getElement("userName"));
	}
	
	public static WebElement loginPassword_editBox()
	{
		return driver.findElement(getElement("loginPassword"));
	}
	
	public static WebElement transactionPassword_editBox()
	{
		return driver.findElement(getElement("transPassword"));
	}
	
	public static WebElement submit_Button()
	{
		return driver.findElement(getElement("submitUser"));
	}
	
	
}
