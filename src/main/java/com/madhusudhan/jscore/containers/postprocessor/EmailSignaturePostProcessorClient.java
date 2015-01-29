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
public class EmailSignaturePostProcessorClient {

    private ApplicationContext ctx = null;

    private String[] contextFiles = new String[]{"containers-postprocess-beans.xml"};
    
    public void test() {
        ctx = new ClassPathXmlApplicationContext(contextFiles);
        
    }

    public static void main(String args[]) {
        EmailSignaturePostProcessorClient client = new EmailSignaturePostProcessorClient();

        client.test();
    }
}
