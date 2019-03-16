package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement emailTB = driver.findElement(By.id("email"));
		if(emailTB.isDisplayed())
			System.out.println("displayed");
		else
			System.out.println("not displayed");
		
		if(emailTB.isEnabled())
			System.out.println("enabled");
		else
			System.out.println("not enabled");
		Thread.sleep(1000);
		driver.close();
	}
}
