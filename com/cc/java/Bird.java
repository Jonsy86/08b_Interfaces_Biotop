package com.cc.java;

public class Bird implements Flyable, IFeathers{

    public String fly(){
        return "I can fly at 20mph!";
        
    }

    public String hasFeathers(){
        return "I am a bird, i have feathers!";
        
    }

}
