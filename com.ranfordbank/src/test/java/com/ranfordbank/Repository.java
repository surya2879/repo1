package com.ranfordbank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pagelibrary.com.ranfordbank.AdminPage;
import com.pagelibrary.com.ranfordbank.BranchesPage;
import com.pagelibrary.com.ranfordbank.LoginPage;
import com.pagelibrary.com.ranfordbank.NewBranchEntryPage;

import TestBase.Base;
import Utility.Generic;

public class Repository extends Base {
public void launch()
{
	switch(getConfig("browser"))
	{
	case "chrome":
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		break;
		
	case "firefox":
		System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
		driver=new FirefoxDriver();
		break;
  }
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(getConfig("build1"));
	driver.manage().window().maximize();
}

public void login()
{
  LoginPage.userName_editbox().sendKeys(getConfig("username"));
  LoginPage.password_editbox().sendKeys(getConfig("password"));
  LoginPage.login().click();
}

public void branches()
 {
	AdminPage.branches().click();
 }

public void newBranch()
 {
	 BranchesPage.newBranchButton().click();
 }
 
 public void createNewBranch()
 {
	 NewBranchEntryPage.branchName_editBox().sendKeys(getConfig("branchName"));
	 NewBranchEntryPage.address1_editBox().sendKeys(getConfig("Address1"));
	 NewBranchEntryPage.address2_editBox().sendKeys(getConfig("Address2"));
	 NewBranchEntryPage.address3_editBox().sendKeys(getConfig("Address3"));
	 NewBranchEntryPage.area_editBox().sendKeys(getConfig("Area"));
	 NewBranchEntryPage.zipCode_editBox().sendKeys(getConfig("ZipCode"));
	 Generic.dp_handle(NewBranchEntryPage.country1_select(),getConfig("Country"));
	 Generic.dp_handle(NewBranchEntryPage.state1_select(),getConfig("State"));
	 Generic.dp_handle(NewBranchEntryPage.city1_select(), getConfig("City"));
	 NewBranchEntryPage.submit_button().click();
	 driver.switchTo().alert().accept();
 }
  
 public void branchSearch()
	 {
		 AdminPage.branches().click();
		 Generic.dp_handle(BranchesPage.country_Select(),getConfig("country_scr"));
		 Generic.dp_handle(BranchesPage.state_Select(), getConfig("state_scr"));
		 Generic.dp_handle(BranchesPage.city_Select(), getConfig("city_scr"));
		 BranchesPage.searchButton().click();
	 }
 }

