package test;

import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCount5 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		 Set<String> allWHS = driver.getWindowHandles();
		int count=allWHS.size();
		System.out.println(count);
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
		}
		if(driver.getWindowHandle().equalsIgnoreCase(""))
			driver.close();
	     /*	if(driver.getTitle().equals("Amazon"))
			driver.close();*/
	}
}

