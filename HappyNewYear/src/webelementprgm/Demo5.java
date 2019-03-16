package webelementprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//script to print tagname of the logo

public class Demo5 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement logo = driver.findElement(By.id("hplogo"));
		String s = logo.getTagName();
		System.out.println(s);
		if(s.equals("img"))
		    System.out.println("it's image");
		else
			System.out.println("it's not image");
		 
		//print the  font type of the element
		String q = logo.getCssValue("font-family");
		System.out.println(q);
		
		Thread.sleep(1000);
		driver.close();
	}
}
