package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextOfLink {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
        String xp="//a[text()='Forgotten account?']";
        WebElement link = driver.findElement(By.xpath(xp));
        String text = link.getText();
        System.out.println(text);
        Thread.sleep(1000);
        driver.close();
}
}
