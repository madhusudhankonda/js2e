package com.madhusudhan.jscore.basics.vanilla;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class reads data from a File. This is used by a client when file reading
 * is required. It expects a string type of filename.
 * 
 * @author kondama
 * 
 */
public class VanillaFileReader {
  private StringBuilder builder = null;
  private Scanner scanner = null;

  public VanillaFileReader(String fileName) throws FileNotFoundException {
    scanner = new Scanner(new File(fileName));
    builder = new StringBuilder();
  }

  public String read() {
    while (scanner.hasNext()) {
      builder.append(scanner.next());
      builder.append(",");
    }
    return builder.toString();
  }
}
