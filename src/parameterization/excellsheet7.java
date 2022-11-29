package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellsheet7 {

public static void main(String[]args) throws IOException {
	
	
	String path="C:\\Users\\Yogesh Sangale\\Desktop\\web page &SQL programme\\excellsheet\\Team list-2.xlsx";
	
	FileInputStream file=new FileInputStream(path);
	
	XSSFWorkbook data=new XSSFWorkbook(file);
	
	XSSFSheet sheet=data.getSheet("list");
	
	int rowcount=sheet.getLastRowNum();
	
	System.out.println(rowcount);
	
	int colcount=sheet.getRow(0).getLastCellNum();
	System.out.println(colcount);
	
	for(int i=0; i<=rowcount; i++) {
		
		XSSFRow row=sheet.getRow(i);
		for(int j=0; j<colcount; j++) {
		
			String value=row.getCell(j).toString();
			
			System.out.println("|"+value);
			
		}
		System.out.println();
	
	}
	
	
	
}	
	
	
	
	
}
