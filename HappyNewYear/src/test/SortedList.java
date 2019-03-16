package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedList {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/hotel.html");
		WebElement mtrLB = driver.findElement(By.id("mtr"));
		Select select=new Select(mtrLB);
		List<WebElement> allOptions = select.getOptions();
		//System.out.println(allOptions.size());
		List<String> texts = new ArrayList<String>();
		
		System.out.println("--------unsorted------");
		
		//using foreach loop
		for(WebElement e:allOptions)
		{
			String text=e.getText();
			texts.add(text);
			System.out.println(text);
		}
		
		System.out.println("--------sorted---------");
		
		Collections.sort(texts);
		
		for(String s:texts)
		{
			System.out.println(s);
		}
		
		//without for loop
		//	WebElement option = select.getWrappedElement();
			//System.out.println(option.getText());
			 
			//using for loop
		/*	for(int i=0;i<allOptions.size();i++)
			{
				WebElement option1=allOptions.get(i);
				System.out.println(option.getText());
			}*/
		
		
		WebElement slvLB=driver.findElement(By.id("slv"));
		Select select1=new Select(slvLB);
		
		List<WebElement> allOpts = select1.getOptions();
		List<String> lst=new ArrayList<String>();
		
		//System.out.println(allOpts.size());
		System.out.println("--------unsorted------");
		
		for(int i=0;i<allOpts.size();i++)
		{
			WebElement option2 = allOpts.get(i);
			String text=option2.getText();
			System.out.println(text);
			lst.add(text);
		}
		
		System.out.println("--------sorted---------");
		
		Collections.sort(lst);
		
		for(String s:lst)
		{
			System.out.println(s);
		}
		
		WebElement ccdLB=driver.findElement(By.id("ccd"));
		Select select2=new Select(ccdLB);
		List<WebElement> ccdOpts = select2.getOptions();
		List<String> list=new ArrayList<String>();
		
		System.out.println("--------unsorted------");
		
		for(WebElement ccd:ccdOpts)
		{
			String text=ccd.getText();                              //using for each
			System.out.println(text);
			list.add(text);
		}
		
		System.out.println("--------sorted---------");
		
		Collections.sort(list);
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		/*for(int i=0;i<ccdOpts.size();i++)
		{
			WebElement ccd = ccdOpts.get(i); //using for loop
			String text=ccd.getText();
			System.out.println(text);
		}*/
		//System.out.println(ccdOpts.size());
		//WebElement ccdoptions = select2.getWrappedElement();//without using loop
		//System.out.println(ccdoptions.getText());
		
		Thread.sleep(1000);
		driver.close();
		
	}
}
