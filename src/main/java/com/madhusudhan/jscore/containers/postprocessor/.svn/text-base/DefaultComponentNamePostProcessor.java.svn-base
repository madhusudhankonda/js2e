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
public class DefaultComponentNamePostProcessor implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object o, String string) throws BeansException {
        System.out.println("PostProcess BEFORE init: " +o);
        if(o instanceof PostProcessComponent){
            ((PostProcessComponent)o).setComponentName("LONDON-DEFAULT-COMP");
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String string) throws BeansException {
        System.out.println("PostProcess AFTER init: " +o);
        if(o instanceof PostProcessComponent){
            
            System.out.println("Default Property: "+((PostProcessComponent)o).getComponentName());
        }
        return o;
    }
    
}
