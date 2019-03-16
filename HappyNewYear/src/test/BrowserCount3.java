package test;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCount3 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com");
	Set<String> allWHS = driver.getWindowHandles();
	int count=allWHS.size();
	System.out.println(count);//count the no. of browsers
	for(String wh:allWHS)
	{
		driver.switchTo().window(wh);
		System.out.println(driver.getTitle());//print the title of all the browsers
	//	driver.close(); //close all the browsers one by one without using quit()(from parent to child)
	}
	driver.quit(); //close all the browsers at a short
}
}
