package com.mahesh.automation.appln.objectrepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo {
public static void main(String[] args) throws IOException {
	// File file = new File("D:\\Javapractice\\fpomframe work\\config.properties");
	// FileInputStream fip = new FileInputStream(file);
	
	FileInputStream fip = new FileInputStream("D:\\Javapractice\\fpomframework\\config.properties");
	
//	FileInputStream fip = new FileInputStream("D:\\Javapractice\\fpomframework\\config.properties"); set properties
	Properties properties = new Properties();
	
	properties.load(fip);
	
	/*properties.put("hello", "parctice");
	properties.setProperty("hardwork","job");
	properties.setProperty("parctHrs","9");
	properties.setProperty("parctice","job");
	
	FileOutputStream fop = new FileOutputStream("D:\\Javapractice\\fpomframework\\config.properties");
	
	properties.store(fop, "File is saved successfully");
	
	properties.remove("parctice","job");
	properties.store(fop, "File is saved successfully"); */
	
	
	
	String value1 = properties.getProperty("qa_url","hardwork");
	String value2= properties.getProperty("qa_pwd");
	String value3 = properties.getProperty("dev_un");
	String value4 = properties.getProperty("qa_pwd");
	System.out.println(value1+" **** "+value2+" **** "+value3+" **** "+value4);
	
	String val1 = (String) properties.get("qa_url") ;
	System.out.println(val1);
	
}
}
