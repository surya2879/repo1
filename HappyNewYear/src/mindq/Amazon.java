package mindq;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Departments']"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
	    act.moveToElement(ele).build().perform();
	    Thread.sleep(1000);
	    List<WebElement> allTexts = driver.findElements(By.id("nav-flyout-shopAll"));
	    int count=allTexts.size();
	    System.out.println(count);
		for(WebElement element:allTexts)
		{
			String text=element.getText();
			System.out.println(text);
		}
		driver.close();
	}
}
