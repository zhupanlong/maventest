package com.chatRobot.model;

public class Consumer_Bank {
    private String id;

    private String cid;

    private String bank;

    private String cardno;

    private String cardname;

    private String province;

    private String city;

    private String county;

    private String active;

    private String bankname;

    private String bankno;

    private String customerCode;

    private String customerName;

    private String idCard;

    private String mobile;

    private String email;

    private String address;

    public Consumer_Bank(String id, String cid, String bank, String cardno, String cardname, String province, String city, String county, String active, String bankname, String bankno, String customerCode, String customerName, String idCard, String mobile, String email, String address) {
        this.id = id;
        this.cid = cid;
        this.bank = bank;
        this.cardno = cardno;
        this.cardname = cardname;
        this.province = province;
        this.city = city;
        this.county = county;
        this.active = active;
        this.bankname = bankname;
        this.bankno = bankno;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.idCard = idCard;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getCid() {
        return cid;
    }

    public String getBank() {
        return bank;
    }

    public String getCardno() {
        return cardno;
    }

    public String getCardname() {
        return cardname;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getActive() {
        return active;
    }

    public String getBankname() {
        return bankname;
    }

    public String getBankno() {
        return bankno;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno;
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