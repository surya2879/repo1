package test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) {
		
		File f=new File("./cv/surya 3 yrs selenium.docx");
		String absolutepath=f.getAbsolutePath();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/lenovo/Desktop/cv2.html");
		WebElement browserButton = driver.findElement(By.id("cv"));
		browserButton.sendKeys(absolutepath);
		
	}
}

