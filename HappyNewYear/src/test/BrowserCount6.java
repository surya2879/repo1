package test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCount6 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com");
	String parentTitle=driver.getTitle();
	Set<String> allWHS = driver.getWindowHandles();
	
	//close all the browsers except parent(close all the child browsers)
	
    for(String wh:allWHS)
	{
		driver.switchTo().window(wh);
		if(!driver.getTitle().equals(parentTitle))
		     driver.close();
    }
  }
}
