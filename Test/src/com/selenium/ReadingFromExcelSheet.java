package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcelSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File file =    new File("C:\\Users\\MSIII\\Desktop\\Selenium\\Test.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		XSSFRow row1=sheet.getRow(1);
		
		XSSFCell cell=row1.getCell(1);
		
		System.out.println(cell.getStringCellValue());

		
		
	}

}
