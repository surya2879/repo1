package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement emailTB = driver.findElement(By.id("email"));
		int height = emailTB.getSize().getHeight();
		System.out.println(height);
		int width = emailTB.getSize().getWidth();
		System.out.println(width);
		WebElement pwdTB = driver.findElement(By.id("pass"));
		int height1 = pwdTB.getSize().getHeight();
		System.out.println(height1);
		int width1=pwdTB.getSize().getWidth();
		System.out.println(width1);
		Thread.sleep(1000);
		driver.close();
		
		
		
	}
}
