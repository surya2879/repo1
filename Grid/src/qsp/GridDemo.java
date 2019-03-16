package qsp;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo {
@Test
public void testA() throws MalformedURLException 
{
	URL ra=new URL("http://192.168.233.1:4444/wd/hub");//wd is selenium flavour and 'hub' is calling the node
	DesiredCapabilities c=new DesiredCapabilities();
	c.setBrowserName("chrome");
	WebDriver driver=new RemoteWebDriver(ra,c);
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	driver.quit();
}
}
