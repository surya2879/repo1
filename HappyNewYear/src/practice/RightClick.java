package practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String xp="//a[text()='Forgotten account?']";
		WebElement link = driver.findElement(By.xpath(xp));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.contextClick(link).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
	}
}
