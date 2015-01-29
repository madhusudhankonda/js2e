package com.madhusudhan.jscore.basics.vanilla;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This is a client that reads the data using FileReader. Notice the tight
 * coupling between the client and reader.
 * 
 * @author kondama
 * 
 */
public class VanillaFileReaderClient {

	private final static String fileName = "src/main/resources/basics/basics-trades-data.txt";

	private VanillaFileReader fileReader = null;

	private String fetchData(String fileName) throws IOException {

		fileReader = new VanillaFileReader(fileName);

		return fileReader.read2();
	}

	public static void main(String[] args) throws IOException {

		VanillaFileReaderClient client = new VanillaFileReaderClient();

		String result = client.fetchData(fileName);
		
		System.out.println("Trade data (using no-spring): " + result);
	}
}
