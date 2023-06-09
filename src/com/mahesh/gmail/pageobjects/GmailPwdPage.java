package com.mahesh.gmail.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mahesh.automation.base.ActionEngine;

public class GmailPwdPage  extends ActionEngine{

	static {
		PageFactory.initElements(getDriver(), GmailPwdPage.class);
	}

	@FindBy(name = "password")
	private static WebElement password;

	@FindBy(id = "passwordNext")
	private static WebElement signin;

	@FindBy(xpath = "//div[text()='Show password']")
	private static WebElement showpwd;

	@FindBy(xpath = "//span[text()='Forgot password?']")
	private static WebElement forgotpwd;

	@FindBy(xpath = "//a[text()='Help']")
	private static WebElement help;

	public static void enterPwd(String pwdData) {
		DTA(password, pwdData, "Password");
	}

	public static void clickSignin() {
		click(signin, "Sign in");

	}

	public static void clickShowPwd() {
		click(showpwd, "Showpassword");

	}

	public static void clickforgotpwd() {
		click(forgotpwd, "Forgot password");

	}

	public static void clickOnhelp() {
		click(help, "Help");

	}


	}
	

