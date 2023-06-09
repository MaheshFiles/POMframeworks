package com.mahesh.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextReader {
	private String filepath;
	private File file;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private String value;

	public TextReader(String filepath) throws IOException {
		this.filepath = filepath;
		file = new File(filepath);
		if (file.createNewFile()) {
			System.out.println("File is created newly");
		} else {
			System.out.println("Returns file existing!");
		}
		fileWriter = new FileWriter(file);
		bufferedWriter = new BufferedWriter(fileWriter);
		fileReader = new FileReader(filepath);
		bufferedReader = new BufferedReader(fileReader);

	}

	public void writeData(int data) throws IOException {
		if (bufferedWriter != null) {
			bufferedWriter.write(data);
			bufferedWriter.flush();
		} else {
			// throws exception
			System.out.println("bufferedWriter pointing to null");
		}
	}

	public void writeData(String data) throws IOException {
		if (bufferedWriter != null) {
			bufferedWriter.write(data);
			bufferedWriter.flush();
		} else {
			// throws exception
			System.out.println("bufferedWriter pointing to null");
		}
	}

	public String getData() throws IOException {
		if (bufferedReader != null) {
			value = bufferedReader.readLine();
		} else {
			// throws exception
			System.out.println("bufferedreader pointing to null");
		}
		return value;

	}

	public List<String> getTotalData() throws IOException {
		List<String> fileData = new ArrayList<String>();
		if (bufferedReader != null) {
			value = bufferedReader.readLine();
			fileData.add(value);
		} else {
			// throws exception
			System.out.println("bufferedreader pointing to null");
		}
		return null;

	}
}
