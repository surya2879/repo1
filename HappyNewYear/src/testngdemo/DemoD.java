package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoD {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	@Test
	public void test()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String actual=driver.getTitle(); //actual value from application
		String expected="boogle"; //expected value should be taken from excel file
		Assert.assertEquals(actual, expected);
		/*if(actual.equals(expected))
		{
			Reporter.log("Pass....",true);
		}
		else
		{
			Reporter.log("Fail....",true);
			Assert.fail();
			
		}*/
	}
}
