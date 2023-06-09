package com.mahesh.automation.listeners;

import java.io.IOException;

import org.testng.ITestResult;

import com.mahesh.automation.utilities.TakesScreenshotUtility;

public class TestCaseActivityAdaptor extends TestCaseActivityListener{

	@Override
	public void onTestFailure(ITestResult argo) {
		System.out.println("testcase is failed: "+argo.getName());
		try {
			TakesScreenshotUtility.takesScreenshot(argo.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult argo) {
		System.out.println("testcase is skipped: "+argo.getName());
		try {
			TakesScreenshotUtility.takesScreenshot(argo.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
