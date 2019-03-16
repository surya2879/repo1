package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingTab {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//get window handle of parent browser
		String parent=driver.getWindowHandle();
		
		//set ITO
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter the URL
		driver.get("http://localhost/login.do");
		
		//click on 'Actimind Inc.' link
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(2000);
		
		//get the window handles of all the browsers
		Set<String> allWHS = driver.getWindowHandles();
		
		//count the no. of browsers
		int count=allWHS.size();
		
		//print the count
		System.out.println(count);
		
		//get the title of all browsers
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
		
		//set ETO
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cookie-button--got-it")));
		Thread.sleep(2000);
		driver.findElement(By.id("cookie-button--got-it")).click();
		
		driver.close();
		driver.switchTo().window(parent);
		driver.close();
		
	}
}
