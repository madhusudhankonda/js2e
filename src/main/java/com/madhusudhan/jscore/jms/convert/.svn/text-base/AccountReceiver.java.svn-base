package com.madhusudhan.jscore.jms.convert;

import org.springframework.jms.core.JmsTemplate;

public class AccountReceiver {

    private String destinationName = "ACCOUNTS";
    private JmsTemplate jmsTemplate = null;

    public void receiveAccount() {
        Object o = jmsTemplate.receiveAndConvert(destinationName);
        
        System.out.println("Received "+o);
    }
    
    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
}
