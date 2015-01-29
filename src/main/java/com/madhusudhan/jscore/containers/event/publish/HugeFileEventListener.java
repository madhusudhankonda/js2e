/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.event.publish;

import org.springframework.context.ApplicationListener;

/**
 *
 * @author mkonda
 */
public class HugeFileEventListener implements ApplicationListener<HugeFileEvent> {

    public void onApplicationEvent(HugeFileEvent event) {
        System.out.println("Received HugeFileEvent application event:"+event.getSource());
    }
 
}
