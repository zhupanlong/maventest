package com.chatRobot.model;

public class User_Role {
    private String id;

    private String userid;

    private String roleid;

    public User_Role(String id, String userid, String roleid) {
        this.id = id;
        this.userid = userid;
        this.roleid = roleid;
    }

    public String getId() {
        return id;
    }

    public String getUserid() {
        return userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}