package com.mahesh.automation.supporters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	private String filepath;
	private FileInputStream fileInputStream;
	private Workbook workbook;
	private Sheet sheet;
	private Row row;
	private Cell cell;
	private String cellValue;

	public ExcelReader(String filepath) throws EncryptedDocumentException, IOException {
		this.filepath = filepath;
		FileInputStream fileInputStream = new FileInputStream(filepath);
		Workbook workbook = WorkbookFactory.create(fileInputStream);
	}

	public Sheet getSheetobj(String how, String howValue) {
		if (workbook != null) {
			if (how.equalsIgnoreCase("sheetname")) {
				sheet = workbook.getSheet(howValue);
			} else if (how.equalsIgnoreCase("index value")) {
				int indx = Integer.parseInt(howValue);
				sheet = workbook.getSheetAt(indx);
			}
		} else {

			// throws exception
			System.out.println("workbook is pointing to null");
		}
		return sheet;
	}

	public String getCellData(String how, String howValue, int rowNum, int cellNum) {
		sheet = getSheetobj(how, howValue);
		if (sheet != null) {
			row = sheet.getRow(rowNum);
			if (row != null) {
				cell = row.getCell(cellNum);
				if (cell != null) {
					if (cell.getCellType() == CellType.STRING) {
						cellValue = cell.getStringCellValue();
						System.out.println(cellValue);
					} else if (cell.getCellType() == CellType.NUMERIC) {
						cellValue = cell.getNumericCellValue() + "";
						System.out.println(cellValue);
					} else if (cell.getCellType() == CellType.BOOLEAN) {
						cellValue = cell.getBooleanCellValue() + "";
						System.out.println(cellValue);
					}
				} else {
					// throws exception
					System.out.println("cell is pointing to null");
				}
			} else {
				// throws exception
				System.out.println("row is pointing to null");
			}
		} else {
			// throws exception
			System.out.println("sheet is pointing to null");
		}
		return cellValue;
	}

	public List<String> getRowData(String how, String howValue, int rowNum) {
		List<String> rowData = new ArrayList<String>();
		sheet = getSheetobj(how, howValue);
		if (sheet != null) {
			row = sheet.getRow(rowNum);
			if (row != null) {
				for (int i = 0; i < row.getLastCellNum(); i++) {
					cell = row.getCell(i);
					if (cell != null) {
						if (cell.getCellType() == CellType.STRING) {
							cellValue = cell.getStringCellValue();
							System.out.println(cellValue);
						} else if (cell.getCellType() == CellType.NUMERIC) {
							cellValue = cell.getNumericCellValue() + "";
							System.out.println(cellValue);
						} else if (cell.getCellType() == CellType.BOOLEAN) {
							cellValue = cell.getBooleanCellValue() + "";
							System.out.println(cellValue);
						}

						rowData.add(cellValue);
					} else {
						// throws exception
						System.out.println("cell is pointing to null");
					}
				}
			} else {
				// throws exception
				System.out.println("row is pointing to null");
			}
		} else {
			// throws exception
			System.out.println("sheet is pointing to null");
		}
		return rowData;
	}

	public List<String> getsheetData(String how, String howValue) {
		List<String> sheetData = new ArrayList<String>();
		sheet = getSheetobj(how, howValue);
		if (sheet != null) {
			for (int i = 0; i <= sheet.getLastRowNum(); i++) {
				row = sheet.getRow(i);
				for (int j = 0; j < row.getLastCellNum(); j++) {
					cell = row.getCell(j);
					if (cell != null) {
						if (cell.getCellType() == CellType.STRING) {
							cellValue = cell.getStringCellValue();
							System.out.println(cellValue);
						} else if (cell.getCellType() == CellType.NUMERIC) {
							cellValue = cell.getNumericCellValue() + "";
							System.out.println(cellValue);
						} else if (cell.getCellType() == CellType.BOOLEAN) {
							cellValue = cell.getBooleanCellValue() + "";
							System.out.println(cellValue);
						}

						sheetData.add(cellValue);
					} else {
						// throws exception
						System.out.println("cell is pointing to null");
					}
				}
			}
		} else {
			// throws exception
			System.out.println("sheet is pointing to null");
		}
		return sheetData;
	}

	public Set<String> uniqueSheetData(String how, String howValue) {
		List<String> listSheetData = getsheetData(how, howValue);
		Set<String> setSheetData = new HashSet<String>(listSheetData);
		return setSheetData;
	}

	/*
	 * public static void main(String[] args) throws EncryptedDocumentException,
	 * IOException { ExcelReader er = new ExcelReader("D://demo.xls");
	 * 
	 * 
	 * 
	 * }
	 */

}
