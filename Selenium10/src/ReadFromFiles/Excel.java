package ReadFromFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Step 1 : Create FIS
		FileInputStream fis= new FileInputStream("C:\\Users\\sanje\\OneDrive\\Desktop\\datafile.xlsx");
		
		// Step 2 : Create Workbook object
		Workbook workbook= WorkbookFactory.create(fis);
		
		// Step 3 : Read methods
		double data= workbook.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		workbook.getSheet("Sheet1").getRow(1).getCell(1).
		System.out.println(data);
		
		
	}

}
