package exceldemopkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path="./data/book1.xlsx";
	    Workbook wb=WorkbookFactory.create(new  FileInputStream(path));
	    String un=wb.getSheet("Sheet2").getRow(0).getCell(0).toString();
	    String pw=wb.getSheet("Sheet2").getRow(1).getCell(0).toString();
	    
	    WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://localhost/login.do");
	    LoginPage l=new LoginPage(driver);
	    l.setUserName(un);
	    l.setPassword(pw);
	    l.clickLogin();
}
}
