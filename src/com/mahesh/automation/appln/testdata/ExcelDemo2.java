package com.mahesh.automation.appln.testdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fip = new FileInputStream("D:\\Javapractice\\fpomframework\\src\\com\\mahesh\\automation\\appln\\testdata\\TestData.xlsx");
	 //  Workbook workbook =	WorkbookFactory.create(file);
		 Workbook workbook =	WorkbookFactory.create(fip);
		 
   //	Sheet sheet = workbook.getSheetAt(0);
		Sheet sheet = workbook.getSheet("GmailData");
		
		Row row0 = sheet.getRow(0);
		Cell cell03 = row0.createCell(3);
		cell03.setCellValue("automation");
	
	    Row row2 = sheet.getRow(2);
	    Cell cell22 = row2.createCell(2);
	    cell22.setCellValue("Testing");
	
	    Row row4 = sheet.createRow(4);
	    Cell cell40 = row4.createCell(0);
    	cell40.setCellValue("Manual testing");
	 
	    Cell cell41 = row4.createCell(1);
	    cell41.setCellValue("database");
	 
	    Row row5 = sheet.createRow(5);
	   Cell cell50 =   row5.createCell(0);
	   cell50.setCellValue("mokshith");
	   
	   Cell cell51 = row5.createCell(1);
	   cell51.setCellValue("mahesh");
	  
	   FileOutputStream fop = new FileOutputStream("D:\\Javapractice\\fpomframework\\src\\com\\mahesh\\automation\\appln\\testdata\\TestData.xlsx");
	workbook.write(fop);
	
}
}
