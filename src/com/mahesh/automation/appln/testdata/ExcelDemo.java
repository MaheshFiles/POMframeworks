package com.mahesh.automation.appln.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
//	File file = new File("D:\\Javapractice\\fpomframework\\src\\com\\mahesh\\automation\\appln\\testdata\\TestData.xlsx");
//	FileInputStream fip = new FileInputStream(file);
	
	FileInputStream fip = new FileInputStream("D:\\Javapractice\\fpomframework\\src\\com\\mahesh\\automation\\appln\\testdata\\TestData.xlsx");
 //   Workbook workbook =	WorkbookFactory.create(file);
	 Workbook workbook =	WorkbookFactory.create(fip);
	 
//	Sheet sheet = workbook.getSheetAt(0);
	Sheet sheet = workbook.getSheet("GmailData");
	
    int rowCont = sheet.getLastRowNum();
	System.out.println("Noof rows are: "+rowCont);
	 
	Row row0 = sheet.getRow(0);	 
	int cellCount0Row = row0.getLastCellNum();
	System.out.println("oth row cell count is: "+cellCount0Row);
	
	Cell cell00 = row0.getCell(0);
	String cell00value = cell00.getStringCellValue();
	System.out.println("oth row oth cell value "+cell00value);

	Cell cell01 = row0.getCell(1);
	String cell01value = cell01.getStringCellValue();
	System.out.println("oth row 1st cell value "+cell01value);

	Row row1 = sheet.getRow(1);
	int row1cellCount = row1.getLastCellNum();
	System.out.println("1st row cell count is "+row1cellCount);
	
	Cell cell10 =row1.getCell(0);
	String cell10value =cell10.getStringCellValue();
	System.out.println("1st row 0th cell count is "+cell10value);
	
	Cell cell11  = row1.getCell(1);
	String cell11value =cell11.getStringCellValue();
	System.out.println("1st row 1st cell count is "+cell11value);
	
	Row row2 =sheet.getRow(2);
	int row2cellCount = row2.getLastCellNum();
	System.out.println("row2 cell count is "+row2cellCount);
	
	Cell cell20 = row2.getCell(0);
    String cell20value = cell20.getStringCellValue();
    System.out.println("2nd row 0th cell is: "+cell20value);
    
    Cell cell21 =  row2.getCell(1);
    String cell21value = cell21.getStringCellValue();
    System.out.println("2nd row 1st cell is: "+cell21value);
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
