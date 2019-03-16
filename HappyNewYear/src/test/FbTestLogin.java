package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTestLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		FbBinding fbn=new FbBinding(driver);
		fbn.setEmail("surya.prakash458@gmail.com");
		Thread.sleep(1000);
		fbn.setPwd("abc");
		fbn.clickLogin();
		Thread.sleep(1000);
		driver.close();
    }
}
