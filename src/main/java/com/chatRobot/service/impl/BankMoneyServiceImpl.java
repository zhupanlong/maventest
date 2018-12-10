package com.chatRobot.service.impl;


import com.chatRobot.dao.BankMoneyMapper;
import com.chatRobot.dao.LoanApplicationMapper;
import com.chatRobot.model.BankMoney_Real;
import com.chatRobot.service.IBankMoneyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("bankMoneyService")
public class BankMoneyServiceImpl implements IBankMoneyService {

    @Resource
    private BankMoneyMapper bankMoneyMapper;
    @Resource
    private LoanApplicationMapper loanApplicationMapper;

    public BankMoney_Real selectByPrimaryKey(String id) {
        BankMoney_Real bankMoney_real = new BankMoney_Real(this.bankMoneyMapper.selectByPrimaryKey(id));
        return bankMoney_real;
    }

    public BankMoney_Real selectWithMemberInfoByPrimaryKey(String id) {
        BankMoney_Real bankMoney_real =this.selectByPrimaryKey(id);
        String loanapplication = bankMoney_real.getLoanapplication();
        if (null != loanapplication && !loanapplication.isEmpty()) {
            bankMoney_real.setLoanApplication(this.loanApplicationMapper.selectByPrimaryKey(loanapplication));
        }
        return bankMoney_real;
    }


}
