package webelementprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//script to print the text of the link
public class Demo3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opensourcebilling.org/");
		WebElement linkText = driver.findElement(By.xpath("//a[text()='presstigers.com']"));
		String text=linkText.getText();
		System.out.println(text);
		Thread.sleep(1000);
		linkText.click();
		driver.quit();
		
}
}

