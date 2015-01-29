/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class DefaultComponentNamePostProcessorClient {

    private ApplicationContext ctx = null;

    public void test() {
        ctx = new ClassPathXmlApplicationContext("containers-postprocess-beans.xml");
        
    }

    public static void main(String args[]) {
        DefaultComponentNamePostProcessorClient client = new DefaultComponentNamePostProcessorClient();

        client.test();
    }
}
