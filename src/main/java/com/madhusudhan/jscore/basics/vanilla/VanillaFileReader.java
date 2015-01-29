package com.madhusudhan.jscore.basics.vanilla;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * This class reads data from a File. This is used by a client when file reading
 * is required. It expects a string type of filename.
 * 
 * @author mkonda
 * 
 */
public class VanillaFileReader {
	private Scanner scanner = null;
	private InputStream in = null;
	private BufferedReader inReader = null;
	public VanillaFileReader(String fileName) throws FileNotFoundException {
		scanner = new Scanner(new File(fileName));
		in = new FileInputStream(fileName);
		inReader = new BufferedReader(new FileReader(fileName));
	}

	public String read() {
		StringBuilder builder = new StringBuilder();
		while (scanner.hasNext()) {
			builder.append(scanner.next());
			builder.append(",");
		}
		return builder.toString();
	}

	public String read2() throws IOException {
		StringBuilder builder = new StringBuilder();
		
//		Stream lines = inReader.lines();
//		lines.
//		while(inReader.readLine()!=null){
			builder.append(inReader.readLine());
			builder.append("\n");
//		}
		
		return builder.toString();
	}
}
