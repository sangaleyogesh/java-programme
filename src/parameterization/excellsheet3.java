package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


//to get numeric value from excellsheet
public class excellsheet3 {

public static void main(String[]args) throws EncryptedDocumentException, IOException {
	
	String path="C:\\Users\\Yogesh Sangale\\Desktop\\web page &SQL programme\\excellsheet\\New Microsoft Excel Worksheet1.xlsx";
	
	FileInputStream data=new FileInputStream(path);
	
	int  value=(int)WorkbookFactory.create(data).getSheet("sheet1").getRow(1).getCell(1).getNumericCellValue();
	
	System.out.println(value);
}	
	
	
	
}
