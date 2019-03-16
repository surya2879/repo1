package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo2 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/page1.html");
		
		driver.findElement(By.id("t1")).sendKeys("surya");
	    driver.switchTo().frame("f1");
		Thread.sleep(1000);
		
	    driver.findElement(By.id("t2")).sendKeys("surya");
	    Thread.sleep(1000);
	    driver.switchTo().parentFrame();
	    
	    driver.findElement(By.id("t1")).sendKeys(" prakash");
	    driver.switchTo().frame(0);
	    Thread.sleep(1000);
	    driver.findElement(By.id("t2")).sendKeys(" prakash");
	    Thread.sleep(1000);
	   
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("t1")).sendKeys(" sharma");
	    Thread.sleep(1000);
	    WebElement e = driver.findElement(By.id("f1"));
	    driver.switchTo().frame(e);
	    driver.findElement(By.id("t2")).sendKeys(" sharma");
	    
	    Thread.sleep(2000);
	    driver.close();
	  }
	}
