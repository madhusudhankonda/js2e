/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author mkonda
 */
public class LazyEmployee implements InitializingBean, DisposableBean {

    private String weekDays = null;

    public void afterPropertiesSet() throws Exception {
        System.out.println("AfterPropertiesSet called");
        weekDays = "FOUR";
    }

    public void destroy() throws Exception {
        System.out.println("Destroy called");
    }

    public String getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(String weekDays) {
        System.out.println("Setting the weekDays to "+weekDays);
        this.weekDays = weekDays;
    }
}
