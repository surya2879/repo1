package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class BranchesPage extends Base{

	public static WebElement country_Select()
	{
		return driver.findElement(getElement("country"));
	}
	
	public static WebElement state_Select()
	{
		return driver.findElement(getElement("state"));
	}
	
	public static WebElement city_Select()
	{
		return driver.findElement(getElement("city"));
	}
	
	public static WebElement newBranchButton()
	{
		return driver.findElement(getElement("newbranch"));
	}
	
	public static WebElement searchButton()
	{
		return driver.findElement(getElement("search"));
		
	}
	public static WebElement clearButton()
	{
		return driver.findElement(getElement("clear"));
	}
	
	public static WebElement webTable()
	{
		return driver.findElement(getElement("webtable"));
	}
}
