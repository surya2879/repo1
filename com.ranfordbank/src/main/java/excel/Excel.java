package excel;

import java.io.File;
import java.io.IOException;

import TestBase.Base;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel extends Base {
	   static   String folderpath=getConfig("excelfolderpath"); 
	     
	  static  Sheet sh;
	public static void excelconnection(String filename,String sheetname) throws BiffException, IOException
	{
		File f=new File(folderpath+filename);
		
		Workbook wb=Workbook.getWorkbook(f);
		
		 sh=wb.getSheet(sheetname);
		
	}
	public static int getrows()
	{
		int rows=sh.getRows();
		return rows;
	}
	
	public static void getcolumns()
	{
		int col=sh.getColumns();
	}
	public static String readdata(int col,int row)
	{
		String data=sh.getCell(col, row).getContents();
		return data;
	}
}
