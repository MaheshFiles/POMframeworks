package com.mahesh.automation.listeners;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mahesh.automation.utilities.TakesScreenshotUtility;

public class TestCaseActivityListener implements ITestListener {

	@Override
	public void onFinish(ITestContext argo) {
		System.out.println("suite execution is completed");
	}
	@Override
	public void onStart(ITestContext argo) {
		System.out.println("suite execution is started");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult argo) {
		
	}
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
	@Override
	public void onTestStart(ITestResult argo) {
    System.out.println("testcase is started: "+argo.getName());
	}
	@Override
	public void onTestSuccess(ITestResult argo) {
	System.out.println("testcase is success: "+argo.getName());
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult argo) {
		
	}
	
} 
 