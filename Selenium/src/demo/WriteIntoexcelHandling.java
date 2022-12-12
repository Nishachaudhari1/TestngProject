package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoexcelHandling {
public static void main(String [] arg) throws IOException  {
	
	
	String path=("C:\\Users\\baps\\Desktop\\Selenium Setup\\Testing.xlsx");
	FileInputStream a= new FileInputStream (path);
	
     Workbook wb=new XSSFWorkbook(a);  
	Sheet sheet= wb.getSheetAt(0);

	for(int i=0; i<= sheet.getLastRowNum(); i++) {
	Row row=sheet.createRow(0);
    Cell cell=row.createCell(1);
    cell.setCellValue("test");
    
	}


    FileOutputStream c =new FileOutputStream(path);
    wb.write(c);
    c.close();
}	
}
