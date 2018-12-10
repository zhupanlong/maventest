package com.chatRobot.model;

public class User {
    private String id;

    private String username;

    private String password;

    private String name;

    private String sex;

    private String email;

    private String qq;

    private String weixin;

    private String regtime;

    private String enable;

    public User(String id, String username, String password, String name, String sex, String email, String qq, String weixin, String regtime, String enable) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.qq = qq;
        this.weixin = weixin;
        this.regtime = regtime;
        this.enable = enable;
    }

    public User() {

    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getQq() {
        return qq;
    }

    public String getWeixin() {
        return weixin;
    }

    public String getRegtime() {
        return regtime;
    }

    public String getEnable() {
        return enable;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", weixin='" + weixin + '\'' +
                ", regtime='" + regtime + '\'' +
                ", enable='" + enable + '\'' +
                '}';
    }
}