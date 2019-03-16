package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbusingxpath {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("surya.prakash458@gmail.com");
		
		driver.findElement(By.xpath("input[@id='pass']")).sendKeys("surya");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='u_0_8']")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}
