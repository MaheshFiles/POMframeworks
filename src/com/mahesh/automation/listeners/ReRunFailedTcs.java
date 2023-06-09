package com.mahesh.automation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedTcs implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}

}
