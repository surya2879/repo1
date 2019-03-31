package mindq;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
	    WebElement deptCity=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT" ));
		deptCity.click();
		List<WebElement> deptCities = driver.findElements(By.xpath("//a[@href='#']"));
		int count=deptCities.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement city=deptCities.get(i);
			String text=city.getText();
			System.out.println(text);
		}
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		
		driver.switchTo().activeElement().sendKeys("bh");
		
		WebElement date = driver.findElement(By.xpath("//a[text()='25']"));
		date.click();
		
		WebElement passengers = driver.findElement(By.id("divpaxinfo"));
		passengers.click();
		
		WebElement plusIcon = driver.findElement(By.id("hrefIncAdt"));
		plusIcon.click();
		
		WebElement doneBTN = driver.findElement(By.id("btnclosepaxoption"));
		doneBTN.click();
		
		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select select=new Select(currency);
		select.selectByIndex(2);
		
		driver.close();
		
	}
}
