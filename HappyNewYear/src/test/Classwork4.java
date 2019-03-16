package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classwork4 {
static
{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
}
public static void main(String[] args) //throws Exception {
	{WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	WebElement ele=driver.switchTo().activeElement();
    ele.sendKeys("surya");
   // Thread.sleep(1000);
   // ele.sendKeys(Keys.CONTROL+"a");
  //  Thread.sleep(1000);
    //ele.sendKeys(Keys.DELETE);
  //  Thread.sleep(1000);
    ele.clear();
    ele.sendKeys("rahul");
    
	
}
}
