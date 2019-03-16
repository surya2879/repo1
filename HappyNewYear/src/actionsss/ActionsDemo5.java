package actionsss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo5 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		String xp="//a[text()='actiTIME Inc.']";
		WebElement menu = driver.findElement(By.xpath(xp));
		Actions act=new Actions(driver);
		//act.sendKeys(Keys.CONTROL).click(menu).build().perform();
		driver.findElement(By.id("username")).sendKeys("admin",Keys.CONTROL+"c");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.CONTROL+"v");
}
}
