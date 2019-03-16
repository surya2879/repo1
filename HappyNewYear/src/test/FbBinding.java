package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbBinding
{
private WebElement emailTB;
private WebElement pwTB;                              //declaration
private WebElement loginBTN;

public FbBinding(WebDriver driver)
 {
	emailTB=driver.findElement(By.id("email"));
	pwTB=driver.findElement(By.id("pass"));           //initialization
	loginBTN=driver.findElement(By.id("u_0_2"));
 }
public void setEmail(String email)
 {
	emailTB.sendKeys(email);
 }
public void setPwd(String pwd)
 {
	pwTB.sendKeys(pwd);                               //utilization
 }
public void clickLogin()
 {
	loginBTN.click();
 }
}
