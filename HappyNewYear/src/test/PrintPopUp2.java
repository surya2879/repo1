package test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//handling print pop up in chrome browser
public class PrintPopUp2 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		Robot r=new Robot();
		//press ctrl+p
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		//press 'tab' 3 times 
		Thread.sleep(1000);
		for(int i=1;i<=3;i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
		}
		//press down
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		//press escape
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(1000);
		driver.close();
	}
}
