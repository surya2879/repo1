package script;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DemoB {

	@AfterMethod
	public void m(ITestResult iTestResult) {
		Reporter.log("m",true);
		String name = iTestResult.getName();
		int s = iTestResult.getStatus();
		Reporter.log("Name is:"+name+" Status is:"+s,true);
	}
	@Test
	public void testA() {
		Reporter.log("testA",true);
		Assert.fail();
	}
	
	@Test
	public void testB() {
		Reporter.log("testB",true);
	}
}
