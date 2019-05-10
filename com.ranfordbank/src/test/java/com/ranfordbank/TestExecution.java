package com.ranfordbank;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestExecution extends Repository {
	
 @Parameters("browser")
 @Test(priority=0)
 public void verify_launch(String brow) throws Exception
 {
	 launch(brow);
 }
 
 @Test(priority=1)//enabled=false (if we don't want to execute this TC)
 public void verify_login() throws Exception
 {
	 login();
 }
 
 @Test(priority=2)
 public void verify_branches() throws Exception
 {
	 branches();
 }
 
 @Test(priority=3)
 public void verify_newBranch() throws Exception
 {
	 newBranch();
 }
 
 @Test(priority=4)
 public void verify_createNewBranch() throws Exception
 {
	 createNewBranch();
 }
 
 @Test(priority=5)
 public void verify_branchSearch() throws Exception
 {
	 branchSearch();
 }
 
 @Test(priority=6)
 public void verify_roles() throws Exception
 {
	 roles();
 }
 
 @Test(priority=7)
 public void verify_newRole() throws Exception
 {
	 newRole();
 }
 
 @Test(priority=8)
 public void verify_createnewRole() throws Exception
 {
	 createNewRole();
 }
 
 @Test(priority=9)
 public void verify_roleOperation() throws Exception
 {
	 roleOperation();
 }
 
 @Test(priority=10)
 public void verify_users() throws Exception
 {
	 users();
 }
 
 @Test(priority=11)
 public void verify_newUser() throws Exception
 {
	 newUser();
 }
 
 @Test(priority=12)
 public void verify_createNewUser() throws Exception
 {
	 createNewUser();
 }
 
 @Test(priority=13)
 public void verify_employee() throws Exception
 {
	employee();
 }
 
 @Test(priority=14)
 public void verify_newEmployee() throws Exception
 {
	 newEmployee();
 }

 @Test(priority=15)
 public void verify_createNewEmployee() throws Exception
 {
	 createNewEmployee();
 }
  
 @Test(priority=16)
 public void verify_employeeOperation() throws Exception
 {
	 employeeOperation();
 }
}

