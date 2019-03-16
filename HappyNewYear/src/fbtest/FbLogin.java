package fbtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		FbPom fb=new FbPom(driver);
		fb.setEmail("surya.sway@gmail.com");
		fb.setPwd("1234");
		fb.clickLogin();
		Thread.sleep(1000);
		driver.switchTo().activeElement().clear();
		fb.setEmail("surya.prakash458@gmail.com");
		fb.setPwd("surya");
		fb.clickLogin();
		Thread.sleep(1000);
	//	driver.close();
		
	}
}
