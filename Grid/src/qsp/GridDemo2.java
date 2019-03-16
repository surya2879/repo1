package qsp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo2 {
	@Test
	public void testA() throws MalformedURLException
	{
		URL ra=new URL("http://192.168.233.1:4444/wd/hub");
		DesiredCapabilities c=new DesiredCapabilities();
		c.setBrowserName("firefox");
		WebDriver driver=new RemoteWebDriver(ra,c);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
}
}
