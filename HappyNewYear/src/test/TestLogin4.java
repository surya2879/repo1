package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin4 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	
	//handling StaleElementReferenceException
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	    LoginPage2 lp=new LoginPage2(driver);
	    lp.setUserName("adm");
	    lp.setPassword("mana");
	    lp.clickLogin();
	    Thread.sleep(1000);
	    lp.setUserName("admin");
	    lp.setPassword("manager");
	    lp.clickLogin();
	    Thread.sleep(1000);
	    driver.close();
	}
}
