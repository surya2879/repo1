package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://surya/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		while(true)
		{
			try
			{
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				System.out.println("logout link is found and clicked");
				break;
			}
			catch(Exception e)
			{
				System.out.println("logout link is not found.will try again");
				
			}
		}
		System.out.println("End");
		driver.close();
	}
}
