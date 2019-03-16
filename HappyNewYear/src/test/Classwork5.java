package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classwork5 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.id("email"));
		e1.sendKeys("surya.prakash458@gmail.com");
		WebElement e2=driver.findElement(By.id("pass"));
		e2.sendKeys("abc");
		WebElement e3=driver.findElement(By.id("u_0_2"));
		e3.click();
	}
}
