package com.mahesh.automation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.mahesh.automation.customisedexception.FrameworkException;
import com.mahesh.automation.utilities.DriverPath;
import com.mahesh.automation.utilities.TakesScreenshotUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import lombok.Getter;

public class BaseTest {

	@Getter private static WebDriver driver;
	@Getter private static String tcName;
	@Getter private static ExtentReports extentReports;
	@Getter private static ExtentTest extentTest;

	@Parameters({ "browser" })
	@BeforeSuite
	public void openBrowser(@Optional("chrome") String browser) {
		
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(DriverPath.firefoxKey, DriverPath.firefoxValue);
			driver = new FirefoxDriver();
			init();
		
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(DriverPath.chromeKey, DriverPath.chromeValue);
			driver = new ChromeDriver();
			init();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty(DriverPath.edgeKey, DriverPath.edgeValue);
			driver = new EdgeDriver();
			init();
		}
		

	}

	
	private void init() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	}

	@BeforeTest
	public void initReports() {
		ExtentReports extentReports = new ExtentReports(System.getProperty("user.dir")+"\\Reports\\report.html");
		Map<String, String> sysInfo = new HashMap<String, String>();
		sysInfo.put("username", "mahesh.vadlakonda");
		sysInfo.put("password", "mallaiah");
		sysInfo.put("env", "UAT");
		sysInfo.put("os", "windows");
		extentReports.addSystemInfo(sysInfo);

	}

	@AfterSuite
	public void closeBrowser() throws FrameworkException {
		if (driver != null) {
			driver.quit();
			extentTest.log(LogStatus.PASS, "Browser is closed");
		} else {
			// throw exception
			System.out.println("DRIVER IS POINTING TO NULL");
			extentTest.log(LogStatus.FAIL, "Browser is NOT closed");
			FrameworkException exception = new FrameworkException("DRIVER IS POINTING TO NULL");
			throw exception;
		}
	}

	@BeforeMethod
	public void beforeTCExcution(Method method) {
		tcName = method.getName();
		System.out.println("Current execution testcase name is:" + tcName);
		ExtentTest extentTest = extentReports.startTest(tcName);
		extentTest.log(LogStatus.PASS, "Current execution testcase name is:" + tcName);
	}

	@AfterMethod
	public void afterTCExecution(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.SUCCESS) {
			System.out.println("Testcase is passed:" + result.getName());
			extentTest.log(LogStatus.PASS, "Testcase is passed:" + result.getName());
		}
		else if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Testcase is failed:" + result.getName());
			  String imagepath = TakesScreenshotUtility.takesScreenshot();
			extentTest.log(LogStatus.FAIL, "Testcase is failed:" + result.getName());
			extentTest.log(LogStatus.FAIL, result.getThrowable().toString());
			extentTest.addScreenCapture(imagepath);

		}
		else if (result.getStatus() == ITestResult.SKIP) {
			System.out.println("Testcase is skipped:" + result.getName());
			  String imagepath = TakesScreenshotUtility.takesScreenshot();
			extentTest.log(LogStatus.SKIP, "Testcase is skipped:" + result.getName());
			extentTest.log(LogStatus.SKIP, result.getThrowable().toString());
			extentTest.addScreenCapture(imagepath);
		}
		extentReports.endTest(extentTest);
		extentReports.flush();
	}

	@AfterTest
	public void closeReports() throws FrameworkException {
		if (extentReports!= null) {
			extentReports.close();
		} else {
			System.out.println("ExtentReports is pointing to null");
			FrameworkException exception = new FrameworkException("DRIVER IS POINTING TO NULL");
			throw exception;
		}
	}

	/*public static WebDriver getDriver() {
		return driver;
	}

	public static String getTcName() {
		return tcName;
	}
	public static ExtentTest getExtentTest() {
		return extentTest;
	}*/
}
