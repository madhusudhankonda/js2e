/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.jms.convert;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

/**
 *
 * @author mkonda
 */
public class AccountConverter implements MessageConverter {
  @Override
  public Object fromMessage(Message msg) throws JMSException,
                                 MessageConversionException {
      
    ObjectMessage objMsg = (ObjectMessage) msg;
    
    Account t = (Account) objMsg.getObject();
    
    System.out.println("fromMessage: " + msg.toString());
    return t;
  }

  @Override
  public Message toMessage(Object obj, Session session) throws JMSException,
                                                MessageConversionException {
    ObjectMessage objMsg = session.createObjectMessage();
    
    objMsg.setObject((Account) obj); 
    System.out.println("toMessage: " + objMsg.toString());
    return objMsg;
  }
}