package testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalDemo {
	@Parameters({"city"})
	@Test
	public void testA(@Optional("Pune")String c)
	{
		Reporter.log(c,true);
	}
}
