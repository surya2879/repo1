package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/selenium%20contents/qjb.html");
		List<WebElement> alliLinks = driver.findElements(By.xpath("//a"));
		int count=alliLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement link = alliLinks.get(i);
			String text = link.getText();
			System.out.println(text);
		}
		driver.close();
	}
}
