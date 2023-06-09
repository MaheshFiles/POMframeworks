package com.mahesh.automation.appln.testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fip = new FileInputStream("D:\\Javapractice\\fpomframework\\src\\com\\mahesh\\automation\\appln\\testdata\\TestData.xlsx");
	 //  Workbook workbook =	WorkbookFactory.create(file);
		 Workbook workbook =	WorkbookFactory.create(fip);
		 
    //	Sheet sheet = workbook.getSheetAt(0);
		Sheet sheet = workbook.getSheet("GmailData");
		
		for (int i = 0; i <sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
					if (cell.getCellType() == CellType.STRING) {
				         String cellValue = cell.getStringCellValue();
				          System.out.println(cellValue);
			       }
				else if (cell.getCellType() == CellType.NUMERIC) {
					double cellValue = cell.getNumericCellValue();
					System.out.println(cellValue);
			    	}
			 	else if (cell.getCellType() == CellType.BOOLEAN) {
					boolean cellValue = cell.getBooleanCellValue();
					System.out.println(cellValue);
				}
		}
		
		
		
		
		
		
		
		
		
		
}
}
}