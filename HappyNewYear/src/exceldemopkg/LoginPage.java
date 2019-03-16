package exceldemopkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")
private WebElement unTb;

@FindBy(name="pwd")
private WebElement pwTb;

@FindBy(xpath="//div[text()='Login ']")
private WebElement loginBtn;

public LoginPage (WebDriver driver)
{
	PageFactory.initElements(driver,this );
}

public void setUserName(String un)
{
	unTb.sendKeys(un);
}

public void setPassword(String pw)
{
	pwTb.sendKeys(pw);
}

public void clickLogin()
{
	loginBtn.click();
}

}
