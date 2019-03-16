package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/lenovo/Desktop/hotel.html");
		driver.manage().window().maximize();
		WebElement mtrLB = driver.findElement(By.id("mtr"));
		Select select=new Select(mtrLB);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("v");
		Thread.sleep(1000);
		select.selectByVisibleText("Dosa");
		Thread.sleep(1000);
		
		//WebElement slvLB=driver.findElement(By.id("slv"));
		Thread.sleep(1000);
		Select slv=new Select(mtrLB);
		Thread.sleep(1000);
		System.out.println(slv.isMultiple());
		Thread.sleep(1000);
		slv.deselectAll();
		
		WebElement ccdLB = driver.findElement(By.id("ccd"));
		Select ccd=new Select(ccdLB);
		System.out.println(ccd.isMultiple());
		Thread.sleep(1000);
		ccd.selectByValue("t");
		//ccd.deselectByValue("t");
	//	driver.close();
		}
}
