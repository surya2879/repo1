package test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//print the content of listbox in sorted order and without duplicates

public class ListDemo4 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/lenovo/Desktop/hotel1.html");
		driver.manage().window().maximize();
		WebElement mtrLB=driver.findElement(By.id("mtr"));
		Select select=new Select(mtrLB);
		List<WebElement> allOptions = select.getOptions();
		Set<String> allText=new TreeSet<String>();
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			allText.add(text);
		}
		for(String text:allText)
		{
			System.out.println(text);
		}
		//driver.close();
	}
}
