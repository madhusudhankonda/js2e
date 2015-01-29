package com.madhusudhan.jscore.basics.readers;

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
public class FileReader implements IReader {

    private StringBuilder builder = null;
    private Scanner scanner = null;
    private String componentName = null;

    public FileReader(String fileName) {
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException occured : " + ex.getMessage());
        }
        builder = new StringBuilder();
    }

    public String read() {
        while (scanner.hasNext()) {
            builder.append(scanner.next());
            builder.append(",");
        }
        return builder.toString();
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }
}
