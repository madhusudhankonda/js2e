package com.madhusudhan.jscore.jms.pub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentEnrollerClient {

    private ApplicationContext ctx = null;
    private StudentEnroller enroller = null;

    public StudentEnrollerClient() {
        ctx = new ClassPathXmlApplicationContext("jms-pub-beans.xml");
        enroller = (StudentEnroller) ctx.getBean("studentEnroller");
        
    }

    public void publishStudent(Student s) {
        System.out.println("Publishing Student..");
        enroller.publish(s);
    }
    
    public void publishStudentToDefaultDestination(Student s) {
        System.out.println("Publishing Student to default destination..");
        enroller.publishToDefautDestination(s);
    }

    public static void main(String[] args) {
        StudentEnrollerClient client = new StudentEnrollerClient();
        Student s = new Student();
        client.publishStudent(s);
        client.publishStudentToDefaultDestination(s);
    }
}
    