package actionsss;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//right click on the link and open the page in new window/tab
public class ActionsDemo2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		WebElement linkText = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.contextClick(linkText).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(1000);
		driver.quit();
	}
}



