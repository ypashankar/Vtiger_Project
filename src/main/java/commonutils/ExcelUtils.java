package commonutils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public String getDataFromExcelFile(String sheetname,int row , int column) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("src\\test\\resources\\Vtiger_Data.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet(sheetname);
		
		Row r=sh.getRow(row);
		
		Cell c=r.getCell(column);
		
		String value=c.getStringCellValue();
		
		return value;
	}
}
