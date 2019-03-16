package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin3 {
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
	
	lp.setUserName("admin");
	lp.setPassword("manager");
	lp.clickLogin();
}
}
