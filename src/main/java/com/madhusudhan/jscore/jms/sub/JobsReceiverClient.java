package com.madhusudhan.jscore.jms.sub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JobsReceiverClient {

    private ApplicationContext ctx = null;
    private JobsReceiver receiver = null;
    public JobsReceiverClient() {
        ctx = new ClassPathXmlApplicationContext("jms-sub-beans.xml");
        receiver =  ctx.getBean("jobsReceiver",JobsReceiver.class);
    }
    
    private void receive(){
        receiver.receiveMessages();
    }
    
    public static void main(String[] args) {
        JobsReceiverClient client = new JobsReceiverClient();
        Job s = new Job();
        client.receive();
    }
}
    