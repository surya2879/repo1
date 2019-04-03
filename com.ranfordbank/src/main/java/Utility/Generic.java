package Utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic {
public static void dp_handle(WebElement element,String expected)
{
	Select s=new Select(element);
	List<WebElement> list=s.getOptions();
	for(WebElement op:list)
	{
		String text=op.getText();
		System.out.println(text);
		if(text.contains(expected))
		{
			s.selectByVisibleText(text);
			break;
		}
	}
}
}
