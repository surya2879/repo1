package testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	
@Test(invocationCount=2)
public void createUser()
{
	Reporter.log("user created successfully",true);
}

@Test(priority=2)
public void deleteUser()
{
	Reporter.log("user deleted successfully",true);
}

@Test(priority=3)
public void editUser()
{
	Reporter.log("user edited successfully",true);
}
}
