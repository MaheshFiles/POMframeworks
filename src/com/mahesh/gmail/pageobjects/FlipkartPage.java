package com.mahesh.gmail.pageobjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.mahesh.automation.base.ActionEngine;
import com.mahesh.automation.base.CommanMethods;
import com.relevantcodes.extentreports.LogStatus;

public class FlipkartPage extends ActionEngine {

	static {
		PageFactory.initElements(getDriver(), FlipkartPage.class);
	}

	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	private static WebElement searchProducts;

	@FindBys({ @FindBy(xpath = "//div[@class='_4rR01T']") })
	private static List<WebElement> iphoneProducts;

	public static void entertheProducts(String productname) {
		DTA(searchProducts, productname, "Search products");

	}

	public static void verifyProducts(String productname) {
		List<String> listElements = CommanMethods.getAllElements(iphoneProducts);
		for (String str : listElements) {
			String str1 = str.toLowerCase();
			if (str1.contains(productname)) {
				getExtentTest().log(LogStatus.PASS, "its iphone:" + str1);
			}
			else {
				getExtentTest().log(LogStatus.FAIL, "its NOT iphone:" + str1);
			}
		}
	}

}
