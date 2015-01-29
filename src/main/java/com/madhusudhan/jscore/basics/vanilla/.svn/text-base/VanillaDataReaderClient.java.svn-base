package com.madhusudhan.jscore.basics.vanilla;

import java.io.FileNotFoundException;

/**
 * This is a client that reads the data using FileReader. Notice the tight
 * coupling between the client and reader.
 * 
 * @author kondama
 * 
 */
public class VanillaDataReaderClient {
  private VanillaFileReader fileReader = null;
  private String fileName = "src/main/resources/basics/basics-trades-data.txt";

  public VanillaDataReaderClient() {
    try {
      fileReader = new VanillaFileReader(fileName);
    } catch (FileNotFoundException e) {
      System.out.println("Exception" + e.getMessage());
    }
  }

  private String fetchData() {
    return fileReader.read();
  }

  public static void main(String[] args) {
    VanillaDataReaderClient dataReader = new VanillaDataReaderClient();
    System.out.println("Got data using no-spring: " + dataReader.fetchData());
  }
}
