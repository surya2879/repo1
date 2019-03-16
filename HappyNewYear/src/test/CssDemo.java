package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/xpath.html");
		driver.findElement(By.cssSelector("a[class=c1]")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}
