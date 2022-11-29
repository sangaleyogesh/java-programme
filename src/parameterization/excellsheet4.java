package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excellsheet4 {

public static void main(String[]args) throws EncryptedDocumentException, IOException {
	
	String path="C:\\Users\\Yogesh Sangale\\Desktop\\web page &SQL programme\\excellsheet\\Team list.xlsx";
	
	FileInputStream file=new FileInputStream(path);
	
	Sheet data=WorkbookFactory.create(file).getSheet("sheet1");
	
	System.out.println(data.getLastRowNum());
	
	for(int i=0; i<=data.getLastRowNum(); i++) {
		
		for(int j=0; j<data.getRow(i).getLastCellNum(); j++){
			
			String value1=data.getRow(i).getCell(j).getStringCellValue();
			
			System.out.println(value1+"|");
		}
	System.out.println();
	}
	
}	
	
}
