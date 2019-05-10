package Utility;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import javax.imageio.ImageIO;

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

//take screenshot
public static void takeScreenshot(String screenshotName) throws Exception
{
	Robot r=new Robot();
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rec=new Rectangle(d);
	BufferedImage bi=r.createScreenCapture(rec);
	ImageIO.write(bi, "png", new File(".\\Screen\\"+screenshotName+".png"));
}
}
