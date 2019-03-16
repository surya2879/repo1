package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {
static
{
	System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
}

public static void testScript(WebDriver driver)
{
	driver.get("http://www.gmail.com");
	driver.manage().window().maximize();
	driver.close();
	}
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	testScript(driver);
	/*driver.get("http://www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);*/
	
}
}
