package test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classwork2 {
static
{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.naukri.com");
	driver.manage().window().maximize();
	Set<String> set=driver.getWindowHandles();
	System.out.println(set.size());
	  for(String s:set)
	      System.out.println(s);
	  driver.quit();
}
}
