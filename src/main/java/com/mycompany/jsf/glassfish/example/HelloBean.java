package com.mycompany.jsf.glassfish.example;

import javax.inject.Named;
import javax.enterprise.context.Dependent;


@Named(value = "helloBean")
@Dependent
public class HelloBean {

    String message = "Hello World!";
    
    public HelloBean() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
