package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excellsheet1 {
	//to get string value from excellsheet

	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		String path="C:\\Users\\Yogesh Sangale\\Desktop\\web page &SQL programme\\excellsheet\\New Microsoft Excel Worksheet.xlsx";
		
		FileInputStream data=new FileInputStream(path);
		
String s=WorkbookFactory.create(data).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();	
		System.out.println(s);
	}

}
