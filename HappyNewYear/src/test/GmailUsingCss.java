package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailUsingCss {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args)throws InterruptedException {
	
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.gmail.com");
	    driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("surya.prakash458@gmail.com");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[aria-label='Enter your password']")).sendKeys("swayamprada10400");
		//driver.findElement(By.cssSelector("input[aria-label='Enter your password']")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("swayamprada10400");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	   driver.findElement(By.cssSelector("span[class='gb_cb gbii']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='gb_Aa gb_xg gb_Eg gb_ef gb_Tb']")).click(); 
	//	driver.findElement(By.partialLinkText("Social")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
