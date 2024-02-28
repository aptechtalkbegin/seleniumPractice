package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args) throws IOException {

// Excel > Workbook > Sheet > row > cell
		
		FileInputStream file = new FileInputStream("C:\\Users\\Priji\\Desktop\\Read_data.xlsx");
		
        XSSFWorkbook workbook =  new XSSFWorkbook (file); 
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        
        int rowcount = sheet.getLastRowNum();
        int cellcount = sheet.getRow(1).getLastCellNum();
        
        System.out.println(rowcount);
        System.out.println(cellcount);
        
        for (int r=0; r<=rowcount; r++)
        {
        	XSSFRow currentrow = sheet.getRow(r);
        	for (int c=0 ; c<cellcount; c++)
        	{
        	   XSSFCell currentcell = currentrow.getCell(c);
        	           String cellvalue = currentcell.toString();
        	   System.out.print(cellvalue+ "     ");
        	   
        	}
        	System.out.println();
        }
        
       workbook.close();
       file.close();
	}

}
