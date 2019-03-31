package mindq;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/");
		String xp="//a[@title='Search W3Schools']";
		WebElement searchIcon = driver.findElement(By.xpath(xp));
		searchIcon.click();
		WebElement searchTb = driver.findElement(By.id("gsc-i-id1"));
		searchTb.sendKeys("json");
		searchTb.sendKeys(Keys.ENTER);
		driver.switchTo().frame(0);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count=allLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement link = allLinks.get(i);
			System.out.println(link.getText());
		}
		allLinks.get(0).click();
		//driver.close();
	}
}
