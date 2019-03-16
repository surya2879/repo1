package testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoF {
	@Test
	public void testA()
	{
		SoftAssert s=new SoftAssert();
		Reporter.log("Start testA",true);
	    s.assertEquals("abc","xyz");
	    Reporter.log("End testA",true);
	    s.assertAll();
	}
	@Test
	public void testB()
	{
		Reporter.log("Start testB",true);
	    Reporter.log("End testB",true);
	}
}
