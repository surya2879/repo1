package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.XL;

public class Demo extends BaseTest{
	@Test
	public void testDemoA() {
		String v=XL.getData(XL_PATH, "Sheet1",0,0);
		Reporter.log(v,true);	
		int rc=XL.getRowCount(XL_PATH,"Sheet1");
		Reporter.log("row count"+rc,true);
		Assert.fail();
	}
}
