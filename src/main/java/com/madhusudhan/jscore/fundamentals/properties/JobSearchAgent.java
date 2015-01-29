/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.fundamentals.properties;

import java.math.BigDecimal;

/**
 *
 * @author mkonda
 */
public class JobSearchAgent {

    private String location = null;
    private String type = null;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    } 

    @Override
    public String toString() {
        return "JobSearchAgent{" + "location=" + location + ", type=" + type + '}';
    }
}
