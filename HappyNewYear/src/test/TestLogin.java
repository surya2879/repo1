package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	LoginPage lp=new LoginPage(driver);
	lp.setUserName("admin");
	lp.setPassword("manager");
	lp.clickLogin();
	driver.close();
}
}
