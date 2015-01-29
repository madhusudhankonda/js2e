/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.data;

import com.madhusudhan.jscore.fundamentals.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class MovieClient {

    private static ApplicationContext context = null;

    public MovieClient() {
        context = new ClassPathXmlApplicationContext("data-basics-beans.xml");
    }

    public String test() {
        MovieDAO movie =  context.getBean("movieDao", MovieDAO.class);

        return movie.getStars("dumbo");
    }

    public static void main(String[] args) {
        
        MovieClient client = new MovieClient();
        
        System.out.println("Person Details:"+client.test());
        
    }
}
