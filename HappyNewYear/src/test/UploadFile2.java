package test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile2 {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
public static void main(String[] args) {
	File f=new File("./Cv2/surya 3yrs java selenium.docx");
	String absolutepath = f.getAbsolutePath();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/lenovo/Desktop/cv3.html");
	driver.findElement(By.id("cv2")).sendKeys(absolutepath);
//	driver.close();
}
}
