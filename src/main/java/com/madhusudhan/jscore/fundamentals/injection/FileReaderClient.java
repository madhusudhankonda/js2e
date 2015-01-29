/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.fundamentals.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class FileReaderClient {
    
    private static ApplicationContext context = null;

    public void testComponentName(){
        context = new ClassPathXmlApplicationContext("fundamentals-beans.xml");
        
        FileReader fileReader = context.getBean("reader",FileReader.class);
        
        System.out.println("FileReader component name: "+fileReader.getComponentName());
    }
    
    public static void main(String[] args){
        FileReaderClient client = new FileReaderClient();
        
        client.testComponentName();
    }
}
