package TestBase;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {
	public static WebDriver driver;
	static Properties p;
	
public static void loadProperty()
{
	try {
		File f=new File(".\\src\\main\\java\\configuration\\OR.properties");
		FileReader fr=new FileReader(f);
		p=new Properties();
		p.load(fr);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public static By getElement(String key)
{
	loadProperty();
	By loc=null;
	String value=p.getProperty(key);
	String loctype=value.split(":")[0];
	String locvalue=value.split(":")[1];
	switch (loctype) {
	case "id":
		loc=By.id(locvalue);
		break;

	case "name":
		loc=By.name(locvalue);
		break;
		
	case "xpath":
		loc=By.xpath(locvalue);
		break;
	}
	return loc;
 }

public static void loadPropertyConfig()
{
	try {
		File f=new File(".\\src\\main\\java\\configuration\\config.properties");
		FileReader fr=new FileReader(f);
		p=new Properties();
		p.load(fr);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public static String getConfig(String key)
{
	loadPropertyConfig();
	String val=p.getProperty(key);
	return val;
	}
}
