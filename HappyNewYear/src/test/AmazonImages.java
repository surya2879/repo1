package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonImages {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		List<WebElement> allImages = driver.findElements(By.xpath("//img"));
		int count=allImages.size();
		System.out.println("no. of images in amazon.com are " +count);
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int count1=allLinks.size();
		System.out.println("no. of links in amazon.com are " +count1);
		for(int i=0;i<count1;i++)
		{
			WebElement link = allLinks.get(i);
			System.out.println(link.getText());
			
		}
		driver.close();
	}
}
