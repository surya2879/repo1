package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//print the content of listbox in sorted order
public class ListDemo3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/lenovo/Desktop/hotel.html");
		driver.manage().window().maximize();
		WebElement mtrLB=driver.findElement(By.id("mtr"));
		Select select=new Select(mtrLB);
		List<WebElement> allOptions = select.getOptions();
		List<String> allText = new ArrayList<String>();
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			allText.add(text);
		}
		Collections.sort(allText);
		for(String text:allText)
		{
			System.out.println(text);
		}
		driver.close();
	}
}
