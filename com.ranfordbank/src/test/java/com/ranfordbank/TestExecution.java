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
 }

