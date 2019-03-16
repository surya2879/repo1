package test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowDemo2 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        String parent = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("licenseLink")).click();
		Set<String> allWHS = driver.getWindowHandles();
		int count=allWHS.size();
		System.out.println(count);
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		
		}
		List<WebElement> lebels = driver.findElements(By.xpath("//h2"));
		for(WebElement we:lebels)
		{
			System.out.println(we.getText());
		}
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close();
		
	}
}
