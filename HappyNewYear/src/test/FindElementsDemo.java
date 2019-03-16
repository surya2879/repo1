package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/selenium%20contents/Qjspiders.html");
		List<WebElement> e = driver.findElements(By.tagName("a"));
	/*	for(int i=0;i<e.size();i++)
		{
			//e.get(i).click();
			System.out.println(i);
		}*/
		for(WebElement ele: e)
		{
			System.out.println(ele);
		}
		
		System.out.println(e.size());
		//driver.close();
		
	}
}
