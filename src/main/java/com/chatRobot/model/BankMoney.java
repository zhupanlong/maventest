package com.chatRobot.model;

public class BankMoney {
    private String id;

    private String loanapplication;

    private String loancode;

    private String period;

    private String accrual;

    private String capital;

    public BankMoney() {
    }

    public BankMoney(String id, String loanapplication, String loancode, String period, String accrual, String capital) {
        this.id = id;
        this.loanapplication = loanapplication;
        this.loancode = loancode;
        this.period = period;
        this.accrual = accrual;
        this.capital = capital;
    }

    public String getId() {
        return id;
    }

    public String getLoanapplication() {
        return loanapplication;
    }

    public String getLoancode() {
        return loancode;
    }

    public String getPeriod() {
        return period;
    }

    public String getAccrual() {
        return accrual;
    }

    public String getCapital() {
        return capital;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLoanapplication(String loanapplication) {
        this.loanapplication = loanapplication;
    }

    public void setLoancode(String loancode) {
        this.loancode = loancode;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void setAccrual(String accrual) {
        this.accrual = accrual;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}