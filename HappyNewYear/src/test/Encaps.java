package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Encaps {
private WebElement unTB; //declaration

public Encaps(WebDriver driver)
{
	unTB=driver.findElement(By.id("username"));//initialization
}

public void setUserName()
{
	unTB.sendKeys("admin");   //utilization
}
}
