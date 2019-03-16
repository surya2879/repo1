package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReverseListbox {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/lenovo/Desktop/hotel.html");
		driver.manage().window().maximize();
		WebElement mtrLB=driver.findElement(By.id("mtr"));
		Select select=new Select(mtrLB);
		List<WebElement> allOptions = select.getOptions();
		int count=allOptions.size();
		
		for(int i=0;i<count;i++)
		{
			WebElement option=allOptions.get(i);
			String text=option.getText();
			System.out.println(text);
		}
		
		System.out.println("---------Reverse List----------");
		
		for(int i=count-1;i>=0;i--)
		{
			WebElement option=allOptions.get(i);
			String text=option.getText();
			System.out.println(text);
		}
		
		System.out.println("----------------------------------------------------------------------");
		
		WebElement slvLB=driver.findElement(By.id("slv"));
		Select select1=new Select(slvLB);
		List<WebElement> options1 = select1.getOptions();
		int count1=options1.size();
		
		for(int i=0;i<count1;i++)
		{
			WebElement option=options1.get(i);
			String text=option.getText();
			System.out.println(text);
		}
		
		System.out.println("---------Reverse List----------");
		
		for(int i=count1-1;i>=0;i--)
		{
			WebElement option=options1.get(i);
			String text=option.getText();
			System.out.println(text);
		}
		
		System.out.println("----------------------------------------------------------------------");
		
		WebElement ccdLB=driver.findElement(By.id("ccd"));
		Select select2=new Select(ccdLB);
		List<WebElement> options2 = select2.getOptions();
		int count2=options2.size();
		
		for(int i=0;i<count2;i++)
		{
			WebElement option=options2.get(i);
			String text=option.getText();
			System.out.println(text);
		}
		
		System.out.println("---------Reverse List----------");
		
		for(int i=count2-1;i>=0;i--)
		{
			WebElement option=options2.get(i);
			String text=option.getText();
			System.out.println(text);
		}
		
		Thread.sleep(1000);
		driver.close();
	}
}
