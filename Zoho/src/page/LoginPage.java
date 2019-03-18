package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//declaration
public class LoginPage {
@FindBy(id="username")
private WebElement unTB;

@FindBy(name="pwd")
private WebElement pwTB;

@FindBy(xpath="//div[text()='Login ']")
private WebElement loginBTN;

@FindBy(xpath="//span[conatins(text(),'invalid')]")
private WebElement errMsg;

//initialization
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
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

public void verifyErrMsgDisplayed()
{
	Assert.assertTrue(errMsg.isDisplayed());
}
}
