package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo2 {
public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
	String path="./data/book1.xlsx";
	Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	String s1=wb.getSheet("Sheet3").getRow(0).getCell(0).toString();
	System.out.println(s1);
	String s2=wb.getSheet("Sheet3").getRow(1).getCell(0).toString();
	System.out.println(s2);
  }
}
