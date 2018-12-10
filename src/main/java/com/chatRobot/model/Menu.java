package com.chatRobot.model;

public class Menu {
    private String id;

    private String name;

    private String parentid;

    private String iconcls;

    private String url;

    private String enable;

    private String levelid;

    public Menu(String id, String name, String parentid, String iconcls, String url, String enable, String levelid) {
        this.id = id;
        this.name = name;
        this.parentid = parentid;
        this.iconcls = iconcls;
        this.url = url;
        this.enable = enable;
        this.levelid = levelid;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getParentid() {
        return parentid;
    }

    public String getIconcls() {
        return iconcls;
    }

    public String getUrl() {
        return url;
    }

    public String getEnable() {
        return enable;
    }

    public String getLevelid() {
        return levelid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public void setLevelid(String levelid) {
        this.levelid = levelid;
    }
}