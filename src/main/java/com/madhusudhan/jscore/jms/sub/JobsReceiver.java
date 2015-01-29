package com.madhusudhan.jscore.jms.sub;

import javax.jms.Message;
import org.springframework.jms.core.JmsTemplate;

public class JobsReceiver {

    private JmsTemplate jmsTemplate = null;
    private String destinationName = null;

    public void receiveMessages() {
        Message msg = getJmsTemplate().receive(destinationName);
        System.out.println("Job Received: " + msg);
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }
}
