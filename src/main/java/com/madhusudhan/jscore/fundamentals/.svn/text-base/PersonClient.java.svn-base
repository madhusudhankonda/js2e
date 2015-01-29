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
public class PersonClient {

    private static ApplicationContext context = null;

    public PersonClient() {
        context = new ClassPathXmlApplicationContext("fundamentals-beans.xml");
    }

    public String getPersonDetails() {
        Person person = (Person) context.getBean("person");

        return person.getDetails();
    }
    
     public void getAddressAliases() {
        Address address1 = context.getBean("billingAddress", Address.class);
        Address address2 = context.getBean("shippingAddress", Address.class);

         System.out.println("Address1:"+address1);
         System.out.println("Address2:"+address2);
    }

    public static void main(String[] args) {
//        person = new Person("Madhusudhan", "Konda");
//        person.setAge(100);
//        Address address = new Address();
//        
//        address.setDoorNumber(1234);
//        address.setFirstLine("Cherry Tree Lane");
//        address.setSecondLine("Spitalfields, London");
//        address.setZipCode("EC11LW");
//        
//        person.setAddress(address);
        
        PersonClient client = new PersonClient();
        
        System.out.println("Person Details:"+client.getPersonDetails());
        client.getAddressAliases();
        
    }
}
