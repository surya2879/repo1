package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DepIndepDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.seleniumhq.org");
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		WebElement element=driver.findElement(By.xpath("//td[text()='Python']/..//a"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(1000);
		element.click();
		//driver.navigate().back();
		//driver.quit();
	}
}
