package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/page1.html");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("q");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("q");
		
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("s");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("s");
		
		WebElement e = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("t2")).sendKeys("p");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("p");
		
		Thread.sleep(1000);
		driver.close();
	}
}
