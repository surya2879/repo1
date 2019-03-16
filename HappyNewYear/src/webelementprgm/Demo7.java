package webelementprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//script to check whether password textbox is enabled or not
public class Demo7 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("file:///C:/Users/lenovo/Desktop/disabled.html");
        WebElement pw = driver.findElement(By.id("t2"));
        if(pw.isEnabled())
        	System.out.println("pw textbox is enabled");
        else
         	System.out.println("pw textbox is not enabled");
        
        driver.close();

}
}
