package Selenium_java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Exp {

	public static void main(String[] args) throws IOException {
		//file
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\Book1.xlsx");
		//create workbook object
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//we need to read Sheet
		XSSFSheet sheet=workbook.getSheet("Sheet1");//locate the sheet
		
	//	XSSFSheet sheet=workbook.getSheetAt(0);//
	    int rowcount=sheet.getLastRowNum();//read the row count
	    System.out.println("The num of rows"+rowcount);
	 
	    int cellcount= sheet.getRow(0).getLastCellNum();//read the cells
	    System.out.println("The number of column is:"+cellcount);
	    for(int i=0;i<rowcount;i++)
	    {
	    	XSSFRow  count=sheet.getRow(i);
	    	for(int j=0;j<cellcount;j++)
	    	{
	    		String data=count.getCell(j).toString();
	    		System.out.print("   ||   "+ data);
	    	}
	    	System.out.println();
	    }
	    
	    
		
		
	}

}
