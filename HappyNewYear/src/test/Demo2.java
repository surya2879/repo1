package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	 static
	 {
		 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	 }
	 public static void testScript(WebDriver driver)
	 {
		 driver.get("http://www.google.com");
		 String sm=driver.getTitle();
		 driver.close();
	 }
	 public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 testScript(driver);
		 
		 //	 WebDriver driver1=new FirefoxDriver();
		 //testScript(driver1);
		 
		 
	}
}
