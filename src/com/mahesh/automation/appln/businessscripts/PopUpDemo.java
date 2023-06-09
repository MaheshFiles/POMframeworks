package com.mahesh.automation.appln.businessscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mahesh.automation.base.BaseTest;

public class PopUpDemo extends BaseTest {

	@Test
	public void popUpTest() {
		getDriver().get("location of popup");
		getDriver().findElement(By.xpath("//button[@onclick='promtfunction']")).click();
		Alert alert = getDriver().switchTo().alert();

		alert.sendKeys("java");
		String txt = alert.getText();
		System.out.println("popup text is:" + txt);
		alert.accept(); 

	}

}
