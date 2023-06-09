package com.mahesh.gmail.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.mahesh.automation.base.ActionEngine;
import com.relevantcodes.extentreports.LogStatus;

public class OpenCartLaptopsNotebooksPage extends ActionEngine{

	static {
		PageFactory.initElements(getDriver(), OpenCartLaptopsNotebooksPage.class);
	}
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private static WebElement LoptopsNotebooks;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private static WebElement showallLoptopsNotebooks;
	
	@FindBy(xpath = "//aside[@id='column-left']/div/a[2]")
	private static WebElement actualLoptopsNotebooks;

	@FindBys({@FindBy(xpath="//div[@class='image']")})
	private static List<WebElement> expectedLaptopsNotebooks;
	
	public static void mouseoveractionLaptopsNoteboks() {
	mouseOver(LoptopsNotebooks, "Loptops & Notebooks");	
	}
	public static void clickonShowAllLaptopsndNotebooks() {
		click(showallLoptopsNotebooks, "show all Loptops & Notebooks");
	}

	public static int getActualSizeLaptopsNotebooks() {
		String txt = actualLoptopsNotebooks.getText(); // Loptops & Notebooks (5)
		String[] str = txt.split(" "); // Loptops & Notebooks (5)

		String str1 = str[3]; // (5)
		String[] str2 = str1.split("");
		String actuaLaptopsNotebooksSIZE = str2[1];
		int actuaLaptopNotebooksSIZE = Integer.parseInt(actuaLaptopsNotebooksSIZE);
		return actuaLaptopNotebooksSIZE;

	}

	public static int getEexpectedLaptopNotebooksSize() {
		int expectedLaptopsNotebooksSize = expectedLaptopsNotebooks.size();
		return expectedLaptopsNotebooksSize;
	}

	public static void verifyLaptopNotebooksSize() {
		int actualSizeLaptopsNotebooks = getActualSizeLaptopsNotebooks();
		int expectedLaptopNotebooksSize = getEexpectedLaptopNotebooksSize();
	if (actualSizeLaptopsNotebooks == expectedLaptopNotebooksSize) {
		getExtentTest().log(LogStatus.PASS, "Laptops & notebooks size is matching");
		getExtentTest().log(LogStatus.PASS, " "+actualSizeLaptopsNotebooks+ "  "+expectedLaptopNotebooksSize);
	} else {
	  	getExtentTest().log(LogStatus.FAIL, "Laptops & notebooks size is matching");
		getExtentTest().log(LogStatus.FAIL, " "+actualSizeLaptopsNotebooks+ "  "+expectedLaptopNotebooksSize);
	}
	

	
	}






}
