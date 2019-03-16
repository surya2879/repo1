package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Font {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	//	WebElement emailTB = driver.findElement(By.id("email"));
		//String f = emailTB.getCssValue("font-family");
		//System.out.println(f);
		driver.findElement(By.id("email")).sendKeys("surya");
		driver.findElement(By.id("pass")).sendKeys("swayam");
		driver.findElement(By.id("u_0_3")).click();
	
	}
}
