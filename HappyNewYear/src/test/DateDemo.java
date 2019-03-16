package test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) {
		Date d=new Date();
		String s=d.toString();
		System.out.println(s);
		
		LocalDate v=LocalDate.now();
		System.out.println(v.toString());
		System.out.println(v.plusDays(2));
		System.out.println(v.plusDays(-32));
		
		System.out.println(d);
		SimpleDateFormat s1=new SimpleDateFormat("yyyy-MMM-dd");
		System.out.println(s1.format(d));
		
		
	}
}
