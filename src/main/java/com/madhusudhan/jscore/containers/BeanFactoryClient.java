/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * @author mkonda
 */
public class BeanFactoryClient {

    private BeanFactory beanFactory = null;
    
    public void init(){
        beanFactory = new XmlBeanFactory(new FileSystemResource("containers-beans.xml"));
    }
}
