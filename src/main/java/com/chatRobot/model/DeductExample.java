package com.chatRobot.model;

import java.util.ArrayList;
import java.util.List;

public class DeductExample extends Example{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMchntcdIsNull() {
            addCriterion("MCHNTCD is null");
            return (Criteria) this;
        }

        public Criteria andMchntcdIsNotNull() {
            addCriterion("MCHNTCD is not null");
            return (Criteria) this;
        }

        public Criteria andMchntcdEqualTo(String value) {
            addCriterion("MCHNTCD =", value, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntcdNotEqualTo(String value) {
            addCriterion("MCHNTCD <>", value, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntcdGreaterThan(String value) {
            addCriterion("MCHNTCD >", value, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntcdGreaterThanOrEqualTo(String value) {
            addCriterion("MCHNTCD >=", value, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntcdLessThan(String value) {
            addCriterion("MCHNTCD <", value, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntcdLessThanOrEqualTo(String value) {
            addCriterion("MCHNTCD <=", value, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntcdLike(String value) {
            addCriterion("MCHNTCD like", value, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntcdNotLike(String value) {
            addCriterion("MCHNTCD not like", value, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntcdIn(List<String> values) {
            addCriterion("MCHNTCD in", values, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntcdNotIn(List<String> values) {
            addCriterion("MCHNTCD not in", values, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntcdBetween(String value1, String value2) {
            addCriterion("MCHNTCD between", value1, value2, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntcdNotBetween(String value1, String value2) {
            addCriterion("MCHNTCD not between", value1, value2, "mchntcd");
            return (Criteria) this;
        }

        public Criteria andMchntpassIsNull() {
            addCriterion("MCHNTPASS is null");
            return (Criteria) this;
        }

        public Criteria andMchntpassIsNotNull() {
            addCriterion("MCHNTPASS is not null");
            return (Criteria) this;
        }

        public Criteria andMchntpassEqualTo(String value) {
            addCriterion("MCHNTPASS =", value, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andMchntpassNotEqualTo(String value) {
            addCriterion("MCHNTPASS <>", value, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andMchntpassGreaterThan(String value) {
            addCriterion("MCHNTPASS >", value, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andMchntpassGreaterThanOrEqualTo(String value) {
            addCriterion("MCHNTPASS >=", value, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andMchntpassLessThan(String value) {
            addCriterion("MCHNTPASS <", value, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andMchntpassLessThanOrEqualTo(String value) {
            addCriterion("MCHNTPASS <=", value, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andMchntpassLike(String value) {
            addCriterion("MCHNTPASS like", value, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andMchntpassNotLike(String value) {
            addCriterion("MCHNTPASS not like", value, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andMchntpassIn(List<String> values) {
            addCriterion("MCHNTPASS in", values, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andMchntpassNotIn(List<String> values) {
            addCriterion("MCHNTPASS not in", values, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andMchntpassBetween(String value1, String value2) {
            addCriterion("MCHNTPASS between", value1, value2, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andMchntpassNotBetween(String value1, String value2) {
            addCriterion("MCHNTPASS not between", value1, value2, "mchntpass");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNull() {
            addCriterion("BANKNO is null");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNotNull() {
            addCriterion("BANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andBanknoEqualTo(String value) {
            addCriterion("BANKNO =", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotEqualTo(String value) {
            addCriterion("BANKNO <>", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThan(String value) {
            addCriterion("BANKNO >", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNO >=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThan(String value) {
            addCriterion("BANKNO <", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThanOrEqualTo(String value) {
            addCriterion("BANKNO <=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLike(String value) {
            addCriterion("BANKNO like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotLike(String value) {
            addCriterion("BANKNO not like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoIn(List<String> values) {
            addCriterion("BANKNO in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotIn(List<String> values) {
            addCriterion("BANKNO not in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoBetween(String value1, String value2) {
            addCriterion("BANKNO between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotBetween(String value1, String value2) {
            addCriterion("BANKNO not between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BANKNAME =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BANKNAME <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BANKNAME >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNAME >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BANKNAME <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BANKNAME <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BANKNAME like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BANKNAME not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BANKNAME in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BANKNAME not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BANKNAME between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BANKNAME not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andCusnmIsNull() {
            addCriterion("CUSNM is null");
            return (Criteria) this;
        }

        public Criteria andCusnmIsNotNull() {
            addCriterion("CUSNM is not null");
            return (Criteria) this;
        }

        public Criteria andCusnmEqualTo(String value) {
            addCriterion("CUSNM =", value, "cusnm");
            return (Criteria) this;
        }

        public Criteria andCusnmNotEqualTo(String value) {
            addCriterion("CUSNM <>", value, "cusnm");
            return (Criteria) this;
        }

        public Criteria andCusnmGreaterThan(String value) {
            addCriterion("CUSNM >", value, "cusnm");
            return (Criteria) this;
        }

        public Criteria andCusnmGreaterThanOrEqualTo(String value) {
            addCriterion("CUSNM >=", value, "cusnm");
            return (Criteria) this;
        }

        public Criteria andCusnmLessThan(String value) {
            addCriterion("CUSNM <", value, "cusnm");
            return (Criteria) this;
        }

        public Criteria andCusnmLessThanOrEqualTo(String value) {
            addCriterion("CUSNM <=", value, "cusnm");
            return (Criteria) this;
        }

        public Criteria andCusnmLike(String value) {
            addCriterion("CUSNM like", value, "cusnm");
            return (Criteria) this;
        }

        public Criteria andCusnmNotLike(String value) {
            addCriterion("CUSNM not like", value, "cusnm");
            return (Criteria) this;
        }

        public Criteria andCusnmIn(List<String> values) {
            addCriterion("CUSNM in", values, "cusnm");
            return (Criteria) this;
        }

        public Criteria andCusnmNotIn(List<String> values) {
            addCriterion("CUSNM not in", values, "cusnm");
            return (Criteria) this;
        }

        public Criteria andCusnmBetween(String value1, String value2) {
            addCriterion("CUSNM between", value1, value2, "cusnm");
            return (Criteria) this;
        }

        public Criteria andCusnmNotBetween(String value1, String value2) {
            addCriterion("CUSNM not between", value1, value2, "cusnm");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNull() {
            addCriterion("MOBILENO is null");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNotNull() {
            addCriterion("MOBILENO is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenoEqualTo(String value) {
            addCriterion("MOBILENO =", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotEqualTo(String value) {
            addCriterion("MOBILENO <>", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThan(String value) {
            addCriterion("MOBILENO >", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILENO >=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThan(String value) {
            addCriterion("MOBILENO <", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThanOrEqualTo(String value) {
            addCriterion("MOBILENO <=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLike(String value) {
            addCriterion("MOBILENO like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotLike(String value) {
            addCriterion("MOBILENO not like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoIn(List<String> values) {
            addCriterion("MOBILENO in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotIn(List<String> values) {
            addCriterion("MOBILENO not in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoBetween(String value1, String value2) {
            addCriterion("MOBILENO between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotBetween(String value1, String value2) {
            addCriterion("MOBILENO not between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andCredtnoIsNull() {
            addCriterion("CREDTNO is null");
            return (Criteria) this;
        }

        public Criteria andCredtnoIsNotNull() {
            addCriterion("CREDTNO is not null");
            return (Criteria) this;
        }

        public Criteria andCredtnoEqualTo(String value) {
            addCriterion("CREDTNO =", value, "credtno");
            return (Criteria) this;
        }

        public Criteria andCredtnoNotEqualTo(String value) {
            addCriterion("CREDTNO <>", value, "credtno");
            return (Criteria) this;
        }

        public Criteria andCredtnoGreaterThan(String value) {
            addCriterion("CREDTNO >", value, "credtno");
            return (Criteria) this;
        }

        public Criteria andCredtnoGreaterThanOrEqualTo(String value) {
            addCriterion("CREDTNO >=", value, "credtno");
            return (Criteria) this;
        }

        public Criteria andCredtnoLessThan(String value) {
            addCriterion("CREDTNO <", value, "credtno");
            return (Criteria) this;
        }

        public Criteria andCredtnoLessThanOrEqualTo(String value) {
            addCriterion("CREDTNO <=", value, "credtno");
            return (Criteria) this;
        }

        public Criteria andCredtnoLike(String value) {
            addCriterion("CREDTNO like", value, "credtno");
            return (Criteria) this;
        }

        public Criteria andCredtnoNotLike(String value) {
            addCriterion("CREDTNO not like", value, "credtno");
            return (Criteria) this;
        }

        public Criteria andCredtnoIn(List<String> values) {
            addCriterion("CREDTNO in", values, "credtno");
            return (Criteria) this;
        }

        public Criteria andCredtnoNotIn(List<String> values) {
            addCriterion("CREDTNO not in", values, "credtno");
            return (Criteria) this;
        }

        public Criteria andCredtnoBetween(String value1, String value2) {
            addCriterion("CREDTNO between", value1, value2, "credtno");
            return (Criteria) this;
        }

        public Criteria andCredtnoNotBetween(String value1, String value2) {
            addCriterion("CREDTNO not between", value1, value2, "credtno");
            return (Criteria) this;
        }

        public Criteria andAcntnoIsNull() {
            addCriterion("ACNTNO is null");
            return (Criteria) this;
        }

        public Criteria andAcntnoIsNotNull() {
            addCriterion("ACNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAcntnoEqualTo(String value) {
            addCriterion("ACNTNO =", value, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnoNotEqualTo(String value) {
            addCriterion("ACNTNO <>", value, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnoGreaterThan(String value) {
            addCriterion("ACNTNO >", value, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACNTNO >=", value, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnoLessThan(String value) {
            addCriterion("ACNTNO <", value, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnoLessThanOrEqualTo(String value) {
            addCriterion("ACNTNO <=", value, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnoLike(String value) {
            addCriterion("ACNTNO like", value, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnoNotLike(String value) {
            addCriterion("ACNTNO not like", value, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnoIn(List<String> values) {
            addCriterion("ACNTNO in", values, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnoNotIn(List<String> values) {
            addCriterion("ACNTNO not in", values, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnoBetween(String value1, String value2) {
            addCriterion("ACNTNO between", value1, value2, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnoNotBetween(String value1, String value2) {
            addCriterion("ACNTNO not between", value1, value2, "acntno");
            return (Criteria) this;
        }

        public Criteria andAcntnmIsNull() {
            addCriterion("ACNTNM is null");
            return (Criteria) this;
        }

        public Criteria andAcntnmIsNotNull() {
            addCriterion("ACNTNM is not null");
            return (Criteria) this;
        }

        public Criteria andAcntnmEqualTo(String value) {
            addCriterion("ACNTNM =", value, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntnmNotEqualTo(String value) {
            addCriterion("ACNTNM <>", value, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntnmGreaterThan(String value) {
            addCriterion("ACNTNM >", value, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntnmGreaterThanOrEqualTo(String value) {
            addCriterion("ACNTNM >=", value, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntnmLessThan(String value) {
            addCriterion("ACNTNM <", value, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntnmLessThanOrEqualTo(String value) {
            addCriterion("ACNTNM <=", value, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntnmLike(String value) {
            addCriterion("ACNTNM like", value, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntnmNotLike(String value) {
            addCriterion("ACNTNM not like", value, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntnmIn(List<String> values) {
            addCriterion("ACNTNM in", values, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntnmNotIn(List<String> values) {
            addCriterion("ACNTNM not in", values, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntnmBetween(String value1, String value2) {
            addCriterion("ACNTNM between", value1, value2, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntnmNotBetween(String value1, String value2) {
            addCriterion("ACNTNM not between", value1, value2, "acntnm");
            return (Criteria) this;
        }

        public Criteria andAcntproIsNull() {
            addCriterion("ACNTPRO is null");
            return (Criteria) this;
        }

        public Criteria andAcntproIsNotNull() {
            addCriterion("ACNTPRO is not null");
            return (Criteria) this;
        }

        public Criteria andAcntproEqualTo(String value) {
            addCriterion("ACNTPRO =", value, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntproNotEqualTo(String value) {
            addCriterion("ACNTPRO <>", value, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntproGreaterThan(String value) {
            addCriterion("ACNTPRO >", value, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntproGreaterThanOrEqualTo(String value) {
            addCriterion("ACNTPRO >=", value, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntproLessThan(String value) {
            addCriterion("ACNTPRO <", value, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntproLessThanOrEqualTo(String value) {
            addCriterion("ACNTPRO <=", value, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntproLike(String value) {
            addCriterion("ACNTPRO like", value, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntproNotLike(String value) {
            addCriterion("ACNTPRO not like", value, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntproIn(List<String> values) {
            addCriterion("ACNTPRO in", values, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntproNotIn(List<String> values) {
            addCriterion("ACNTPRO not in", values, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntproBetween(String value1, String value2) {
            addCriterion("ACNTPRO between", value1, value2, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntproNotBetween(String value1, String value2) {
            addCriterion("ACNTPRO not between", value1, value2, "acntpro");
            return (Criteria) this;
        }

        public Criteria andAcntcityIsNull() {
            addCriterion("ACNTCITY is null");
            return (Criteria) this;
        }

        public Criteria andAcntcityIsNotNull() {
            addCriterion("ACNTCITY is not null");
            return (Criteria) this;
        }

        public Criteria andAcntcityEqualTo(String value) {
            addCriterion("ACNTCITY =", value, "acntcity");
            return (Criteria) this;
        }

        public Criteria andAcntcityNotEqualTo(String value) {
            addCriterion("ACNTCITY <>", value, "acntcity");
            return (Criteria) this;
        }

        public Criteria andAcntcityGreaterThan(String value) {
            addCriterion("ACNTCITY >", value, "acntcity");
            return (Criteria) this;
        }

        public Criteria andAcntcityGreaterThanOrEqualTo(String value) {
            addCriterion("ACNTCITY >=", value, "acntcity");
            return (Criteria) this;
        }

        public Criteria andAcntcityLessThan(String value) {
            addCriterion("ACNTCITY <", value, "acntcity");
            return (Criteria) this;
        }

        public Criteria andAcntcityLessThanOrEqualTo(String value) {
            addCriterion("ACNTCITY <=", value, "acntcity");
            return (Criteria) this;
        }

        public Criteria andAcntcityLike(String value) {
            addCriterion("ACNTCITY like", value, "acntcity");
            return (Criteria) this;
        }

        public Criteria andAcntcityNotLike(String value) {
            addCriterion("ACNTCITY not like", value, "acntcity");
            return (Criteria) this;
        }

        public Criteria andAcntcityIn(List<String> values) {
            addCriterion("ACNTCITY in", values, "acntcity");
            return (Criteria) this;
        }

        public Criteria andAcntcityNotIn(List<String> values) {
            addCriterion("ACNTCITY not in", values, "acntcity");
            return (Criteria) this;
        }

        public Criteria andAcntcityBetween(String value1, String value2) {
            addCriterion("ACNTCITY between", value1, value2, "acntcity");
            return (Criteria) this;
        }

        public Criteria andAcntcityNotBetween(String value1, String value2) {
            addCriterion("ACNTCITY not between", value1, value2, "acntcity");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNull() {
            addCriterion("LOANAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNotNull() {
            addCriterion("LOANAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanamountEqualTo(String value) {
            addCriterion("LOANAMOUNT =", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotEqualTo(String value) {
            addCriterion("LOANAMOUNT <>", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThan(String value) {
            addCriterion("LOANAMOUNT >", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThanOrEqualTo(String value) {
            addCriterion("LOANAMOUNT >=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThan(String value) {
            addCriterion("LOANAMOUNT <", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThanOrEqualTo(String value) {
            addCriterion("LOANAMOUNT <=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLike(String value) {
            addCriterion("LOANAMOUNT like", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotLike(String value) {
            addCriterion("LOANAMOUNT not like", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountIn(List<String> values) {
            addCriterion("LOANAMOUNT in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotIn(List<String> values) {
            addCriterion("LOANAMOUNT not in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountBetween(String value1, String value2) {
            addCriterion("LOANAMOUNT between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotBetween(String value1, String value2) {
            addCriterion("LOANAMOUNT not between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("ORDERNUM is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("ORDERNUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(String value) {
            addCriterion("ORDERNUM =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(String value) {
            addCriterion("ORDERNUM <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(String value) {
            addCriterion("ORDERNUM >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERNUM >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(String value) {
            addCriterion("ORDERNUM <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(String value) {
            addCriterion("ORDERNUM <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLike(String value) {
            addCriterion("ORDERNUM like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotLike(String value) {
            addCriterion("ORDERNUM not like", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<String> values) {
            addCriterion("ORDERNUM in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<String> values) {
            addCriterion("ORDERNUM not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(String value1, String value2) {
            addCriterion("ORDERNUM between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(String value1, String value2) {
            addCriterion("ORDERNUM not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andSerialnumIsNull() {
            addCriterion("SERIALNUM is null");
            return (Criteria) this;
        }

        public Criteria andSerialnumIsNotNull() {
            addCriterion("SERIALNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnumEqualTo(String value) {
            addCriterion("SERIALNUM =", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumNotEqualTo(String value) {
            addCriterion("SERIALNUM <>", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumGreaterThan(String value) {
            addCriterion("SERIALNUM >", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumGreaterThanOrEqualTo(String value) {
            addCriterion("SERIALNUM >=", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumLessThan(String value) {
            addCriterion("SERIALNUM <", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumLessThanOrEqualTo(String value) {
            addCriterion("SERIALNUM <=", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumLike(String value) {
            addCriterion("SERIALNUM like", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumNotLike(String value) {
            addCriterion("SERIALNUM not like", value, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumIn(List<String> values) {
            addCriterion("SERIALNUM in", values, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumNotIn(List<String> values) {
            addCriterion("SERIALNUM not in", values, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumBetween(String value1, String value2) {
            addCriterion("SERIALNUM between", value1, value2, "serialnum");
            return (Criteria) this;
        }

        public Criteria andSerialnumNotBetween(String value1, String value2) {
            addCriterion("SERIALNUM not between", value1, value2, "serialnum");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("PLATFORM is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("PLATFORM is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("PLATFORM =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("PLATFORM <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("PLATFORM >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("PLATFORM <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("PLATFORM like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("PLATFORM not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("PLATFORM in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("PLATFORM not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("PLATFORM between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("PLATFORM not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andDeductresIsNull() {
            addCriterion("DEDUCTRES is null");
            return (Criteria) this;
        }

        public Criteria andDeductresIsNotNull() {
            addCriterion("DEDUCTRES is not null");
            return (Criteria) this;
        }

        public Criteria andDeductresEqualTo(String value) {
            addCriterion("DEDUCTRES =", value, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeductresNotEqualTo(String value) {
            addCriterion("DEDUCTRES <>", value, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeductresGreaterThan(String value) {
            addCriterion("DEDUCTRES >", value, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeductresGreaterThanOrEqualTo(String value) {
            addCriterion("DEDUCTRES >=", value, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeductresLessThan(String value) {
            addCriterion("DEDUCTRES <", value, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeductresLessThanOrEqualTo(String value) {
            addCriterion("DEDUCTRES <=", value, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeductresLike(String value) {
            addCriterion("DEDUCTRES like", value, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeductresNotLike(String value) {
            addCriterion("DEDUCTRES not like", value, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeductresIn(List<String> values) {
            addCriterion("DEDUCTRES in", values, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeductresNotIn(List<String> values) {
            addCriterion("DEDUCTRES not in", values, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeductresBetween(String value1, String value2) {
            addCriterion("DEDUCTRES between", value1, value2, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeductresNotBetween(String value1, String value2) {
            addCriterion("DEDUCTRES not between", value1, value2, "deductres");
            return (Criteria) this;
        }

        public Criteria andDeducttimeIsNull() {
            addCriterion("DEDUCTTIME is null");
            return (Criteria) this;
        }

        public Criteria andDeducttimeIsNotNull() {
            addCriterion("DEDUCTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeducttimeEqualTo(String value) {
            addCriterion("DEDUCTTIME =", value, "deducttime");
            return (Criteria) this;
        }

        public Criteria andDeducttimeNotEqualTo(String value) {
            addCriterion("DEDUCTTIME <>", value, "deducttime");
            return (Criteria) this;
        }

        public Criteria andDeducttimeGreaterThan(String value) {
            addCriterion("DEDUCTTIME >", value, "deducttime");
            return (Criteria) this;
        }

        public Criteria andDeducttimeGreaterThanOrEqualTo(String value) {
            addCriterion("DEDUCTTIME >=", value, "deducttime");
            return (Criteria) this;
        }

        public Criteria andDeducttimeLessThan(String value) {
            addCriterion("DEDUCTTIME <", value, "deducttime");
            return (Criteria) this;
        }

        public Criteria andDeducttimeLessThanOrEqualTo(String value) {
            addCriterion("DEDUCTTIME <=", value, "deducttime");
            return (Criteria) this;
        }

        public Criteria andDeducttimeLike(String value) {
            addCriterion("DEDUCTTIME like", value, "deducttime");
            return (Criteria) this;
        }

        public Criteria andDeducttimeNotLike(String value) {
            addCriterion("DEDUCTTIME not like", value, "deducttime");
            return (Criteria) this;
        }

        public Criteria andDeducttimeIn(List<String> values) {
            addCriterion("DEDUCTTIME in", values, "deducttime");
            return (Criteria) this;
        }

        public Criteria andDeducttimeNotIn(List<String> values) {
            addCriterion("DEDUCTTIME not in", values, "deducttime");
            return (Criteria) this;
        }

        public Criteria andDeducttimeBetween(String value1, String value2) {
            addCriterion("DEDUCTTIME between", value1, value2, "deducttime");
            return (Criteria) this;
        }

        public Criteria andDeducttimeNotBetween(String value1, String value2) {
            addCriterion("DEDUCTTIME not between", value1, value2, "deducttime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}