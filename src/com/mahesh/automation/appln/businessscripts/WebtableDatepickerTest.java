package com.mahesh.automation.appln.businessscripts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mahesh.automation.base.ActionEngine;
import com.mahesh.automation.utilities.DateTimeUtilities;

public class WebtableDatepickerTest extends ActionEngine {

	@Test
	public void webtableDatepickerTest() throws InterruptedException {
		enterUrl("https://jqueryui.com/");
		getDriver().findElement(By.linkText("Datepicker")).click();
		Thread.sleep(5000);
		getDriver().switchTo().frame(0);
		getDriver().findElement(By.id("datepicker")).click();
		Thread.sleep(5000);

		List<WebElement> listDates = getDriver().findElements(By.xpath("//table[@class ='ui-datepicker-calendar']/tbody/tr/td/a"));
        int curDate = DateTimeUtilities.getCurrentDate();
		
		for(WebElement webElement :listDates ) 
		{
			String txt = webElement.getText();
			int date = Integer.parseInt(txt);
			if (date == curDate) {
				webElement.click();
				break;
				
			}
		}
		Thread.sleep(10000);	
		
		
		
		
		
		
		
	}

}

