package test;

import java.awt.Robot;


public class RobotDemo {
	static
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		
		Thread.sleep(1000);
		Robot r=new Robot();
		for(int i=1;i<=200;i++)
		{
			r.mouseMove(1, 100);
			Thread.sleep(500);
}
	}
	}