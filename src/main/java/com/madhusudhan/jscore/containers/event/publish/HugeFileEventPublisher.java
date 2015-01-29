/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.event.publish;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 *
 * @author mkonda
 */
public class HugeFileEventPublisher implements ApplicationEventPublisherAware{

    private ApplicationEventPublisher applicationEventPublisher = null;
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
   
    public void publish(String fileName){
        System.out.println("Publishing a HugeFileEvent, file is: "+fileName);
        HugeFileEvent hugeFileEvent = new HugeFileEvent(this,fileName);
        applicationEventPublisher.publishEvent(hugeFileEvent);
    }
}
