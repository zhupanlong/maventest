package com.chatRobot.model;

public class BankMoney_Real extends BankMoney{
    private LoanApplication loanApplication;

    public BankMoney_Real() {
    }

    public BankMoney_Real(BankMoney bankMoney){
        this(bankMoney.getId(),bankMoney.getLoanapplication(),bankMoney.getLoancode(),bankMoney.getPeriod(),bankMoney.getAccrual(),bankMoney.getCapital());
    }
    public BankMoney_Real(String id, String loanapplication, String loancode, String period, String accrual, String capital, LoanApplication loanApplication) {
        super(id, loanapplication, loancode, period, accrual, capital);
        this.loanApplication = loanApplication;
    }

    public BankMoney_Real(String id, String loanapplication, String loancode, String period, String accrual, String capital) {
        super(id, loanapplication, loancode, period, accrual, capital);
    }

    public LoanApplication getLoanApplication() {
        return loanApplication;
    }

    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }
}
