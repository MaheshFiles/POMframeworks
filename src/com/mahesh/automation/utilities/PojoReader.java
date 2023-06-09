package com.mahesh.automation.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.json.simple.parser.ParseException;

import com.mahesh.automation.supporters.ExcelReader;
import com.mahesh.automation.supporters.JsonReader;
import com.mahesh.automation.supporters.PropertiesReader;
import com.mahesh.automation.supporters.TextReader;

public class PojoReader {

	public static PropertiesReader getConfPr() throws IOException
	{
		PropertiesReader prConf = new PropertiesReader(FilePaths.confFilepath); 
		return prConf;
		
	}
	public static PropertiesReader getOrPr() throws IOException
	{
		PropertiesReader prOr = new PropertiesReader(FilePaths.orFilepath);
		return prOr;
		
	}
	public static ExcelReader getExcelReader() throws EncryptedDocumentException, IOException
	{
		ExcelReader excelReader = new ExcelReader(FilePaths.excelFilepath);
		return excelReader;
	}
	public static TextReader getTextReader() throws IOException
	{
		TextReader textReader = new TextReader(FilePaths.txtFilepath);
		return textReader;
	}
	
	public static JsonReader getTDJsonObj() throws FileNotFoundException, IOException, ParseException
	{
		JsonReader jsonReader = new JsonReader(FilePaths.jsonTestDataFilepath);
		return jsonReader;
	}
	public static JsonReader getOrJsonObj() throws FileNotFoundException, IOException, ParseException
	{
		JsonReader jsonReader = new JsonReader(FilePaths.jsonOrFilepath);
		return jsonReader;
	}
}
