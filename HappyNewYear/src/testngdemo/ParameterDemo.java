package testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
@Test
@Parameters({"city","area"})
public void testA(String c,String a)
{
	Reporter.log(c+a,true);
}
}
