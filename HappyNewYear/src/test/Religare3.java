package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Religare3 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String url = "https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care";
	driver.get(url);
	
	driver.findElement(By.id("policynumber")).sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.id("dob")).click();
	Thread.sleep(2000);
	
	String xp1="//select[@data-handler='selectYear']";
	WebElement ele1 = driver.findElement(By.xpath(xp1));
	Select year=new Select(ele1);
	year.selectByVisibleText("1991");
	Thread.sleep(2000);
	
	String xp2="//select[@data-handler='selectMonth']";
	WebElement ele2= driver.findElement(By.xpath(xp2));
	Select month=new Select(ele2);
	month.selectByVisibleText("May");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='26']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("alternative_number")).sendKeys("9044365267");
	Thread.sleep(2000);
	driver.findElement(By.id("renew_policy_submit")).click();
	Thread.sleep(2000);
	
	driver.close();
	}
}
