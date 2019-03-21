package actionsss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Crm {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		String xpath="//a[text()='Resources']";
		WebElement ele = driver.findElement(By.xpath(xpath));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		String xp="//a[text()='Contact']";
		WebElement contact = driver.findElement(By.xpath(xp));
		contact.click();
		String xp2="//div[text()='India (Bangalore)']/../..//div[text()='+91 9742255889']";
		WebElement india = driver.findElement(By.xpath(xp2));
		String txt=india.getText();
		System.out.println(txt);
	}
}
