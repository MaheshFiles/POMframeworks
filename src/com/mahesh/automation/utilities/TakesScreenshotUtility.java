package com.mahesh.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mahesh.automation.base.BaseTest;

public interface TakesScreenshotUtility {

	public static String takesScreenshot() throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) BaseTest.getDriver();
		File file =	takesScreenshot.getScreenshotAs(OutputType.FILE);
	    String imagepath =	System.getProperty("user.dir")+"\\Screenshots\\"+BaseTest.getTcName()+".jpeg";
		FileUtils.copyFile(file, new File(imagepath));
		return imagepath;
		
	}
	public static String takesScreenshot(String tcName) throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) BaseTest.getDriver();
		File file =	takesScreenshot.getScreenshotAs(OutputType.FILE);
	    String imagepath =	System.getProperty("user.dir")+"\\Screenshots\\"+tcName+".jpeg";
		FileUtils.copyFile(file, new File(imagepath));
		return imagepath;
		
	}	
}
