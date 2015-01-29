package com.madhusudhan.jscore.jms.pub;

import java.io.Serializable;

public class Student implements Serializable {

    private int id = 0;
    private String firstName = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private String lastName = null;
}
