package com.mahesh.automation.reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsDemo {
	public static void main(String[] args) {

		ExtentReports extentReports = new ExtentReports("D:\\Javapractice\\fpomframework\\Reports\\report.html");
		Map<String, String> sysInfo = new HashMap<String, String>();
		sysInfo.put("username", "mahesh.vadlakonda");
		sysInfo.put("password", "mallaiah");
		extentReports.addSystemInfo(sysInfo);

		ExtentTest extentTest = extentReports.startTest("demo");
		extentTest.log(LogStatus.PASS, "Browser is opened");
		extentTest.log(LogStatus.PASS, "URL is entered www.gmail.com");
		extentTest.log(LogStatus.PASS, "DTA is done with username testdata is : mahesh.vadlakonda");
		extentTest.log(LogStatus.PASS, "click on next button");
		extentTest.log(LogStatus.PASS, "cliced on sign in button");

		extentReports.endTest(extentTest);
		extentReports.flush();
		extentReports.close();

	}

}
