package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDemo5 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/hotel.html");
		WebElement mtrLB = driver.findElement(By.id("mtr"));
		Select select =new Select(mtrLB);
	    List<WebElement> options = select.getOptions();
	    int count=options.size();
	    System.out.println(count);
	    for(int i=0;i<count;i++)
	    {
	    	WebElement option=options.get(i);
	    	String text=option.getText();
	    	System.out.println(text);
	    	
	    }
	  WebElement slvLB = driver.findElement(By.id("slv"));
	  Select select1=new Select(slvLB);
	  select1.selectByIndex(2);
	  Thread.sleep(2000);
	  select1.selectByVisibleText("KesariBath");
	  Thread.sleep(2000);
	  select1.selectByValue("k");
	  Thread.sleep(2000);
	  List<WebElement> so = select1.getOptions();
	  int count1=so.size();
	  System.out.println(count1);
	  for(int i=0;i<count1;i++)
	  {
		  WebElement option=so.get(i);
		  String text=option.getText();
		  System.out.println(text);
	  }
	  

	    
	   WebElement ccdLB = driver.findElement(By.id("ccd"));
	   Select select2=new Select(ccdLB);
	   select2.selectByVisibleText("Tea");
	   Thread.sleep(2000);
	   select2.selectByValue("c");
	   Thread.sleep(2000);
	   List<WebElement> so2 = select2.getOptions();
	   int count2=so2.size();
	   System.out.println(count2);
	   for(int i=0;i<count2;i++)
	   {
		   WebElement option=so2.get(i);
		   String text=option.getText();
		   System.out.println(text);
		   
	   }
	   
	    driver.close();
	    
	    
	}
}
