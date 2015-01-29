/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author mkonda
 */
public class EmailSignaturePostProcessor implements BeanPostProcessor {

    //private Email email = new Email();
    public Object postProcessBeforeInitialization(Object o, String string) throws BeansException {
        System.out.println("PostProcess BEFORE init: " + o);
        if (o instanceof Email) {
            ((Email) o).setSignature("Sending Email from Just Spring!");
        }

        return o;
    }

    public Object postProcessAfterInitialization(Object o, String string) throws BeansException {
        System.out.println("PostProcess AFTER init: " + o);
        if (o instanceof Email) {
            System.out.println("Email sig: " + ((Email) o).getSignature());
            ((Email) o).setSignature("Email sent from Just Spring!");
        }
        return o;
    }
}
