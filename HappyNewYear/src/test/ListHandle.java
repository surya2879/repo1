package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListHandle {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement listBox = driver.findElement(By.id("month"));
		Select select=new Select(listBox);
		select.selectByIndex(5);
	}
}
