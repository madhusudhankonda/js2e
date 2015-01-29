package com.madhusudhan.jscore.basics;

import com.madhusudhan.jscore.basics.readers.IReader;
import com.madhusudhan.jscore.basics.readers.FileReader;
import java.io.FileNotFoundException;

/**
 * This is a client that reads the data using FileReader. Notice the tight
 * coupling between the client and reader.
 *
 * @author kondama
 *
 */
public class ReaderClient {

	private IReader reader = null;
	private static String fileName = "src/main/resources/basics/basics-trades-data.txt";

	private String fetchData(String fileName) {
		reader = new FileReader(fileName);// Ummh..still hard wired
		return reader.read();
	}

	public static void main(String[] args) {
		ReaderClient client = new ReaderClient();
		System.out.println("Got data using interface design priciple: "
				+ client.fetchData(fileName));
	}
}
