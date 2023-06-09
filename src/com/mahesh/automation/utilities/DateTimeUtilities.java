package com.mahesh.automation.utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface DateTimeUtilities {

	public static String getCurrentDateMonthYear() {
	
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println("before formating: "+localDateTime);
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formatedDateTime =localDateTime.format(dateTimeFormatter);
	System.out.println("after formating:"+formatedDateTime);
	return formatedDateTime;
	}
	
	public static int getCurrentDate()
	{
		LocalDate localDate = LocalDate.now();
		String localDate1 = localDate.toString();
		String[] str = localDate1.split("-"); //2023-05-14
		String date = str[2];
		int date1 = Integer.parseInt(date);
		return date1;
		
	}
	
	public static int getCurrentMonth()
	{
		LocalDate localDate = LocalDate.now();
		String localDate1 = localDate.toString();
		String[] str = localDate1.split("-"); //2023-05-14
		String month = str[1];
		int month1 = Integer.parseInt(month);
		return month1;	
	}
	
	public static int getCurrentYear()
	{
		LocalDate localDate = LocalDate.now();
		String localDate1 = localDate.toString();
		String[] str = localDate1.split("-"); //2023-05-14
		String year = str[0];
		int year1 = Integer.parseInt(year);
		return year1;	
	}
	
	public static String pastDate(int daysToSubtract) {
		
	return LocalDate.now().minusDays(daysToSubtract).toString();
		
	}
	
	public static String futureDate(int daysToadd) {
		
		return LocalDate.now().plusDays(daysToadd).toString();
			
		}
	
	
	
	
	
	
	
	
	}
