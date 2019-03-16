package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameOflogo {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String xp="//u[text()='Facebook']";
		WebElement logo = driver.findElement(By.xpath(xp));
		String name = logo.getTagName();
		if(name.equals("img"))
			System.out.println("image");
		else
			System.out.println("not an image");
		
		Thread.sleep(1000);
		driver.close();
	}
}
