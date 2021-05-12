import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fin = new FileInputStream("./resources/Book.xlsx");
	Workbook wb = WorkbookFactory.create(fin);
	 double a1 = wb.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
	 String a2 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	 Date a3 = wb.getSheet("Sheet1").getRow(0).getCell(2).getDateCellValue();
	  boolean a4 = wb.getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue();
	 
	 System.out.println(a1);
	 System.out.println(a2);
	 System.out.println(a3);
	 System.out.println(a4);
	}
}
