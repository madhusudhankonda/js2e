package com.madhusudhan.jscore.jms.convert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountConverterClient {

    private ApplicationContext ctx = null;
    private AccountPublisher publisher = null;
    private AccountReceiver receiver = null;

    public AccountConverterClient() {
        ctx = new ClassPathXmlApplicationContext("jms-convert-beans.xml");
        publisher = ctx.getBean("accountPublisher", AccountPublisher.class);
        receiver = ctx.getBean("accountReceiver", AccountReceiver.class);
    }

    public void test() {
        
        new Thread(new PublisherThread(publisher)).start();
        System.out.println("Receiving..");
        receiver.receiveAccount();
        
    }

    public static void main(String[] args) {
        AccountConverterClient client = new AccountConverterClient();
        client.test();
    }

    private class PublisherThread implements Runnable {

        AccountPublisher publisher = null;

        public PublisherThread(AccountPublisher publisher) {
            this.publisher = publisher;
        }

        public void run() {
            publisher.publishAccount(new Account());
            System.out.println("published..");
        
        }
    }
}
