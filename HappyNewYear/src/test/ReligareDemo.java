package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReligareDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//set implicit timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
		
		//enter policy number
		driver.findElement(By.id("policynumber")).sendKeys("P123");
		
		//click dob
		driver.findElement(By.id("dob")).click();
		
		//click first date
		driver.findElement(By.linkText("1")).click();
		
		//enter contact number
		driver.findElement(By.id("alternative_number")).sendKeys("9044365267");
		
		//click let's renew button
		driver.findElement(By.id("renew_policy_submit")).click();
		
		
	}
}
