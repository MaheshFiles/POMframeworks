package com.mahesh.automation.appln.businessscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mahesh.automation.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class FbTest extends BaseTest {
	
    @Test
	public void fbTest() {
	//	BaseTest.getDriver().get("https://www.facebook.com");  
    	 getExtentTest().log(LogStatus.PASS, "Browser is opened");
    	getDriver().get("https://www.facebook.com");  
    	getExtentTest().log(LogStatus.PASS, "URL is entered as: https://www.facebook.com");

	}
	
	
	
}
