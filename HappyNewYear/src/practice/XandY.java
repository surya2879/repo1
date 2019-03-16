package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XandY {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement emailTB = driver.findElement(By.id("email"));
		int x = emailTB.getLocation().getX();
		System.out.println(x);
		int y=emailTB.getLocation().getY();
		System.out.println(y);
	
		WebElement pwdTB = driver.findElement(By.id("pass"));
		int x1=pwdTB.getLocation().getX();
		System.out.println(x1);
		int y1=pwdTB.getLocation().getY();
		System.out.println(y1);
		Thread.sleep(1000);
		driver.close();
	}
}
