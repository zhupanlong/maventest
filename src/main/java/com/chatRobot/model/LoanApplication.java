package com.chatRobot.model;

public class LoanApplication {
    private String id;

    private String cid;

    private String pid;

    private String cusname;

    private String proname;

    private String loancode;

    private String loandate;

    private String loanamount;

    private String coveragedate;

    private String product;

    private String auditor;

    private String auditordate;

    private String status;

    private String appointdate;

    public LoanApplication(String id, String cid, String pid, String cusname, String proname, String loancode, String loandate, String loanamount, String coveragedate, String product, String auditor, String auditordate, String status, String appointdate) {
        this.id = id;
        this.cid = cid;
        this.pid = pid;
        this.cusname = cusname;
        this.proname = proname;
        this.loancode = loancode;
        this.loandate = loandate;
        this.loanamount = loanamount;
        this.coveragedate = coveragedate;
        this.product = product;
        this.auditor = auditor;
        this.auditordate = auditordate;
        this.status = status;
        this.appointdate = appointdate;
    }

    public String getId() {
        return id;
    }

    public String getCid() {
        return cid;
    }

    public String getPid() {
        return pid;
    }

    public String getCusname() {
        return cusname;
    }

    public String getProname() {
        return proname;
    }

    public String getLoancode() {
        return loancode;
    }

    public String getLoandate() {
        return loandate;
    }

    public String getLoanamount() {
        return loanamount;
    }

    public String getCoveragedate() {
        return coveragedate;
    }

    public String getProduct() {
        return product;
    }

    public String getAuditor() {
        return auditor;
    }

    public String getAuditordate() {
        return auditordate;
    }

    public String getStatus() {
        return status;
    }

    public String getAppointdate() {
        return appointdate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public void setLoancode(String loancode) {
        this.loancode = loancode;
    }

    public void setLoandate(String loandate) {
        this.loandate = loandate;
    }

    public void setLoanamount(String loanamount) {
        this.loanamount = loanamount;
    }

    public void setCoveragedate(String coveragedate) {
        this.coveragedate = coveragedate;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public void setAuditordate(String auditordate) {
        this.auditordate = auditordate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAppointdate(String appointdate) {
        this.appointdate = appointdate;
    }
}