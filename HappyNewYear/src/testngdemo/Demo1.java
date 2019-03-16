package testngdemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
public void test1()
{
	//log() is overloaded method
	Reporter.log("qspiders");
	Reporter.log("jspiders",true);
	Reporter.log("tspiders",false);
}
}
