package webelementprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//check whether the checkbox is selected or not
public class Demo8 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		WebElement chkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		chkbox.click();
		if(chkbox.isSelected())
			System.out.println(" 'keep me logged in' checkbox is selected");
		else
			System.out.println(" 'keep me logged in' checkbox is not selected");
		
		Thread.sleep(1000);
		driver.close();
				
	}
}
