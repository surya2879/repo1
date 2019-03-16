package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//enter the url
		driver.get("http://www.google.com");
		//enter sql in search text box
		driver.switchTo().activeElement().sendKeys("sql");
		Thread.sleep(2000);
		//find the xpath
		String xp="//span[contains(text(),'sql')]";
		//find all the auto suggestions
		List<WebElement> allASE = driver.findElements(By.xpath(xp));
		//count the size of elements
		int count=allASE.size();
		//print the count
		System.out.println(count);
		//get the text of all the  auto suggestions
		for(int i=0;i<count;i++)
		{
			WebElement ase=allASE.get(i);
			String text=ase.getText();
			System.out.println(text);
		}
		//click on the first auto suggestion
		allASE.get(0).click();
		//close the browser
		driver.close();
		
	}
}
