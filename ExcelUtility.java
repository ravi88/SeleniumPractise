package oyorooms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public static  String getData(String Sheetname,int rowNum,int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis =new FileInputStream("C:\\ravi_work\\oyorooms\\src\\test\\resources\\tigmoodata.xls");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(Sheetname);
		Row row=sh.getRow(rowNum);
		String data=row.getCell(colNum).getStringCellValue();
		 return data;
		
	}

}
