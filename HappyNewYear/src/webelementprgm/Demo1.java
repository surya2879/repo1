package webelementprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opensourcebilling.org/");
		WebElement un = driver.findElement(By.id("email"));
		Thread.sleep(1000);
		//un.clear();    //remove the value present in the textbox
		int height=un.getSize().getHeight();  //height of the un textbox
		System.out.println(height);
		
		int width=un.getSize().getWidth();    //width of the un textbox
		System.out.println(width);
		
		Thread.sleep(1000);
		WebElement pwd = driver.findElement(By.id("password"));
		
		int height1=pwd.getSize().getHeight();  //height of the pwd textbox
		System.out.println(height1);
		
		int width1=pwd.getSize().getWidth();    //width of the pwd textbox
		System.out.println(width1);
		
		Thread.sleep(1000);
		driver.close();
	}
}
