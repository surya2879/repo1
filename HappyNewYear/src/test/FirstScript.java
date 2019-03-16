package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {
/*public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.getTitle();
	System.out.println("title is : "+driver.getTitle());
	driver.getCurrentUrl();
	System.out.println("current url is : "+driver.getCurrentUrl());
	//driver.getPageSource();
	//System.out.println("page source is :"+driver.getPageSource());
	//driver.close();
	*/
	 static
	 {
		 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		 
	 }
	 public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.close();
		WebDriver driver1=new FirefoxDriver();
		driver1.get("http://www.google.com");
		driver1.manage().window().maximize();
		driver1.close();
	
	}
}

