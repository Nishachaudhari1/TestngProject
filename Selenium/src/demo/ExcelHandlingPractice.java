package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandlingPractice {

	public static void main(String [] arg) throws IOException {
		
		
FileInputStream a =new FileInputStream("C:\\Users\\baps\\Desktop\\Selenium Setup\\Testing.xlsx");
	
XSSFWorkbook workbook=new 	XSSFWorkbook(a);
		
	XSSFSheet sheet=workbook.getSheetAt(0);
	for(int i=0;i<=sheet.getLastRowNum();i++) {
	Row row=sheet.getRow(i);	
		
	Cell cell=row.getCell(0);
		System.out.println(cell);
	}
		
		
		
		
	}
}
