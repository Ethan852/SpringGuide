package com.SpringGuide.demo.dao;

public class Greeting {
    long id;
    String content;

    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public long getId(){
        return this.id;
    }

}
