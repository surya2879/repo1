package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//declaration
	private WebElement unTB; 
	private WebElement pwTB;
	private WebElement loginBTN;
	
    public  LoginPage (WebDriver driver)
	{
		//initialization
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		loginBTN=driver.findElement(By.xpath("//div[text()='Login ']"));
    }
	  //utilization
	public void setUserName(String un)
	{
		unTB.sendKeys(un); 
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
}
