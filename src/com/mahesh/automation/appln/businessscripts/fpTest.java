package com.mahesh.automation.appln.businessscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mahesh.automation.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class fpTest extends BaseTest {

	@Test
	public void fpTest() {
		getExtentTest().log(LogStatus.PASS, "Browser is opened");
		// BaseTest.getDriver().get("https://www.flipkart.com");
		getDriver().get("https://www.flipkart.com");
		getExtentTest().log(LogStatus.PASS, "URL is entered as: https://www.flipkart.com");
		// getDriver().findElement(By.id("456")).click();

	}
}
