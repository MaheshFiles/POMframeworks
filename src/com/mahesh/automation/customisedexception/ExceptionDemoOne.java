package com.mahesh.automation.customisedexception;

import java.io.FileInputStream;

public class ExceptionDemoOne {
	public static void main(String[] args) {

		try {
			FileInputStream fip = new FileInputStream("D:\\Javapractice\\fpomframework\\123data.json");
		} catch (Exception exception) {
			// exception.printStackTrace();
			// String exceptionMsg = exception.getMessage();
			String exceptionMsg = exception.toString();
			System.out.println(exceptionMsg);
			System.out.println(exception);

		}

	}
}
