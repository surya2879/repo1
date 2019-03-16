package webelementprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
//script to print X and Y co-ordinate of the textbox
public class Demo2 {
	
		static
		{
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		}
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.opensourcebilling.org/");
			WebElement un = driver.findElement(By.id("email"));
			Thread.sleep(1000);
			
			int x=un.getLocation().getX();
			System.out.println(x);
			
			int y=un.getLocation().getY();
			System.out.println(y);
			
			Thread.sleep(1000);
			WebElement pwd = driver.findElement(By.id("password"));
			int x1=pwd.getLocation().getX();
			System.out.println(x1);
			
			int y1=pwd.getLocation().getY();
			System.out.println(y1);
		}
}

