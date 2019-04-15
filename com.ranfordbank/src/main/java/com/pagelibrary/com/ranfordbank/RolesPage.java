package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class RolesPage extends Base {
	
	public static WebElement newRoleButton()
	{
		return driver.findElement(getElement("newRole"));
	}
}
