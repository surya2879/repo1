package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(1000);
		WebElement genderBTN = driver.findElement(By.id("u_0_9"));
		genderBTN.click();
		if(genderBTN.isSelected())
			System.out.println("true");
		else
			System.out.println("false");
		Thread.sleep(1000);
		driver.close();
	}
}
