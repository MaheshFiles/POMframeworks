package com.mahesh.automation.appln.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;
import com.mahesh.automation.base.BaseTest;
import com.mahesh.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

public class GmailTest extends BaseTest{
	
    @Test   
	public void gmailTest() throws IOException {
    getExtentTest().log(LogStatus.PASS, "Browser is opened");
    
	String unData = " ";	
	String url =PojoReader.getConfPr().getValue("qa_url");
	getDriver().get(url);
	getExtentTest().log(LogStatus.PASS, "URL is entered as: "+url);
    
    String unIdval = PojoReader.getOrPr().getValue("un_id");
    String nxtIdval = PojoReader.getOrPr().getValue("nxt_id");
      
    
  unData = PojoReader.getExcelReader().getCellData("sheetname", "GmailData", 0, 0);
   
	     WebElement un = getDriver().findElement(By.id(unIdval));
	     un.clear();
	     getExtentTest().log(LogStatus.PASS, "username is cleared");
	     un.sendKeys(unData);
	     getExtentTest().log(LogStatus.PASS, "DTA is done on username with testdata is: "+unData);
	     getDriver().findElement(By.id(nxtIdval)).click();
	     getExtentTest().log(LogStatus.PASS, "clicked on next button");


	}

}
