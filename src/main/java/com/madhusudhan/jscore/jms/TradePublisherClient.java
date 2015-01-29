package com.madhusudhan.jscore.jms;

import com.madhusudhan.jscore.basics.vanilla.*;
import com.madhusudhan.jscore.containers.lifecycle.LazyEmployee;
import java.io.FileNotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is a client that reads the data using FileReader. Notice the tight
 * coupling between the client and reader.
 *
 * @author kondama
 *
 */
public class TradePublisherClient {

    private ApplicationContext ctx = null;

    public void test() {
        ctx = new ClassPathXmlApplicationContext("jms-beans.xml");
        
        TradePublisher publisher = ctx.getBean("tradePublisher",TradePublisher.class);
        Trade trade = new Trade();
        publisher.publishTrade(trade);
        System.out.println("Published");
    }

    public static void main(String[] args) {
        TradePublisherClient test = new TradePublisherClient();
        test.test();
    }
}
