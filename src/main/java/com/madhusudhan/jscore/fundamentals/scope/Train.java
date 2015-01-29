/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.fundamentals.scope;

/**
 *
 * @author mkonda
 */
public class Train {
    private String trainName = "London To Brighton";

    public int getInstance(){
        return this.hashCode();
    }
    
    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
}
