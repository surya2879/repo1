package test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//get window handle of parent browser
		String parent=driver.getWindowHandle();
		
		//set ITO
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter URL
		driver.get("http://surya/login.do");
		
		//click on license link
		driver.findElement(By.id("licenseLink")).click();
		
		//get the window handles of all the browsers
		Set<String> allWHS = driver.getWindowHandles();
		
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
		}
		
		//find all the sections
		List<WebElement> allH = driver.findElements(By.xpath("//h2"));
		int count=allH.size();
		
		//print the count 
		System.out.println(count);
		
	    //print the label of all the sections	
		for(WebElement h:allH)
		{
			System.out.println(h.getText());
		}
		
		//close the license agreement window
		driver.close();
		Thread.sleep(1000);
		
		//switch to parent browser(login window)
		driver.switchTo().window(parent);
		//close the parent browser
		driver.close();
		
	}
}
