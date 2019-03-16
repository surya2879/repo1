package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbusingcss {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}

public static void main(String[] args)throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	    driver.get("http://www.facebook.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("input[type='email']")).sendKeys("surya.prakash458@gmail.com");
	    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abc");
	    driver.findElement(By.cssSelector("input[value='Log In']")).sendKeys(Keys.ENTER);
	    
}
}
