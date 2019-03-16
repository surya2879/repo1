package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSendKeys {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*js.executeScript("document.getElementById('username').value='admin'");
		js.executeScript("document.querySelectorAll('pwd').value='manager'");*/
		js.executeScript("window.location='http://google.com'");
  }
}
