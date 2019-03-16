package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classwork {
static
{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.gmail.com");
	driver.manage().window().maximize();
	String s=driver.getWindowHandle();
	System.out.println(s);
}
}
