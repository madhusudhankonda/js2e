/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class AutoWireByNameClient {

    private ApplicationContext ctx = null;

    public void test() {
        ctx = new ClassPathXmlApplicationContext("containers-autowire-beans.xml");
        TradeReceiver tradeReceiver = ctx.getBean("tradeReceiver", TradeReceiver.class);
        System.out.println("TradeReciver:"+tradeReceiver.toString());
    }

    public static void main(String args[]) {
        AutoWireByNameClient client = new AutoWireByNameClient();

        client.test();
    }
}
