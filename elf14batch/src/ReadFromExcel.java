import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./resources/Book2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("Sheet1").getPhysicalNumberOfRows();
		int cellcount = wb.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
		String [][] arr=new String[rowcount][cellcount];
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<cellcount;j++) {
				arr[i][j] =wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
				
			}
		}
		
		for(String[] s:arr) {
			for(String value:s) {
				System.out.print(value+"  ");
			}
			System.out.println();
		}
	}
}
