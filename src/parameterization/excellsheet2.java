package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//to get string value from excellsheet
public class excellsheet2 {
	
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		String path="C:\\Users\\Yogesh Sangale\\Desktop\\web page &SQL programme\\excellsheet\\New Microsoft Excel Worksheet.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		String data=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		
		
		
	}
	
	
	
	
	
	

}
