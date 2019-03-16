package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDemo2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/lenovo/Desktop/hotel.html");
		driver.manage().window().maximize();
		WebElement slvLB = driver.findElement(By.id("slv"));
		Select slv=new Select(slvLB);
		Thread.sleep(2000);
		WebElement option = slv.getFirstSelectedOption();
		String text=option.getText();
		System.out.println(text);
		List<WebElement> allOptions = slv.getOptions();
		System.out.println(allOptions.size());
		for(WebElement v:allOptions)
		{
			String t=v.getText();
			System.out.println(t);
			
		}
		//print list box options without using loop
		WebElement w = slv.getWrappedElement();
		System.out.println(w.getText());
		//driver.close();
	}
}
