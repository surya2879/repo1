package test;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage5 {
	  @FindBy(xpath="//a")
	  private List<WebElement> allLinks; 
	  
	 
	  public LoginPage5(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	public void getLinkCount()
	  {
		  int count=allLinks.size();
		  System.out.println(count);
	  }
}
