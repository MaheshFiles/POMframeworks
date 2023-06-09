package com.mahesh.automation.appln.businessscripts;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;
import com.mahesh.automation.base.BaseTest;
import com.mahesh.automation.customisedexception.FrameworkException;
import com.mahesh.automation.utilities.PojoReader;

public class GmailTest2 extends BaseTest {

	@Test
	public void gmailTest() throws IOException, ParseException, FrameworkException {
		String url = PojoReader.getConfPr().getValue("qa_url");
		getDriver().get(url);
	
		String unData = 	PojoReader.getTDJsonObj().getJsonValue("username");
					
		String unIdval = 	PojoReader.getOrJsonObj().getJsonValue("un_id");
		String nxtIdval = 	PojoReader.getOrJsonObj().getJsonValue("nxt_id");
		
		
		WebElement un = getDriver().findElement(By.id(unIdval));
		un.clear();
		un.sendKeys(unData);
		getDriver().findElement(By.id(unIdval)).click();

	}

}
