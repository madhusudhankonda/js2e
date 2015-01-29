package com.madhusudhan.jscore.jms.async;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookOrderListenerClient {

    private ApplicationContext ctx = null;

    public BookOrderListenerClient() {
        ctx = new ClassPathXmlApplicationContext("jms-async-beans.xml");
    }
  
    public static void main(String[] args) {
        BookOrderListenerClient client = new BookOrderListenerClient();
    }
}
    