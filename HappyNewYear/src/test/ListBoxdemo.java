package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxdemo {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/hotel.html");
		WebElement slvLB = driver.findElement(By.id("slv"));
		Select slv=new Select(slvLB);
		Thread.sleep(2000);
		List<WebElement> allSOs = slv.getAllSelectedOptions();
		int count=allSOs.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement option = allSOs.get(i);
			String text=option.getText();
			System.out.println(text);
		}
	//	driver.close();
	}
}
