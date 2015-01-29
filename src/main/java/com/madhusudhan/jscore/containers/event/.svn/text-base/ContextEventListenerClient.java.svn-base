/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class ContextEventListenerClient {

    private ConfigurableApplicationContext ctx = null;

    public void test() {
        ctx = new ClassPathXmlApplicationContext("containers-events-beans.xml");
        ctx.start();
        ctx.refresh();    
        ctx.stop();    
    }

    public static void main(String args[]) {
        ContextEventListenerClient client = new ContextEventListenerClient();

        client.test();
    }
}
