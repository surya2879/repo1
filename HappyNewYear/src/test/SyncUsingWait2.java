package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncUsingWait2 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
		Thread.sleep(2000);
		String xp="//div[text()='Login ']";
		driver.findElement(By.xpath(xp)).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Enter"));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}
}
