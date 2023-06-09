package com.mahesh.gmail.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.mahesh.automation.base.ActionEngine;
import com.mahesh.automation.base.CommanMethods;
import com.relevantcodes.extentreports.LogStatus;

public class AmazonPage extends ActionEngine {

	static {
		PageFactory.initElements(getDriver(), AmazonPage.class);
	}
	
	@FindBy(xpath="//input[@placeholder='Search Amazon.in']")
	private static WebElement searchAmazon;
	
	@FindBys({@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")})
	private static List<WebElement> realmeProducts;
	

	
	public static void enterTheproducts(String productName) {
	DTA(searchAmazon, productName, "Search Amazon");
	
	}
	
	public static void verifyProducts(String productName) {
	List<String> listElememt =	CommanMethods.getAllElements(realmeProducts);
    for(String str : listElememt) {
	String str1 = str.toLowerCase();
	if (str1.contains(productName)) {
		getExtentTest().log(LogStatus.PASS, "its boat mobiles: "+str1);
	}
	else {
		getExtentTest().log(LogStatus.FAIL, "its NOT boat mobiles: "+str1);
	}
}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
