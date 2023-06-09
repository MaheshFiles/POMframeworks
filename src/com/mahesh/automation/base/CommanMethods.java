package com.mahesh.automation.base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class CommanMethods extends ActionEngine {

	public static List<String>  getAllElements(List<WebElement> list) {
		List<String> listData = new ArrayList<String>();
		for(WebElement webElement : list) 
		{
			String txt = webElement.getText();
			listData.add(txt);
		}
		return listData;

	}
	
}
