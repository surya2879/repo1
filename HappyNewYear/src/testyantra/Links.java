package testyantra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); //open the browser
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/testyantraquestion.html");//enter the URL
		List<WebElement> allLinks = driver.findElements(By.xpath("//a")); //find all the links
		int count=allLinks.size();  
		System.out.println(count);  //print the count 
		for(int i=0;i<count;i++)
		{
			WebElement link = allLinks.get(i);
			System.out.println(link);   //get the address of all the links
			if(i==count-1)             //click on last link
			{
				Thread.sleep(1000);
				link.click();
			}
		//	allLinks.get(3).click();
		}
		driver.close(); //close the browser
	}
}
