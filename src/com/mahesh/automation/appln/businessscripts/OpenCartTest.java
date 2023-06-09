package com.mahesh.automation.appln.businessscripts;

import java.io.IOException;

import org.apache.commons.math3.optim.AbstractOptimizationProblem;
import org.testng.annotations.Test;

import com.mahesh.automation.base.ActionEngine;
import com.mahesh.automation.utilities.PojoReader;
import com.mahesh.gmail.pageobjects.AmazonPage;
import com.mahesh.gmail.pageobjects.FlipkartPage;
import com.mahesh.gmail.pageobjects.OpenCartLaptopsNotebooksPage;
import com.mahesh.gmail.pageobjects.OpencartHeadersPage;

public class OpenCartTest extends ActionEngine {

//	@Test
//	public void verifyLaptopsNotebooksSize() throws IOException {
//		String url = PojoReader.getConfPr().getValue("openkart_url");
//		ActionEngine.enterUrl(url);
//		OpenCartLaptopsNotebooksPage.mouseoveractionLaptopsNoteboks();
//		OpenCartLaptopsNotebooksPage.clickonShowAllLaptopsndNotebooks();
//		OpenCartLaptopsNotebooksPage.verifyLaptopNotebooksSize();
//	}

//	@Test
//	public void verifyOpHeaders() throws IOException {
//		String url = PojoReader.getConfPr().getValue("openkart_url");
//		ActionEngine.enterUrl(url);
//		
//		OpencartHeadersPage.verifyHeaders();
//	}
	
//	@Test
//	public void verifyProducts() throws InterruptedException {
//		Thread.sleep(6000);
//		ActionEngine.enterUrl("https://www.flipkart.com/");
//		FlipkartPage.entertheProducts("Iphone");
//		keyEnter();
//		FlipkartPage.verifyProducts("apple iphone");
//	}

@Test
	public static void verifyproduc() throws InterruptedException {
		Thread.sleep(6000);
		ActionEngine.enterUrl("https://www.amazon.in/");
		AmazonPage.enterTheproducts("realme");
		keyEnter();
		AmazonPage.verifyProducts("realme phones");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
