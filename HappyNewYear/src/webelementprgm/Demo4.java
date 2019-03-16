package webelementprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//script to print the value(text) of the attribute
public class Demo4 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opensourcebilling.org/");
		WebElement un = driver.findElement(By.id("email"));
		String text=un.getAttribute("value");
		System.out.println(text);
}
}
