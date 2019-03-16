package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//selenium script to close specified browser
public class SwitchWindow2 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	String parent=driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		Set<String> allWhs = driver.getWindowHandles();
		for(String wh:allWhs)
		{
			//System.out.println(wh);
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		}
		if(driver.getTitle().equals("Technosoft"))
		    driver.close();
		
	//	WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleContains("Technosoft"));
		//driver.close();
		
	 
	}
	}

