package com.mahesh.automation.supporters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesReader {
    private String filepath;
    private FileInputStream fileInputStream;
    private Properties properties;
    private String value;
public PropertiesReader(String filepath) throws IOException{
	this.filepath = filepath;
	fileInputStream = new FileInputStream(filepath);
	properties = new Properties();
	properties.load(fileInputStream);
	}
 public String getValue(String key) {
    if (properties!=null ) {
	value = properties.getProperty(key);
 }	
    else {
    	//throws exception
		System.out.println("properties objects is pointing null");
	}
    return value;
}
 
 public String getValue(String key, String defaultvalue) {
	    if (properties!=null ) {
		value = properties.getProperty(key);
		if (value == null) {
			value = defaultvalue;
		}
	 }	
	    else {
	    	//throws exception
			System.out.println("properties objects is pointing null");
		}
	    return value;
	}
 
 public String getValue(Object key) {
	    if (properties!=null ) {
		value = (String) properties.get(key);
	 }	
	    else {
	    	//throws exception
			System.out.println("properties objects is pointing null");
		}
	    return value;
	}
	 
	 public String getValue(Object key, Object defaultvalue) {
		    if (properties!=null ) {
			value = properties.getProperty((String) key);
			if (value == null) {
				value = (String) defaultvalue;
			}
		 }	
		    else {
		    	//throws exception
				System.out.println("properties objects is pointing null");
			}
		    return value;
		}
	 
	 
	 public void addkeyvalue(String key, String value) throws IOException  {
		 if (properties!=null ) {
			 properties.setProperty(key, value);
			FileOutputStream fop = new FileOutputStream(filepath);
			properties.store(fop, "file is saved successfully");
			
	 }	
		 else {
		 //throws exception
		 System.out.println("properties objects is pointing null");
		}
	 }
	   
		 public void addkeyvalue(Object key, Object value) throws IOException  {
			 if (properties!=null ) {
				 properties.put(key, value);
				FileOutputStream fop = new FileOutputStream(filepath);
				properties.store(fop, "file is saved successfully");
				
		 }	
			 else {
			 //throws exception
			 System.out.println("properties objects is pointing null");
			}
		   
		 }
			 public void removekey(String key) throws IOException  {
				 if (properties!=null ) {
					 properties.remove(key);
					FileOutputStream fop = new FileOutputStream(filepath);
					properties.store(fop, "file is saved successfully");
					
			 }	
				 else {
				 //throws exception
				 System.out.println("properties objects is pointing null");
				}
	}
			 public void removekey(String key, String value) throws IOException  {
				 if (properties!=null ) {
					 properties.remove(key, value);
					FileOutputStream fop = new FileOutputStream(filepath);
					properties.store(fop, "file is saved successfully");
					
			 }	
				 else {
				 //throws exception
				 System.out.println("properties objects is pointing null");
				}
			 }
 
			 
			 public Set getAllKeys() {
				 Set setkeys = null;
			 if (properties!=null) {
	     		setkeys = properties.keySet();
				}
			 else {
				 //throws exception
				 System.out.println("properties objects is pointing null");
				}
			return setkeys;

			}
			 
			 public List getAllvalues() {
			   List listvalues = new ArrayList();
			 if (properties!=null) {
				Set setkeys = properties.keySet();
	     		for(Object obj : setkeys) {
	     			listvalues.add(obj);
	     			}
	     		}
				
			 else {
				 //throws exception
				 System.out.println("properties objects is pointing null");
				}
			return listvalues;

			}
			 public Map getAllkeyValues() {
				Map keyvalues = new HashMap();
				 if (properties!=null) {
					Set setkeys = properties.keySet();
		     		for(Object obj : setkeys) {
		     		Object val = properties.get(obj);
		     		keyvalues.put(obj, val);
		     			}
		     		}
					
				 else {
					 //throws exception
					 System.out.println("properties objects is pointing null");
					}
				return keyvalues;

			}
 public static void main(String[] args) throws IOException {
	PropertiesReader pr = new PropertiesReader("D:\\Javapractice\\fpomframework\\config.properties");
	String val =pr.getValue("qa_url");
	System.out.println(val);
	
}
 
 
}