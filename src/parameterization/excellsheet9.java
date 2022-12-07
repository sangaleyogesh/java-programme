package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excellsheet9 {
	
	//print all data type of  value using switch statement

	
	public static void main(String[]args) throws IOException {
		
		String path="C:\\Users\\Yogesh Sangale\\Desktop\\web page &SQL programme\\excellsheet\\Team list-3.xlsx";
		
		FileInputStream file= new FileInputStream(path);
		
		XSSFWorkbook data=new XSSFWorkbook(file);
		
		XSSFSheet sheet=data.getSheet("list");
		
		int rowcount=sheet.getLastRowNum();
		
		System.out.println(rowcount);
		
		int colcount=sheet.getRow(0).getLastCellNum();
		
		System.out.println(colcount);
		
		for(int i=0; i<=rowcount; i++) {//row
			
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0; j<colcount; j++) {	
				
				XSSFCell cell=row.getCell(j);
				
				switch(cell.getCellType()) {
				
				case STRING:{System.out.println(cell.getStringCellValue());}
				break;
				
				case NUMERIC:{System.out.println(cell.getNumericCellValue());}
				break;
				
				case BOOLEAN:{System.out.println(cell.getBooleanCellValue());}
				break;
				default:{System.out.println("hello");}
				
				
				}
				
			}
		
			
			
		}
		
		
		
		
	}

}