package com.chatRobot.model;

public class Deduct {
    private String id;

    private String mchntcd;

    private String mchntpass;

    private String bankno;

    private String bankname;

    private String cusnm;

    private String mobileno;

    private String credtno;

    private String acntno;

    private String acntnm;

    private String acntpro;

    private String acntcity;

    private String loanamount;

    private String ordernum;

    private String serialnum;

    private String platform;

    private String deductres;

    private String deducttime;

    private String state;

    private String remark;

    public Deduct(String id, String mchntcd, String mchntpass, String bankno, String bankname, String cusnm, String mobileno, String credtno, String acntno, String acntnm, String acntpro, String acntcity, String loanamount, String ordernum, String serialnum, String platform, String deductres, String deducttime, String state, String remark) {
        this.id = id;
        this.mchntcd = mchntcd;
        this.mchntpass = mchntpass;
        this.bankno = bankno;
        this.bankname = bankname;
        this.cusnm = cusnm;
        this.mobileno = mobileno;
        this.credtno = credtno;
        this.acntno = acntno;
        this.acntnm = acntnm;
        this.acntpro = acntpro;
        this.acntcity = acntcity;
        this.loanamount = loanamount;
        this.ordernum = ordernum;
        this.serialnum = serialnum;
        this.platform = platform;
        this.deductres = deductres;
        this.deducttime = deducttime;
        this.state = state;
        this.remark = remark;
    }

    public String getId() {
        return id;
    }

    public String getMchntcd() {
        return mchntcd;
    }

    public String getMchntpass() {
        return mchntpass;
    }

    public String getBankno() {
        return bankno;
    }

    public String getBankname() {
        return bankname;
    }

    public String getCusnm() {
        return cusnm;
    }

    public String getMobileno() {
        return mobileno;
    }

    public String getCredtno() {
        return credtno;
    }

    public String getAcntno() {
        return acntno;
    }

    public String getAcntnm() {
        return acntnm;
    }

    public String getAcntpro() {
        return acntpro;
    }

    public String getAcntcity() {
        return acntcity;
    }

    public String getLoanamount() {
        return loanamount;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public String getSerialnum() {
        return serialnum;
    }

    public String getPlatform() {
        return platform;
    }

    public String getDeductres() {
        return deductres;
    }

    public String getDeducttime() {
        return deducttime;
    }

    public String getState() {
        return state;
    }

    public String getRemark() {
        return remark;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMchntcd(String mchntcd) {
        this.mchntcd = mchntcd;
    }

    public void setMchntpass(String mchntpass) {
        this.mchntpass = mchntpass;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public void setCusnm(String cusnm) {
        this.cusnm = cusnm;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public void setCredtno(String credtno) {
        this.credtno = credtno;
    }

    public void setAcntno(String acntno) {
        this.acntno = acntno;
    }

    public void setAcntnm(String acntnm) {
        this.acntnm = acntnm;
    }

    public void setAcntpro(String acntpro) {
        this.acntpro = acntpro;
    }

    public void setAcntcity(String acntcity) {
        this.acntcity = acntcity;
    }

    public void setLoanamount(String loanamount) {
        this.loanamount = loanamount;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public void setSerialnum(String serialnum) {
        this.serialnum = serialnum;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setDeductres(String deductres) {
        this.deductres = deductres;
    }

    public void setDeducttime(String deducttime) {
        this.deducttime = deducttime;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}