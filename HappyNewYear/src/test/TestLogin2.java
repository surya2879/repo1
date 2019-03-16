package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin2 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	LoginPage lp=new LoginPage(driver);
	lp.setUserName("adm");
	lp.setPassword("man");
	lp.clickLogin();
	//driver.close();
}
}
