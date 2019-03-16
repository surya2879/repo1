package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winhan2 {
static
{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	String s=driver.getPageSource();
	System.out.println(s);
	String s1=driver.getWindowHandle();
	System.out.println(s1);
	driver.quit();
	
}

}
