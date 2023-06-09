package com.mahesh.automation.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatTest {
public static void main(String[] args) {
	
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println("before formating: "+localDateTime);
	
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	String formatedDateTime =localDateTime.format(dateTimeFormatter);
	System.out.println("after formating:"+formatedDateTime);
	
	
	
	
	
	
}
}
