package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/Demo1.html");
		WebElement e=driver.findElement(By.tagName("a"));
		e.click();
		
}
}
