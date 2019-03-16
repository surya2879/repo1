package test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winhandemo {
static
{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.naukri.com");
	Set<String> whs=driver.getWindowHandles();
	System.out.println(whs.size());
	for(String s: whs)
	{
		System.out.println(s);
	}
	driver.quit();
}
}
