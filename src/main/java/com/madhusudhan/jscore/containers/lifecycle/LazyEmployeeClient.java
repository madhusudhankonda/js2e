/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class LazyEmployeeClient {

    private ApplicationContext ctx = null;

    public void test() {
        ctx = new ClassPathXmlApplicationContext("containers-beans.xml");

        LazyEmployee lazyEmployee = ctx.getBean("lazyEmployee", LazyEmployee.class);
        System.out.println("Lazy Employee Days:" + lazyEmployee.getWeekDays());

        ((ClassPathXmlApplicationContext) ctx).close();

    }

    public static void main(String args[]) {
        LazyEmployeeClient client = new LazyEmployeeClient();

        client.test();
    }
}
