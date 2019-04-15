package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class UserDetailsPage extends Base {
	public static WebElement newUser_button()
	{
		 return driver.findElement(getElement("newUser"));
	}
	
	public static WebElement branch_select()
	{
		 return driver.findElement(getElement("branchSelect"));
	}
	
	public static WebElement roles_select()
	{
		 return driver.findElement(getElement("rolesSelect"));
	}
	
	public static WebElement search_Button()
	{
		return driver.findElement(getElement("searchUser"));
	}
}
