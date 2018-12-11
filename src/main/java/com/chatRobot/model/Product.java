package com.chatRobot.model;

public class Product {
    private String id;

    private String name;

    private String proceeds;

    private String isshelf;

    private String period;

    public Product(String id, String name, String proceeds, String isshelf, String period) {
        this.id = id;
        this.name = name;
        this.proceeds = proceeds;
        this.isshelf = isshelf;
        this.period = period;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProceeds() {
        return proceeds;
    }

    public String getIsshelf() {
        return isshelf;
    }

    public String getPeriod() {
        return period;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProceeds(String proceeds) {
        this.proceeds = proceeds;
    }

    public void setIsshelf(String isshelf) {
        this.isshelf = isshelf;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}