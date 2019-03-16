package fbtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPom {
	//declaration
    @FindBy(id="email")
	private WebElement emailTB; 
    
    @FindBy(id="pass")
	private WebElement pwTB;
    
    @FindBy(id="u_0_2")
	private WebElement loginBTN;
    
    //initialization
    public FbPom(WebDriver driver)
	{
    	PageFactory.initElements(driver, this);
    }
     
    //utilization
    public void setEmail(String email)
    {
   	emailTB.sendKeys(email);
    }
   public void setPwd(String pwd)
    {
   	pwTB.sendKeys(pwd);                              
    }
   public void clickLogin()
    {
   	loginBTN.click();
    }
}
