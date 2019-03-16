package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/submit.html");
		String xp="//button[text()='Submit']";
		WebElement submitBTN = driver.findElement(By.xpath(xp));
	//	submitBTN.submit();
		//submitBTN.click();
		submitBTN.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.close();
	}
}
