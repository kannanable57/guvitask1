package task13;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelreadoperation {
	public static void main (String[] args) throws IOException{
	
		XSSFWorkbook book = new XSSFWorkbook();
				XSSFSheet sheet = book.getSheetAt(0);
		
		int rowcount  = sheet.getLastRowNum();
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowcount][columnCount];
		
		//Get into rowjhnmyu76
		
		for (int i=1;i<=rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
					
		//Get onto cell
					
		for(int j=0;j<columnCount;j++) {
			XSSFCell cell = row.getCell(j);
			
		//read the data from excel
			
			data[i-1][j] = cell.getStringCellValue(); //i=1,j=0 --i=0 j=0;
			
			System.out.println(cell.getStringCellValue());
		
		}
		}
	}
}

