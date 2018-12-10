package com.chatRobot.model;

public class Customer {
    private String cid;

    private String customerCode;

    private String customerName;

    private String idCard;

    private String mobile;

    private String email;

    private String address;

    public Customer(String cid, String customerCode, String customerName, String idCard, String mobile, String email, String address) {
        this.cid = cid;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.idCard = idCard;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public String getCid() {
        return cid;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}