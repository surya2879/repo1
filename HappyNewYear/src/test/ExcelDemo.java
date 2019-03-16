package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {
public static void main(String[] args) throws Exception {
	String path="./data/book1.xlsx";
	 //open excel file
	 Workbook wb=WorkbookFactory.create(new  FileInputStream(path));
	
	//read go to sheet1->row 0 ,cell 0,get value and print
	 String v=wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
	 System.out.println(v);
	
	//count rows
	int rc=wb.getSheet("Sheet1").getLastRowNum();
	System.out.println(rc);
	
	//read go to sheet1->row 0 ,cell 0,set value 
	wb.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("QSP");
	
	//save it
	wb.write(new FileOutputStream(path));
	
	//close the xl file
	wb.close();                                 
}
}
