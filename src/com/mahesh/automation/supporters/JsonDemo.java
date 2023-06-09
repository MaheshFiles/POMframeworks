package com.mahesh.automation.supporters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDemo {
	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {

		JSONParser jsonParser = new JSONParser();

//    Object obj = jsonParser.parse("D:\\Javapractice\\fpomframework\\data.json");
		Object obj = jsonParser.parse(new FileReader("D:\\Javapractice\\fpomframework\\data.json"));

		JSONObject jsonObject = (JSONObject) obj;

		String un = (String) jsonObject.get("username");
		System.out.println(un);

		String pwd = (String) jsonObject.get("pwd");
		System.out.println(pwd);

		String practice = (String) jsonObject.get("practice");
		System.out.println(practice);

		String hardwork = (String) jsonObject.get("hardwork");
		System.out.println(hardwork);

		Set setkey = jsonObject.keySet();
		for (Object obj1 : setkey) {
			String str = (String) jsonObject.get(obj1);
			System.out.println(str);
			System.out.println(obj1 + " = " + str);
		}

	}

}
