/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.event.publish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class HugeFileEventClient {

    private ApplicationContext ctx = null;
    private HugeFileEventPublisher hugeFileEventPublisher = null;
    
    public void test() {
        ctx = new ClassPathXmlApplicationContext("containers-events-publish-beans.xml");
        hugeFileEventPublisher = ctx.getBean("hugeFileEventPublisher", HugeFileEventPublisher.class);
        hugeFileEventPublisher.publish("huge-file.txt");
    }

    public static void main(String args[]) {
        HugeFileEventClient client = new HugeFileEventClient();

        client.test();
    }
}
