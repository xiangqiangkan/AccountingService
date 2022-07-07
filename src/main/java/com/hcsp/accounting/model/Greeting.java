package com.hcsp.accounting.model;

public class Greeting {
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private final long id;
    private String name;

    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
