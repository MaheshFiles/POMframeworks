package com.mahesh.automation.customisedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceptionDemo2 {
	public static void main(String[] args) throws IOException {

		
		try ( Workbook workbook = WorkbookFactory.create(new FileInputStream("D:\\Javapractice\\fpomframework\\src\\com\\mahesh\\automation\\appln\\testdata\\TestData.xlsx"))) {
			Sheet sheet = workbook.getSheet("mahesha");
		}
		catch (IOException|ArithmeticException e) {
			System.out.println("catch block");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	try with multi catch block
		
	/*	System.out.println("1");
		System.out.println("2");
		Workbook workbook = null;

		try {
			FileInputStream fip = new FileInputStream("D:\\Javapractice\\fpomframework\\src\\com\\mahesh\\automation\\appln\\testdata\\TestData.xlsx");
			workbook = WorkbookFactory.create(fip);
			Sheet sheet = workbook.getSheet("mahesha");
		} 
		catch (FileNotFoundException | ArithmeticException e) {

			System.out.println("catch block");

		}
		finally {
			System.out.println("finally block");
			workbook.close();
		} */
	}
}
