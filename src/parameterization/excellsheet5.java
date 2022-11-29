package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excellsheet5 {

	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		
		String path="C:\\Users\\Yogesh Sangale\\Desktop\\web page &SQL programme\\excellsheet\\Team list -1.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		Sheet data=WorkbookFactory.create(file).getSheet("list");  //sheet is return type of sheet
		
		System.out.println(data.getLastRowNum());  //to print last rownumber
		
		for(int i=0; i<=data.getLastRowNum(); i++) {
			
			for(int j=0; j<data.getRow(i).getLastCellNum(); j++) {
				
				String value=data.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value+"|");
			}
				System.out.println();
		}
		
		
		
	}
	
}
