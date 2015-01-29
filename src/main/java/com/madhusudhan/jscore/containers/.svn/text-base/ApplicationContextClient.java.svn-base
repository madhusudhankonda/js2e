/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers;

import com.madhusudhan.jscore.fundamentals.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class ApplicationContextClient {
    private ApplicationContext ctx = null;
    private String[] configLocations = new String[]{"containers-beans.xml","fundamentals-beans.xml"};

    public void testClasspathXmlApplicationContext(){
        ctx = new ClassPathXmlApplicationContext(configLocations);
        
        Employee employee = ctx.getBean("emp",Employee.class);
        Person person = ctx.getBean("person", Person.class);
        
        System.out.println(employee);
        System.out.println(person);
    }
    
    public void testFileSystemsXmlApplicationContext(){
        ctx = new FileSystemXmlApplicationContext("/src/main/resources/containers-beans.xml");
        
        Employee employee = ctx.getBean("employee",Employee.class);
        
        System.out.println(employee);
    }
    
    public static void main(String[] args){
        ApplicationContextClient client = new ApplicationContextClient();
        
        client.testClasspathXmlApplicationContext();
        
//        client.testFileSystemsXmlApplicationContext();
    }
    
    
}
