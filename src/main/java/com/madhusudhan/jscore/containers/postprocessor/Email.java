/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jscore.containers.postprocessor;

/**
 *
 * @author mkonda
 */
public class Email {

    private String to = null;
    private String from = null;
    private String message = null;
    private String signature = null;

    public void init(){
        System.out.println("Email's INIT method");
    }
    
    public void destroy(){
        System.out.println("Email's DESTROY  method");
    }
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        System.out.println("to field set");
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        System.out.println("from field set");
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("message field set");
        this.message = message;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        System.out.println("signature field set");
        this.signature = signature;
    }
}
