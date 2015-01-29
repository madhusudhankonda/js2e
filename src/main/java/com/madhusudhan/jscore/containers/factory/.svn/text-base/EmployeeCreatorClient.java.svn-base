/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.factory;

import com.madhusudhan.jscore.containers.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mkonda
 */
public class EmployeeCreatorClient {

    private ApplicationContext ctx = null;

    public void createEmployees() {
        ctx = new ClassPathXmlApplicationContext("containers-beans.xml");

        Employee employee = ctx.getBean("employee", Employee.class);
        Employee executive = ctx.getBean("executive", Employee.class);

        System.out.println("Employee: " + employee);
        System.out.println("Exec: " + executive);
    }

    public static void main(String args[]) {
        EmployeeCreatorClient client = new EmployeeCreatorClient();

        client.createEmployees();;
    }
}
