/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.fundamentals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class TrainManClient {

    private ApplicationContext context = null;

    public void init() {
        context = new ClassPathXmlApplicationContext("fundamentals-beans.xml");

    }

    public static void main(String[] args) {
        TrainManClient man = new TrainManClient();
        man.init();
    }
}
