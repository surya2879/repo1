package qsp;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridDemo3 {
@Test
@Parameters({"node","browser"})
public void testA(String node,String browser) throws Exception
{
	URL ra=new URL(node);
	DesiredCapabilities c=new DesiredCapabilities();
	c.setBrowserName(browser);
	WebDriver driver=new RemoteWebDriver(ra,c); //remote address(ra) and capability(c)
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	for(int i=1;i<=3;i++)
	{
		Thread.sleep(500);
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(500);
		driver.findElement(By.name("q")).clear();
		Thread.sleep(500);
	}
	driver.quit();
}
}
