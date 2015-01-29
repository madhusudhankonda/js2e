/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.fundamentals.scope;

import com.madhusudhan.jscore.fundamentals.injection.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class TrainClient {

    private static ApplicationContext context = null;
    private Train train = null;
    private TrainFactory trainFactory = null;

    public void init() {
        context = new ClassPathXmlApplicationContext("fundamentals-beans.xml");
    }

    private void checkTrainInstance() {
        for (int i = 0; i < 10; i++) {
            train = context.getBean("train", Train.class);
            System.out.println("Train instance: " + train.getInstance());
        }
    }
    
     private void checkTrainFactoryInstance() {
        for (int i = 0; i < 10; i++) {
            trainFactory = context.getBean("trainFactory", TrainFactory.class);
            System.out.println("TrainFactory instance: " + trainFactory.getInstance());
        }
    }

    public static void main(String[] args) {
        TrainClient client = new TrainClient();

        client.init();
        client.checkTrainInstance();
        client.checkTrainFactoryInstance();
    }
}
