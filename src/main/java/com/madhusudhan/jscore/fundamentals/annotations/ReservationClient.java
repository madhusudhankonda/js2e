/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.fundamentals.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class ReservationClient {
   
    private ApplicationContext ctx = null;
    
    public void init(){
        ctx = new ClassPathXmlApplicationContext("fundamentals-annon-beans.xml");
    }
    private void test() {
        ReservationManager manager = ctx.getBean("reservationManager",ReservationManager.class);
        
        manager.reserve();
    }
    
    public static void main(String[] args) {
        ReservationClient manager = new ReservationClient();
        manager.init();
        manager.test();
    }
    
  
    
    
}
