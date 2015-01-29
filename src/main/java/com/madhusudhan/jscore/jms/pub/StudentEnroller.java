package com.madhusudhan.jscore.jms.pub;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class StudentEnroller {

    private String destinationName = null;
    private JmsTemplate jmsTemplate = null;
    private JmsTemplate defaultDestinationJmsTemplate = null;

    public void publish(final Student s) {
        getJmsTemplate().send(getDestinationName(), new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage m = session.createTextMessage();
                m.setText("Enrolled Student: " + s.toString());
                return m;
            }
        });
        System.out.println("Successfully published student message to " + getDestinationName());
    }

    public void publishToDefautDestination(final Student s) {
        getDefaultDestinationJmsTemplate().send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage m = session.createTextMessage();
                m.setText("Enrolled Student: " + s.toString());
                return m;
            }
        });
        System.out.println("Successfully published student message to " + getDefaultDestinationJmsTemplate().getDefaultDestinationName());
    }
    // setters and getters for the jmsTemplate and destinationName variables

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public JmsTemplate getDefaultDestinationJmsTemplate() {
        return defaultDestinationJmsTemplate;
    }

    public void setDefaultDestinationJmsTemplate(JmsTemplate defaultJmsTemplate) {
        this.defaultDestinationJmsTemplate = defaultJmsTemplate;
    }
}