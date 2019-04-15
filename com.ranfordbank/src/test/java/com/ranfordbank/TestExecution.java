package com.ranfordbank;

import org.testng.annotations.Test;

public class TestExecution extends Repository {
 @Test(priority=0)
 public void verify_launch()
 {
	 launch();
 }
 
 @Test(priority=1)
 public void verify_login()
 {
	 login();
 }
 
 @Test(priority=2)
 public void verify_branches()
 {
	 branches();
 }
 
 @Test(priority=3)
 public void verify_newBranch()
 {
	 newBranch();
 }
 
 @Test(priority=4)
 public void verify_createNewBranch()
 {
	 createNewBranch();
 }
 
 @Test(priority=5)
 public void verify_branchSearch()
 {
	 branchSearch();
 }
 
 @Test(priority=6)
 public void verify_roles()
 {
	 roles();
 }
 
 @Test(priority=7)
 public void verify_newRole()
 {
	 newRole();
 }
 
 @Test(priority=8)
 public void verify_createnewRole()
 {
	 createNewRole();
 }
 
 @Test(priority=9)
 public void verify_roleOperation()
 {
	 roleOperation();
 }
 
 @Test(priority=10)
 public void verify_users()
 {
	 users();
 }
 
 @Test(priority=11)
 public void verify_newUser()
 {
	 newUser();
 }
 
 @Test(priority=12)
 public void verify_createNewUser()
 {
	 createNewUser();
 }
 
 @Test(priority=13)
 public void verify_employee()
 {
	employee();
 }
 
 @Test(priority=14)
 public void verify_newEmployee()
 {
	 newEmployee();
 }

 @Test(priority=15)
 public void verify_createNewEmployee()
 {
	 createNewEmployee();
 }
  
 @Test(priority=16)
 public void verify_employeeOperation()
 {
	 employeeOperation();
 }
}

