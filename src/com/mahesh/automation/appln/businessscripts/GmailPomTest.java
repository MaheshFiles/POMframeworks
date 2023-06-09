package com.mahesh.automation.appln.businessscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mahesh.automation.base.ActionEngine;
import com.mahesh.automation.utilities.PojoReader;
import com.mahesh.gmail.pageobjects.GmailHomePage;

public class GmailPomTest extends ActionEngine {

	@Test
	public void gmailpomTest() throws IOException {
		enterUrl(PojoReader.getConfPr().getValue("qa_url"));
		 GmailHomePage.enterUserName("mahesh.v");
		//GmailHomePage.enterUserName(PojoReader.getExcelReader().getCellData("sheetname", "GmailData", 0, 0));
        GmailHomePage.clickOnNext();
        
	}
	
	
	
}
