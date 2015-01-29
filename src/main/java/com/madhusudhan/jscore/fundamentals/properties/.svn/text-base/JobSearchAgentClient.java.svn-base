/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.fundamentals.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class JobSearchAgentClient {

    private ApplicationContext context = null;
    private JobSearchAgent jobSearchAgent = null;
    

    public void init() {
        context = new ClassPathXmlApplicationContext("fundamentals-beans.xml");
    }

    public void test() {
        jobSearchAgent = context.getBean("jobSearchAgent", JobSearchAgent.class);
        System.out.println("Job Location: "+jobSearchAgent.getLocation());
        System.out.println("Job Type: "+jobSearchAgent.getType());
    }

    public static void main(String[] args) {
        JobSearchAgentClient client = new JobSearchAgentClient();
        client.init();
        client.test();;
    }
}
