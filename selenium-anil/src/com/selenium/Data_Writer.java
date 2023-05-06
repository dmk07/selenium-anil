package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Writer {
	public void Write_Excel(String sheetname, String CellValue,int row,int col) throws IOException
	{
		String excel_path="C:\\Users\\DELL\\Desktop\\Book2.xlsx";
		File fl=new File(excel_path);
		FileInputStream fis=new FileInputStream(fl);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetname);
		sheet.getRow(row).createCell(col).setCellValue(CellValue);
		FileOutputStream fo=new FileOutputStream(new File(excel_path));
		wb.close();
		fo.close();
		
		
		
	
	}

}
