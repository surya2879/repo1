package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.id("FromTag")).sendKeys("Ban");

	    String xp="//a[contains(text(),'Ban')]";
		Thread.sleep(3000);
		List<WebElement> allASE = driver.findElements(By.xpath(xp));
		int count=allASE.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement ase=allASE.get(i);
			String text=ase.getText();
			System.out.println(text);
		}
		Thread.sleep(3000);
		allASE.get(0).click();
		driver.close();
	}
	

}
