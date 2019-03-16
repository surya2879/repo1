package testngdemo;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoE {
	
	@Test
	public void testA()
	{
		Reporter.log("Start testA",true);
	    Assert.assertEquals("abc","aff");
	    Reporter.log("End testA",true);
	}
	@Test
	public void testB()
	{
		Reporter.log("Start testB",true);
	    Reporter.log("End testB",true);
	}
}
