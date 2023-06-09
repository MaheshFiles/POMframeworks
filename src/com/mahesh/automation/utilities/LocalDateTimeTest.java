package com.mahesh.automation.utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
public static void main(String[] args) {
	
	
	LocalDate localDate = LocalDate.now();
	System.out.println(localDate);
	
	LocalDate tomDate =	localDate.plusDays(1);
	System.out.println(tomDate);
	
	LocalDate dayAftertomDate =	localDate.plusDays(2);
	System.out.println(dayAftertomDate);
	
	LocalDate yestrDayDate = localDate.minusDays(1);
	System.out.println(yestrDayDate);
	
	LocalTime localTime = LocalTime.now();
	System.out.println(localTime);
	
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println(localDateTime);
	
}
}
