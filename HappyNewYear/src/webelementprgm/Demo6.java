package webelementprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//script to check whether textbox is displayed or not
public class Demo6 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		WebElement un = driver.findElement(By.id("username"));
		if(un.isDisplayed())
		    System.out.println("username textbox is displayed");
		else
			System.out.println("username textbox is not displayed");
		
		//check whether username textbox is enabled or not
		
		if(un.isEnabled())
			System.out.println("username textbox is enabled");
		else 
			System.out.println("username textbox is not enabled");
		
		Thread.sleep(1000);
		driver.close();
	}
}
