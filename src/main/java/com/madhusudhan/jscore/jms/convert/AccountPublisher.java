package com.madhusudhan.jscore.jms.convert;

import org.springframework.jms.core.JmsTemplate;

public class AccountPublisher {

    private String destinationName = "ACCOUNTS";
    private JmsTemplate jmsTemplate = null;

    // access the template when publishing the message
    public void publishAccount(final Account t) {
        jmsTemplate.convertAndSend(destinationName, t);
    }
    
    public void receiveAccount(final Account t) {
        Object o = jmsTemplate.receiveAndConvert(destinationName);
    }
    
    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
}
