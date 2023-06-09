package com.mahesh.automation.supporters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mahesh.automation.customisedexception.FrameworkException;

public class JsonReader {
	private String filepath;
	private JSONParser jsonParser;
	private JSONObject jsonObject;
	private String value;

	public JsonReader(String filepath) throws FileNotFoundException, IOException, ParseException {
		this.filepath = filepath;
		jsonParser = new JSONParser();
		Object object = jsonParser.parse(new FileReader(filepath));
		jsonObject = (JSONObject) object;

	}

	public String getJsonValue(String key) throws FrameworkException {
		if (jsonObject != null) {
			value = (String) jsonObject.get(key);
			System.out.println(value);
		} else {
			// throws exception
			System.out.println("JSONObject is pointing to null");
			FrameworkException exception = new FrameworkException("JSONObject is pointing to null");
			throw exception;
		}
		return value;
	}

	public List<String> getAllJsonValues() throws FrameworkException {
		List<String> listJsonValues = new ArrayList<String>();
		if (jsonObject != null) {
			Set setkeys = jsonObject.keySet();
			for (Object object : setkeys) {
				String value = (String) object;
				listJsonValues.add(value);
			}

		}
		else {
			// throws exception
			System.out.println("JSONObject is pointing to null");
			FrameworkException exception = new FrameworkException("JSONObject is pointing to null");
			throw exception;

		}
		return listJsonValues;

	}

	public Map<String, String> getAllJsonKeysValues() {
		Map<String, String> mapKV = new HashMap<String, String>();
		if (jsonObject != null) {
			Set setkeys = jsonObject.keySet();
			for (Object obj : setkeys) {

				String key = (String) obj;
				String value = (String) jsonObject.get(key);
				mapKV.put(key, value);

			}

		} else {
			// throws exception
			System.out.println("JSONObject is pointing to null");
		}
		return mapKV;

	}

}
