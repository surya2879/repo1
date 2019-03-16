package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/Un.html");
		driver.findElement(By.xpath("/html/body/input")).sendKeys("surya");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("prakash");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.close();
		
	}
}
