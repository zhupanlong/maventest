package com.chatRobot.model;

public class Tree {
    private String id;

    private String text;

    private String state;

    private String checked;

    private String iconcls;

    private String pid;

    public Tree(String id, String text, String state, String checked, String iconcls, String pid) {
        this.id = id;
        this.text = text;
        this.state = state;
        this.checked = checked;
        this.iconcls = iconcls;
        this.pid = pid;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getState() {
        return state;
    }

    public String getChecked() {
        return checked;
    }

    public String getIconcls() {
        return iconcls;
    }

    public String getPid() {
        return pid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}