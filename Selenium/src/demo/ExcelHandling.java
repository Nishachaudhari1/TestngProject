package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelHandling {

	
public static void main(String [] arg) throws IOException {

   FileInputStream a =new FileInputStream("C:\\Users\\baps\\Desktop\\Selenium Setup\\Testing.xlsx");
    
  XSSFWorkbook workbook= new XSSFWorkbook (a) ;
  
  XSSFSheet sheet=workbook. getSheetAt(0);
  
  Row row=sheet.getRow(1);
  
  Cell cell=row.getCell(0);
 
  System.out.println(cell);
  
  String Username=cell.toString();
  
  Cell cell1=row.getCell(1);
  String password=cell.toString();
  System.out.println(cell1);

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\baps\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

    WebDriver driver = new ChromeDriver ();

  driver.get("https://login.salesforce.com/?locale=in");
  
  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Username);
  
  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
  
  
}
}
