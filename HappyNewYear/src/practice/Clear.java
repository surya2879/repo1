package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
      //  WebElement un = driver.findElement(By.name("q"));
		WebElement un1 = driver.switchTo().activeElement();
		un1.sendKeys("surya");
      //  un.sendKeys("surya");
		Thread.sleep(1000);
		un1.clear();
	//	un.clear();
	   // un.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
	    //un.sendKeys("varsha");
}
}
