package com.mahesh.gmail.pageobjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.functors.AbstractQuantifierPredicate;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.IFactoryAnnotation;

import com.mahesh.automation.base.ActionEngine;
import com.mahesh.automation.base.CommanMethods;
import com.mahesh.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class OpencartHeadersPage extends ActionEngine{

	static {
		PageFactory.initElements(getDriver(), OpencartHeadersPage.class);
		}
	
	@FindBys({@FindBy(xpath="//ul[@class='nav navbar-nav']/li/a")})
	private static List<WebElement> actualHeaders;

	
	public static List<String> getActualHeadersData() {
		List<String> actualHeadersData = CommanMethods.getAllElements(actualHeaders);
		return actualHeadersData;
	}
	
	public static List<String> getExpHeadersData() throws EncryptedDocumentException, IOException {
		List<String> listExpData = new ArrayList<String>();
		String data = PojoReader.getExcelReader().getCellData("sheetname", "opencart", 0, 0);
		String[] str = data.split(",");
		for (String str1 : str) {
			listExpData.add(str1);
		}
		return listExpData;
	}

	public static void verifyHeaders() throws EncryptedDocumentException, IOException {
		List<String> actualHeadersData = getActualHeadersData();
		List<String> listExpData = getExpHeadersData();
        Collections.sort(actualHeadersData);
        Collections.sort(listExpData);
        if (actualHeadersData == listExpData) {
			getExtentTest().log(LogStatus.PASS, "Headers is matching");
			getExtentTest().log(LogStatus.PASS, actualHeadersData+" "+listExpData);
		}
        else {
        	getExtentTest().log(LogStatus.FAIL, "Headers is NOT matching");
			getExtentTest().log(LogStatus.FAIL, actualHeadersData+" "+listExpData);
		}
	}
}
	
	
	

