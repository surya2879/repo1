package vtigertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTigerLoginTest {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		VTigerPom vp=new VTigerPom(driver);
		vp.setUserName("surya");
		vp.setPwd("swayam");
		vp.clickSignin();
	}
}
