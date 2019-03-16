package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingTab2 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Thread.sleep(2000);
		Set<String> allWHS = driver.getWindowHandles();
		int count=allWHS.size();
		System.out.println("no. of tabs is:"+count);
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
		WebDriverWait wait=new 	WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cookie-button--got-it")));
		driver.findElement(By.id("cookie-button--got-it")).click();
	//	Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
