package test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCount4 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		driver.get("https://www.naukri.com");
		Set<String> allWHS = driver.getWindowHandles();
		int count=allWHS.size();
		System.out.println(count);//count the no. of browsers
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());//print the title of all the browsers
		}
		//close only parent browser
		driver.switchTo().window(parent);
		Thread.sleep(1000);
		driver.close();
	}
}
