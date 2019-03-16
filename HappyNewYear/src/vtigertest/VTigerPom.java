package vtigertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VTigerPom {
	//declaration
    @FindBy(id="username")
	private WebElement unTB; 
    
    @FindBy(id="password")
	private WebElement pwTB;
    
    @FindBy(xpath="//button[text()='Sign in']")
	private WebElement signinBTN;
    
    //initialization
    public VTigerPom(WebDriver driver)
	{
    	PageFactory.initElements(driver, this);
    }
     
    //utilization
    public void setUserName(String un)
    {
   	unTB.sendKeys(un);
    }
   public void setPwd(String pwd)
    {
   	pwTB.sendKeys(pwd);                              
    }
   public void clickSignin()
    {
	   signinBTN.click();
    }
}
