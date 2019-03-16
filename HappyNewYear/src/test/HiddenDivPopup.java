package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopup {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.flipkart.com");
		String xp="(//input[@type='text'])[2]";
		driver.findElement(By.xpath(xp)).sendKeys("Surya");
	//	String xp2="//button[not(@type)]";
	//	driver.findElement(By.xpath(xp2)).click();  //cross button
		
	}
}
