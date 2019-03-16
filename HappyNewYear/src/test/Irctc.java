package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irctc {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
     	//go to IRCTC login
		driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		
		//click login button
		driver.findElement(By.id("loginbutton")).click();
		
		//wait till JS pop-up is displayed
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		//click OK button present on the pop-up
		Alert alert = driver.switchTo().alert();
		
		//get message and print
		System.out.println(alert.getText());
		
		//click OK
		alert.accept();
		
		//click cancel
	//	alert.dismiss();
		
		driver.close();
	
		
	}
}
