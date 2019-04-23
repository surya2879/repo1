package Utility;

import TestBase.Base;

public class Validate extends Base {
	 public static boolean isUrl(String exp)
	 {
		String act = driver.getCurrentUrl();
		boolean b = act.contains(getConfig(exp));
		return b;
	 }
	
	 public static boolean isTilte(String exp)
	 {
		String act = driver.getTitle();
	    boolean b = act.contains(getConfig(exp));
		return b;
	 }
	 
	 public static boolean isAlert(String exp)
	 {
		 String act=driver.switchTo().alert().getText();
		 boolean b=act.contains(getConfig(exp));
		 return b;
	 }
}
