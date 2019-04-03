package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class AdminPage extends Base {
	public static WebElement branches()
	{
		return driver.findElement(getElement("branches"));
	}
	
	public static  WebElement roles()
	{
		return  driver.findElement(getElement("roles"));
	}
	
	public static  WebElement users()
	{
		return  driver.findElement(getElement("users"));
	}
	
	public static  WebElement employee()
	{
		return  driver.findElement(getElement("employee"));
	}
	
}
