/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsf.glassfish.example;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Kairat Yussupov
 */
@Named(value = "helloBean")
@Dependent
public class HelloBean {

    String message = "Hello World!";
    
    /**
     * Creates a new instance of HelloBean
     */
    public HelloBean() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
