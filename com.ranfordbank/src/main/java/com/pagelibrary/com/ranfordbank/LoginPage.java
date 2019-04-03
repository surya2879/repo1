package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;


public class LoginPage extends Base {
	public static WebElement userName_editbox()
	{
		return driver.findElement(getElement("username"));
	}
	
	public static WebElement password_editbox()
	{
		return driver.findElement(getElement("password"));
	}
	
	public static WebElement login()
	{
		return driver.findElement(getElement("login"));
	}
}
