package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
static
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	LoginPage lp=new LoginPage(driver);
	lp.setUserName("adm");
	Thread.sleep(1000);
	lp.setPassword("mana");
	lp.clickLogin();
	Thread.sleep(1000);
	lp.setUserName("admin");
	Thread.sleep(1000);
	lp.setPassword("manager");
	lp.clickLogin();
}
}
