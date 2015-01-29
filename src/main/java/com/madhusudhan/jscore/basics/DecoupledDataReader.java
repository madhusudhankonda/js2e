package com.madhusudhan.jscore.basics;

import com.madhusudhan.jscore.basics.readers.IReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * This is a client that reads the data using an implementation of IReader.
 * Notice the decoupling between the client and reader - client wouldn't know
 * who the reader is.
 * 
 * @author kondama
 * 
 */
public class DecoupledDataReader {
  private IReader reader = null;
  private ApplicationContext ctx = null;

  public DecoupledDataReader() {
    ctx = new ClassPathXmlApplicationContext("basics-reader-beans.xml");
  }

  private String fetchData() {
    reader =  ctx.getBean("reader", IReader.class);
    return reader.read();
  }

  public static void main(String[] args) {
    DecoupledDataReader client = new DecoupledDataReader();
    System.out.println("Using Decoupled Data Client, Got data: " + client.fetchData());
  }
}
