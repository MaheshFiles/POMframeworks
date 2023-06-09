package com.mahesh.gmail.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mahesh.automation.base.ActionEngine;

public class GmailHomePage extends ActionEngine {

	static {
		PageFactory.initElements(getDriver(), GmailHomePage.class);
	}

	@FindBy(id = "identifierId")
	private static WebElement userName;

	@FindBy(xpath = "//button[text()='Forgot email?']")
	private static WebElement Forgotemail;

	@FindBy(id = "identifierNext")
	private static WebElement next;

	@FindBy(xpath = "//span[text()='Create account']")
	private static WebElement createaccount;

	@FindBy(xpath = "//a[text()='Learn more']")
	private static WebElement learnmore;

	@FindBy(xpath = "//a[text()='Privacy']")
	private static WebElement privacy;

	public static void enterUserName(String testData) {
		DTA(userName, testData, "User name");
	}

	public static void clickforgotEmail() {
		click(Forgotemail, "Forgot email");

	}

	public static void clickOnNext() {
		click(next, "Next button");

	}

	public static void clickCreateAccount() {
		click(createaccount, "Create account");

	}

	public static void clicklernMore() {
		click(learnmore, "Learn more");

	}

	public void privacy() {
		click(privacy, "Privacy");

	}

}
