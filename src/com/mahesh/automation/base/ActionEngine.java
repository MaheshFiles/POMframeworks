package com.mahesh.automation.base;

import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.math3.distribution.AbstractIntegerDistribution;
import org.apache.poi.hslf.dev.PPDrawingTextListing;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.IAssert;

import com.relevantcodes.extentreports.LogStatus;

abstract public class ActionEngine extends BaseTest {
	private static WebElement webElement;
	private static List<WebElement> webElements;

	public static void enterUrl(String url) {
	try {
	getDriver().get(url);
	getExtentTest().log(LogStatus.PASS, "url is entered: "+url);
	} 
	catch (Exception exception) {
		getExtentTest().log(LogStatus.FAIL, "url is NOT entered: "+url);
	}
  }
	public static void enterUrl(URL url) {
		try {
		getDriver().navigate().to(url);
		getExtentTest().log(LogStatus.PASS, "url is entered: "+url);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "url is NOT entered: "+url);
		}
	  }
	public static void navigateToUrl(String url) {
		try {
		getDriver().navigate().to(url);
		getExtentTest().log(LogStatus.PASS, "url is entered: "+url);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "url is NOT entered: "+url);
		}
	  }
	
	public static void enterUrlJs(String url) {
		try {
		getDriver().navigate().to(url);
		getExtentTest().log(LogStatus.PASS, "url is entered: "+url);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "url is NOT entered: "+url);
		}
	  }
	
	public static void DTA(WebElement webElement, String testData,String elementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&& webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementName+" :element is displayed");
			webElement.clear();
			getExtentTest().log(LogStatus.PASS, elementName+" :element is cleared");
			webElement.sendKeys(testData);
			getExtentTest().log(LogStatus.PASS, "Data type action done on:"+elementName+" with testData is:"+testData );
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementName+" :element is NOT displayed");
		
		}
 		
	}
	public static void DTAByActions(WebElement webElement,String testData,String elementName ) {
	try {
		Assert.assertTrue(webElement.isDisplayed()&& webElement.isEnabled());
		getExtentTest().log(LogStatus.PASS, elementName+" : element is displayed");
		Actions actions = new Actions(getDriver());
		actions.sendKeys(webElement,testData).build().perform();
		getExtentTest().log(LogStatus.PASS, "Data type action done on:"+elementName+" with testData is:"+testData );
	
	} 
	catch (Exception exception) {
		getExtentTest().log(LogStatus.FAIL, elementName+" :element is NOT displayed");
	}
	}
	
	public static void DTAByActions1(WebElement webElement,String testData,String elementName ) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&& webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementName+" : element is displayed");
			Actions actions = new Actions(getDriver());
			actions.click(webElement).sendKeys(testData).build().perform();
			getExtentTest().log(LogStatus.PASS, "Data type action done on:"+elementName+" with testData is:"+testData );
		
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementName+" :element is NOT displayed");
		}
		}
	
	// assignment 
	public static void DTAByJs(WebElement webElement,String testData,String elementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&& webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementName+" :element is displayed");
			webElement.clear();
			getExtentTest().log(LogStatus.PASS, elementName+" :element is cleared");
			webElement.sendKeys(testData);
			getExtentTest().log(LogStatus.PASS, "Data type action done on:"+elementName+" with testData is:"+testData );
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementName+" :element is NOT displayed");
		
		}
		
	}
	
	public static void keyEnter() {
		try {
			Actions actions = new Actions(getDriver());
			actions.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(6000);
			getExtentTest().log(LogStatus.PASS, "Keyboard enter action is done");
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, "Keyboard enter action is NOT done");	
		}

	}
	
	
	public static void click(WebElement webElement, String elementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed() && webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementName + " :element is displayed");
			webElement.click();
            getExtentTest().log(LogStatus.PASS, "Click action is done on: " + elementName);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementName + " :element is NOT displayed");

		}
	}
	
	// assignment 
	public static void clickByJs(WebElement webElement, String elementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed() && webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementName + " :element is displayed");
			webElement.click();
            getExtentTest().log(LogStatus.PASS, "Click action is done on: " + elementName);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementName + " :element is NOT displayed");

		}
	}

	public static void clickByActions(WebElement webElement, String elementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed() && webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementName + " :element is displayed");
			Actions actions = new Actions(getDriver());
			actions.click(webElement).build().perform();
            getExtentTest().log(LogStatus.PASS, "Click action is done on: " + elementName);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementName + " :element is NOT displayed");
		}
	}
	public static void clickByActions1(WebElement webElement, String elementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed() && webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementName + " :element is displayed");
			Actions actions = new Actions(getDriver());
			actions.doubleClick(webElement).build().perform();
            getExtentTest().log(LogStatus.PASS, "Click action is done on: " + elementName);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementName + " :element is NOT displayed");
		}
	}
	public static void clickByActions2(WebElement webElement, String elementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed() && webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementName + " :element is displayed");
			Actions actions = new Actions(getDriver());
			actions.sendKeys(webElement, Keys.ENTER).build().perform();
            getExtentTest().log(LogStatus.PASS, "Click action is done on: " + elementName);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementName + " :element is NOT displayed");
		}
	}
	
	public static void identifyElement(String how, String howLocatorValue) {
		switch (how) {
		case "id": webElement = getDriver().findElement(By.id(howLocatorValue));
			        break;
		case "name": webElement = getDriver().findElement(By.name(howLocatorValue));
			        break;
		case "classname": webElement = getDriver().findElement(By.className(howLocatorValue));
			        break;
		case "xpath": webElement = getDriver().findElement(By.xpath(howLocatorValue));
		            break;
		case "css": webElement = getDriver().findElement(By.cssSelector(howLocatorValue));
		            break;
		case "tagname": webElement = getDriver().findElement(By.tagName(howLocatorValue));
		            break;
		case "linkText": webElement = getDriver().findElement(By.linkText(howLocatorValue));
		            break;
		case "partiallinkText": webElement = getDriver().findElement(By.partialLinkText(howLocatorValue));
		            break;
		}
	}
	
	public static void identifyElements(String how, String howLocatorValue) {
		switch (how) {
		case "id": webElements = getDriver().findElements(By.id(howLocatorValue));
			        break;
		case "name": webElements = getDriver().findElements(By.name(howLocatorValue));
			        break;
		case "classname": webElements = getDriver().findElements(By.className(howLocatorValue));
			        break;
		case "xpath": webElements = getDriver().findElements(By.xpath(howLocatorValue));
		            break;
		case "css": webElements = getDriver().findElements(By.cssSelector(howLocatorValue));
		            break;
		case "tagname": webElements = getDriver().findElements(By.tagName(howLocatorValue));
		            break;
		case "linkText": webElements = getDriver().findElements(By.linkText(howLocatorValue));
		            break;
		case "partiallinkText": webElements = getDriver().findElements(By.partialLinkText(howLocatorValue));
		            break;
		}
	}
	
	public static void handleDropDowns(WebElement webElement,String how,String howvalue,String elementName) {
		
		try {
			Assert.assertTrue(webElement.isDisplayed() && webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementName+" :element is displayed");
			Select select = new Select(webElement);
			if (how.equalsIgnoreCase("value")) {
				select.selectByValue(howvalue);
			} 
			else if (how.equalsIgnoreCase("text")) {
				select.deselectByVisibleText(howvalue);
			} 
			else if (how.equalsIgnoreCase("index")) {
				int indx = Integer.parseInt(howvalue);
				select.selectByIndex(indx);
			}
		} 
		catch (Exception exception) {

		}
	
	}
	
	
	//mouse over with JS --------> task
	
	
	
	public static void mouseOver(WebElement webElement,String elementName) {
		
		try {
			Assert.assertTrue(webElement.isDisplayed() && webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, elementName + " :element is displayed");
			Actions actions = new Actions(getDriver());
			actions.moveToElement(webElement).build().perform();
			getExtentTest().log(LogStatus.PASS, "mouse over action is done on: "+elementName);
		} 
		catch (Exception exception) {
			getExtentTest().log(LogStatus.FAIL, elementName + " :element is NOT displayed");
		}
	}
	
	// frames 3 ways in JS
	
	public static String handleWindows() {
		String switchedWinName = "";
		try {
			String curWinName = getDriver().getWindowHandle();
			Set<String> setWindows = getDriver().getWindowHandles();
			for (String str : setWindows) {
				if (!str.equalsIgnoreCase(curWinName)) {
					getDriver().switchTo().window(str);
					switchedWinName = getDriver().getWindowHandle();
				}
			}
		} catch (Exception exception) {

		}
		return switchedWinName;

	}
	
	
	public static String handleWindows(int index) {
		String switchedWinName = "";
		try {
			String curWinName = getDriver().getWindowHandle();
			Set<String> setWindows = getDriver().getWindowHandles();
			List<String> listwindows = new ArrayList<String>();
			String winName = listwindows.get(index);
			getDriver().switchTo().window(winName);
			switchedWinName =	getDriver().getWindowHandle();
		} 
		catch (Exception exception) {

		}
		return switchedWinName;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}