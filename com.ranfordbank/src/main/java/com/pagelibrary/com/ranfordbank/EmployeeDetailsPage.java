package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class EmployeeDetailsPage extends Base {
	public static WebElement newEmployeeButton()
	{
		return driver.findElement(getElement("newEmployee"));
	}
}
