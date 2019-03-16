package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleardemo {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement unTB=driver.switchTo().activeElement();
		Thread.sleep(1000);
		unTB.sendKeys("Bhanu");
		Thread.sleep(1000);
		unTB.clear();
		unTB.sendKeys(Keys.CONTROL+"a");
		//Thread.sleep(1000);
		unTB.sendKeys(Keys.DELETE);
		//Thread.sleep(1000);
		unTB.sendKeys("Surya");
		
	}
}
