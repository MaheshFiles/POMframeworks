package com.mahesh.automation.utilities;

public interface FilePaths {

	String confFilepath = System.getProperty("user.dir")+"\\config.properties"; 
	String orFilepath = System.getProperty("user.dir")+"\\src\\com\\mahesh\\automation\\aapln\\objectrepository\\or.properties";
	String excelFilepath = System.getProperty("user.dir")+"src\\com\\mahesh\\automation\\appln\\testdata\\TestData.xlsx"; 
	String jsonTestDataFilepath = System.getProperty("user.dir")+"\\data.json "; 
    String txtFilepath = System.getProperty("user.dir")+"\\src\\com\\mahesh\\automation\\supporters\\demo.txt";
    String jsonOrFilepath = System.getProperty("user.dir")+"\\src\\com\\mahesh\\automation\\aapln\\objectrepository\\or.json"; 
    
}
