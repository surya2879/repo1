package com.ranfordbank;


import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.pagelibrary.com.ranfordbank.AdminPage;
import com.pagelibrary.com.ranfordbank.BranchesPage;
import com.pagelibrary.com.ranfordbank.EmployeeDetailsPage;
import com.pagelibrary.com.ranfordbank.LoginPage;
import com.pagelibrary.com.ranfordbank.NewBranchEntryPage;
import com.pagelibrary.com.ranfordbank.NewEmployeeCreationPage;
import com.pagelibrary.com.ranfordbank.NewRoleInsertionPage;
import com.pagelibrary.com.ranfordbank.NewUserCreationPage;
import com.pagelibrary.com.ranfordbank.RolesPage;
import com.pagelibrary.com.ranfordbank.UserDetailsPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestBase.Base;
import Utility.Generic;
import webtable.WebTableHandle;

public abstract class Repository extends Base {
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void extentreport()
	{
		extent=new ExtentReports("./Extentreports/report.html",true);
	}
	
	@BeforeMethod
	public void send_function_to_report(Method method)
	{
		test=extent.startTest((this.getClass().getSimpleName()+" : :"+method.getName()));
		test.assignAuthor("Surya");
		test.assignCategory("Regression");
	}
	
	@AfterTest
	public void save_report()
	{
		extent.flush();
	}
	
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
	
	String actual_Url=driver.getCurrentUrl();
	String expected_Url=getConfig("build1");
	
	if(actual_Url.contains(expected_Url))
	{
		test.log(LogStatus.PASS, "my expected Url :- "+getConfig("build1")+" is matching");
		test.log(LogStatus.INFO, " Launch is done successfully");
	}
	
	else
	{
		test.log(LogStatus.INFO, "launch is failed");
	}
}

public void login()
{
  LoginPage.userName_editbox().sendKeys(getConfig("username"));
  LoginPage.password_editbox().sendKeys(getConfig("password"));
  LoginPage.login().click();
  
  String actual_title=driver.getTitle();
  String expected_title=getConfig("login_title");
  
  if(actual_title.contains(expected_title))
	{
		test.log(LogStatus.PASS, "my expected title :- "+getConfig("login_title") +" is matching");
		test.log(LogStatus.INFO, " Login is done successfully");
	}
  
  else
	{
		test.log(LogStatus.INFO, "login is failed");
	}
 }

public void branches()
 {
	AdminPage.branches().click();
	
	  String actual_title=driver.getTitle();
	  String expected_title=getConfig("branches_title");
	
	  if(actual_title.contains(expected_title))
		{
			test.log(LogStatus.PASS, "my expected title :- "+getConfig("branches_title") +" is matching");
			test.log(LogStatus.INFO, " clicked successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "click is failed");
		}
 }

public void newBranch()
 {
	 BranchesPage.newBranchButton().click();
	 
	  String actual_title=driver.getTitle();
	  String expected_title=getConfig("newbranch_title");
	
	  if(actual_title.contains(expected_title))
		{
			test.log(LogStatus.PASS, "my expected title :- "+getConfig("newbranch_title") +" is matching");
			test.log(LogStatus.INFO, " clicked successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "click is failed");
		}
	 
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
	 
	 String actual=driver.switchTo().alert().getText();
	 
	 driver.switchTo().alert().accept();
	 
	 String expected=getConfig("alert_text");
	 
	 if(actual.contains(expected))
		{
			test.log(LogStatus.PASS, " expected message :- "+getConfig("alert_text") +" is matching");
			test.log(LogStatus.INFO, "  branch is created successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "branch creation  is failed");
		}
}

 public void branchSearch()
	 {
		 AdminPage.branches().click();
		 Generic.dp_handle(BranchesPage.country_Select(),getConfig("country_scr"));
		 Generic.dp_handle(BranchesPage.state_Select(), getConfig("state_scr"));
		 Generic.dp_handle(BranchesPage.city_Select(), getConfig("city_scr"));
		 BranchesPage.searchButton().click();
		 WebTableHandle.webTable(driver, getElement("webtable"),"edit","337");
		 
		  String actual_title=driver.getTitle();
		  String expected_title=getConfig("edit_branchtitle");
		
		  if(actual_title.contains(expected_title))
			{
				test.log(LogStatus.PASS, "my expected title :- "+getConfig("edit_branchtitle") +" is matching");
				test.log(LogStatus.INFO, " expected page is displayed successfully");
			}
		  
		  else
			{
				test.log(LogStatus.INFO, "page is not displayed");
			}
	 }
 
 public void roles()
 {
	AdminPage.roles().click();
	
	  String actual_title=driver.getTitle();
	  String expected_title=getConfig("roles_title");
	
	  if(actual_title.contains(expected_title))
		{
			test.log(LogStatus.PASS, "my expected title :- "+getConfig("roles_title") +" is matching");
			test.log(LogStatus.INFO, " clicked successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "click is failed");
		}
 }

 public void newRole()
 {
	 RolesPage.newRoleButton().click();
	 
	  String actual_title=driver.getTitle();
	  String expected_title=getConfig("newroles_title");
	
	  if(actual_title.contains(expected_title))
		{
			test.log(LogStatus.PASS, "my expected title :- "+getConfig("newroles_title") +" is matching");
			test.log(LogStatus.INFO, " clicked successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "click is failed");
		}
 }
 
 public void createNewRole()
 {
	 NewRoleInsertionPage.roleName_editBox().sendKeys(getConfig("RoleName"));
	 NewRoleInsertionPage.roleDesc_editBox().sendKeys(getConfig("RoleDesc"));
	 Generic.dp_handle(NewRoleInsertionPage.roleType_select(),getConfig("RoleType_scr"));
	 NewRoleInsertionPage.submit_Button().click();
	 
     String actual=driver.switchTo().alert().getText();
	 
	 driver.switchTo().alert().accept();
	 
	 String expected=getConfig("newrolealert_text");
	 
	 if(actual.contains(expected))
		{
			test.log(LogStatus.PASS, " expected message :- "+getConfig("newrolealert_text") +" is matching");
			test.log(LogStatus.INFO, "  role is created successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "role creation  is failed");
		}
 }
 
 public void roleOperation()
 {
	 AdminPage.roles().click();
	 WebTableHandle.webTable(driver, getElement("roles_webtable"),"edit","40");
	 String actual=driver.switchTo().alert().getText();
	 driver.switchTo().alert().dismiss();
	 String expected=getConfig("roleoperation_alert");
	 
	 if(actual.contains(expected))
		{
			test.log(LogStatus.PASS, " expected message :- "+getConfig("roleoperation_alert") +" is matching");
			test.log(LogStatus.INFO, " role operation is done successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "role operation  is failed");
		}
 }
 
 public void users()
 {
	AdminPage.users().click();
	
	  String actual_title=driver.getTitle();
	  String expected_title=getConfig("users_title");
	
	  if(actual_title.contains(expected_title))
		{
			test.log(LogStatus.PASS, "my expected title :- "+getConfig("users_title") +" is matching");
			test.log(LogStatus.INFO, " clicked successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "click is failed");
		}
 }
 
 public void newUser()
 {
	UserDetailsPage.newUser_button().click();
	
	  String actual_title=driver.getTitle();
	  String expected_title=getConfig("new_users_title");
	
	  if(actual_title.contains(expected_title))
		{
			test.log(LogStatus.PASS, "my expected title :- "+getConfig("new_users_title") +" is matching");
			test.log(LogStatus.INFO, " clicked successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "click is failed");
		}
	
	
 }
 
 public void createNewUser()
 {
	Generic.dp_handle(NewUserCreationPage.role_Select(),getConfig("Role"));
	Generic.dp_handle(NewUserCreationPage.branch_Select(),getConfig("Branch"));
	Generic.dp_handle(NewUserCreationPage.customerID_Select(),getConfig("CustomerID"));
	NewUserCreationPage.customerName_editBox().sendKeys(getConfig("CustomerName"));
	NewUserCreationPage.userName_editBox().sendKeys(getConfig("UserName"));
	NewUserCreationPage.loginPassword_editBox().sendKeys(getConfig("LoginPassword"));
	NewUserCreationPage.transactionPassword_editBox().sendKeys(getConfig("TransactionPassword"));
	NewUserCreationPage.submit_Button().click();
	
	  String actual=driver.switchTo().alert().getText();
		 
		 driver.switchTo().alert().accept();
		 
		 String expected=getConfig("newuseralert_text");
		 
		 if(actual.contains(expected))
			{
				test.log(LogStatus.PASS, " expected message :- "+getConfig("newuseralert_text") +" is matching");
				test.log(LogStatus.INFO, "  user is created successfully");
			}
		  
		  else
			{
				test.log(LogStatus.INFO, "user creation  is failed");
			}
 }
 
 public void employee()
 {
	 AdminPage.employee().click();
	 
	  String actual_title=driver.getTitle();
	  String expected_title=getConfig("employee_title");
	
	  if(actual_title.contains(expected_title))
		{
			test.log(LogStatus.PASS, "my expected title :- "+getConfig("employee_title") +" is matching");
			test.log(LogStatus.INFO, " clicked successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "click is failed");
		}
	 
	 
 }
 
 public void newEmployee()
 {
	EmployeeDetailsPage.newEmployeeButton().click();
	
	  String actual_title=driver.getTitle();
	  String expected_title=getConfig("newemployee_title");
	
	  if(actual_title.contains(expected_title))
		{
			test.log(LogStatus.PASS, "my expected title :- "+getConfig("newemployee_title") +" is matching");
			test.log(LogStatus.INFO, " clicked successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "click is failed");
		}
 }
 
 public void createNewEmployee()
 {
	 NewEmployeeCreationPage.employerName_editBox().sendKeys("EmployerName");
	 NewEmployeeCreationPage.loginPassword_editBox().sendKeys("LoginPasssword");
	 Generic.dp_handle(NewEmployeeCreationPage.employeeRole_Select(),getConfig("EmployeeRole"));
	 Generic.dp_handle(NewEmployeeCreationPage.employeeBranch_Select(),getConfig("EmployeeBranch"));
	 NewEmployeeCreationPage.submit_Button().click();
	 
     String actual=driver.switchTo().alert().getText();
	 
	 driver.switchTo().alert().accept();
	 
	 String expected=getConfig("newempalert_text");
	 
	 if(actual.contains(expected))
		{
			test.log(LogStatus.PASS, " expected message :- "+getConfig("newempalert_text") +" is matching");
			test.log(LogStatus.INFO, "  employee is created successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, "employee creation  is failed");
		}
 }
 
 public void employeeOperation()
 {
	 AdminPage.employee().click();
	 WebTableHandle.webTable(driver, getElement("employeeWebTable"),"edit","6521");
	 
	  String actual_title=driver.getTitle();
	  String expected_title=getConfig("employeeoperation_title");
	
	  if(actual_title.contains(expected_title))
		{
			test.log(LogStatus.PASS, "my expected title :- "+getConfig("employeeoperation_title") +" is matching");
			test.log(LogStatus.INFO, " employee operation is done successfully");
		}
	  
	  else
		{
			test.log(LogStatus.INFO, " employee operation is failed");
		}
   }
 
}

