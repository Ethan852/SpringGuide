package com.SpringGuide.demo.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    long id;
    String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Value(long id, String type){
        this.id = id;
        this.type = type;
    }

}
