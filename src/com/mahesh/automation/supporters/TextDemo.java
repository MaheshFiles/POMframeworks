package com.mahesh.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextDemo {
public static void main(String[] args) throws IOException {
	

	System.setProperty("webdriver.chrome.driver", "D:\\Javapractice\\corejavasubject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.in/");
	
	WebElement eng = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	String txt =	eng.getText();
	Actions actions = new Actions(driver);
	actions.moveToElement(eng).build().perform();

	
	File file = new File("D:\\Javapractice\\fpomframework\\src\\com\\mahesh\\automation\\supporters\\demo.txt");
	boolean status = file.createNewFile();
	if (status) {
		System.out.println("file is created newly");
	}
	else {
		System.out.println("Returns existing file!");
	}
	
	FileWriter fr = new FileWriter(file);
	BufferedWriter bwr = new BufferedWriter(fr);	
	bwr.write(txt);
	bwr.flush();
	bwr.close();
	
	driver.close();
	
	//in order to read the data from FileReader method & BufferedReader method
	/*	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	while (bufferedReader.ready()) {
	String data = 	bufferedReader.readLine();
	System.out.println(data);
	}
	
	bufferedReader.close();
	*/
	
	
	
	

	// in order to write the data we have FileWriter method & BufferedWriter method
/*	 
//	FileWriter fileWriter = new FileWriter(file);
	FileWriter fileWriter = new FileWriter(file,true);
	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	bufferedWriter.write("selenium");
	bufferedWriter.newLine();
	bufferedWriter.write("with");
	bufferedWriter.newLine();
	bufferedWriter.write("java");
	bufferedWriter.newLine();
	bufferedWriter.write("automationTesting");
	bufferedWriter.newLine();
	
//	bufferedWriter.flush();
	bufferedWriter.close();
	*/
}
}
