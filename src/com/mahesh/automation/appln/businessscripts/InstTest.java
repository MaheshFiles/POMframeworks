package com.mahesh.automation.appln.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.mahesh.automation.base.BaseTest;
import com.mahesh.automation.utilities.PojoReader;
import com.relevantcodes.extentreports.LogStatus;

public class InstTest extends BaseTest {

	
	@Test
	public void instTest() throws IOException {
		 getExtentTest().log(LogStatus.PASS, "Browser is opened");
	//	BaseTest.getDriver().get("https://www.rameshsoft.com"); 
	/*FileInputStream fip = new FileInputStream("D:\\Javapractice\\fpomframework\\config.properties");	
		Properties prConf = new Properties();
		prConf.load(fip);
		String url = prConf.getProperty("inst_url"); */
			
		String url = PojoReader.getConfPr().getValue("inst_url");
		getDriver().get(url);
		 getExtentTest().log(LogStatus.PASS, "URL is entered as"+url);
		


	}
}
