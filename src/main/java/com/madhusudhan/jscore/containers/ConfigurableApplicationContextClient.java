/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class ConfigurableApplicationContextClient {

    private ApplicationContext ctx = null;

    public void test() {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("containers-beans.xml");
        System.out.println("Is context running: "+ctx.isRunning());
        
        Employee emp =ctx.getBean("employee", Employee.class);
        System.out.println("Employee found: "+emp);
    }

    public static void main(String args[]) {
        ConfigurableApplicationContextClient client = new ConfigurableApplicationContextClient();

        client.test();
    }
}
