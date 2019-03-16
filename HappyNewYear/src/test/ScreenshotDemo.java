package test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
	 String path="./images/google.png";
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://www.google.com");
     TakesScreenshot ts=(TakesScreenshot)driver;
     File srcFile = ts.getScreenshotAs(OutputType.FILE);
     File destFile=new File(path);
     FileUtils.copyFile(srcFile, destFile);
     driver.close();
   }
}