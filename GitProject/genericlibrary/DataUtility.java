package ocsa.genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility
{
 public String getDataFromProperties(String key) throws IOException
 {
	 FileInputStream fis=new FileInputStream("D:\\Selenium_notepad\\Commondata.Properties");
	 Properties pobj=new Properties();
	 pobj.load(fis);
	return pobj.getProperty(key);
	 
 }
 public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
 {
	 FileInputStream fis=new FileInputStream("D:\\Selenium_Excel_sheet\\TestData.xlsx");
	 Workbook book=WorkbookFactory.create(fis);
	 Sheet sh=book.getSheet(sheetname);
	 DataFormatter format=new DataFormatter();
	return format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
	 
 }
}
