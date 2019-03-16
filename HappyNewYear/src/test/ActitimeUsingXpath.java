package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeUsingXpath {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://surya/login.do");
	  //  driver.findElement(By.linkText("Actimind Inc.")).click();
		//Thread.sleep(1000);
	  //  driver.findElement(By.linkText("License for using this software")).click();
	    //Thread.sleep(1000);
	    //Thread.sleep(1000);
	 //   driver.quit();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Login']")).click();
	    Thread.sleep(1000);
	    driver.quit();
	
	}
}
