package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fs = new FileInputStream("C:\\Users\\MSIII\\Desktop\\Test.xlsx");
		
		XSSFWorkbook  workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row1 = sheet.getRow(3);
		
		Cell cell1= row1.getCell(0);
		
		System.out.println(cell1);
		
		int rownumber= sheet.getFirstRowNum();
		
		int columnnumber= sheet.getLastRowNum();
		
		System.out.println(rownumber);
		
		System.out.println(columnnumber);
		
		
		
		
		
		
		
		
		
		

	}

}
