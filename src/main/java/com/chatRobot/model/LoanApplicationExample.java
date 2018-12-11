package com.chatRobot.model;

import java.util.ArrayList;
import java.util.List;

public class LoanApplicationExample extends Example{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanApplicationExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(String value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(String value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(String value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(String value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(String value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(String value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLike(String value) {
            addCriterion("CID like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotLike(String value) {
            addCriterion("CID not like", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<String> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<String> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(String value1, String value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(String value1, String value2) {
            addCriterion("CID not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("PID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("PID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andCusnameIsNull() {
            addCriterion("CUSNAME is null");
            return (Criteria) this;
        }

        public Criteria andCusnameIsNotNull() {
            addCriterion("CUSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCusnameEqualTo(String value) {
            addCriterion("CUSNAME =", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotEqualTo(String value) {
            addCriterion("CUSNAME <>", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameGreaterThan(String value) {
            addCriterion("CUSNAME >", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSNAME >=", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameLessThan(String value) {
            addCriterion("CUSNAME <", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameLessThanOrEqualTo(String value) {
            addCriterion("CUSNAME <=", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameLike(String value) {
            addCriterion("CUSNAME like", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotLike(String value) {
            addCriterion("CUSNAME not like", value, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameIn(List<String> values) {
            addCriterion("CUSNAME in", values, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotIn(List<String> values) {
            addCriterion("CUSNAME not in", values, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameBetween(String value1, String value2) {
            addCriterion("CUSNAME between", value1, value2, "cusname");
            return (Criteria) this;
        }

        public Criteria andCusnameNotBetween(String value1, String value2) {
            addCriterion("CUSNAME not between", value1, value2, "cusname");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("PRONAME is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("PRONAME is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("PRONAME =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("PRONAME <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("PRONAME >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("PRONAME >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("PRONAME <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("PRONAME <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("PRONAME like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("PRONAME not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("PRONAME in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("PRONAME not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("PRONAME between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("PRONAME not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andLoancodeIsNull() {
            addCriterion("LOANCODE is null");
            return (Criteria) this;
        }

        public Criteria andLoancodeIsNotNull() {
            addCriterion("LOANCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLoancodeEqualTo(String value) {
            addCriterion("LOANCODE =", value, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoancodeNotEqualTo(String value) {
            addCriterion("LOANCODE <>", value, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoancodeGreaterThan(String value) {
            addCriterion("LOANCODE >", value, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoancodeGreaterThanOrEqualTo(String value) {
            addCriterion("LOANCODE >=", value, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoancodeLessThan(String value) {
            addCriterion("LOANCODE <", value, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoancodeLessThanOrEqualTo(String value) {
            addCriterion("LOANCODE <=", value, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoancodeLike(String value) {
            addCriterion("LOANCODE like", value, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoancodeNotLike(String value) {
            addCriterion("LOANCODE not like", value, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoancodeIn(List<String> values) {
            addCriterion("LOANCODE in", values, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoancodeNotIn(List<String> values) {
            addCriterion("LOANCODE not in", values, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoancodeBetween(String value1, String value2) {
            addCriterion("LOANCODE between", value1, value2, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoancodeNotBetween(String value1, String value2) {
            addCriterion("LOANCODE not between", value1, value2, "loancode");
            return (Criteria) this;
        }

        public Criteria andLoandateIsNull() {
            addCriterion("LOANDATE is null");
            return (Criteria) this;
        }

        public Criteria andLoandateIsNotNull() {
            addCriterion("LOANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoandateEqualTo(String value) {
            addCriterion("LOANDATE =", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotEqualTo(String value) {
            addCriterion("LOANDATE <>", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThan(String value) {
            addCriterion("LOANDATE >", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThanOrEqualTo(String value) {
            addCriterion("LOANDATE >=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThan(String value) {
            addCriterion("LOANDATE <", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThanOrEqualTo(String value) {
            addCriterion("LOANDATE <=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLike(String value) {
            addCriterion("LOANDATE like", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotLike(String value) {
            addCriterion("LOANDATE not like", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateIn(List<String> values) {
            addCriterion("LOANDATE in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotIn(List<String> values) {
            addCriterion("LOANDATE not in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateBetween(String value1, String value2) {
            addCriterion("LOANDATE between", value1, value2, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotBetween(String value1, String value2) {
            addCriterion("LOANDATE not between", value1, value2, "loandate");
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

        public Criteria andCoveragedateIsNull() {
            addCriterion("COVERAGEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCoveragedateIsNotNull() {
            addCriterion("COVERAGEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCoveragedateEqualTo(String value) {
            addCriterion("COVERAGEDATE =", value, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andCoveragedateNotEqualTo(String value) {
            addCriterion("COVERAGEDATE <>", value, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andCoveragedateGreaterThan(String value) {
            addCriterion("COVERAGEDATE >", value, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andCoveragedateGreaterThanOrEqualTo(String value) {
            addCriterion("COVERAGEDATE >=", value, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andCoveragedateLessThan(String value) {
            addCriterion("COVERAGEDATE <", value, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andCoveragedateLessThanOrEqualTo(String value) {
            addCriterion("COVERAGEDATE <=", value, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andCoveragedateLike(String value) {
            addCriterion("COVERAGEDATE like", value, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andCoveragedateNotLike(String value) {
            addCriterion("COVERAGEDATE not like", value, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andCoveragedateIn(List<String> values) {
            addCriterion("COVERAGEDATE in", values, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andCoveragedateNotIn(List<String> values) {
            addCriterion("COVERAGEDATE not in", values, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andCoveragedateBetween(String value1, String value2) {
            addCriterion("COVERAGEDATE between", value1, value2, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andCoveragedateNotBetween(String value1, String value2) {
            addCriterion("COVERAGEDATE not between", value1, value2, "coveragedate");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("PRODUCT =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("PRODUCT <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("PRODUCT >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("PRODUCT <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("PRODUCT like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("PRODUCT not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("PRODUCT in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("PRODUCT not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("PRODUCT between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("PRODUCT not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("AUDITOR is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("AUDITOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("AUDITOR =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("AUDITOR <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("AUDITOR >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITOR >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("AUDITOR <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("AUDITOR <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("AUDITOR like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("AUDITOR not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("AUDITOR in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("AUDITOR not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("AUDITOR between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("AUDITOR not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditordateIsNull() {
            addCriterion("AUDITORDATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditordateIsNotNull() {
            addCriterion("AUDITORDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditordateEqualTo(String value) {
            addCriterion("AUDITORDATE =", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateNotEqualTo(String value) {
            addCriterion("AUDITORDATE <>", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateGreaterThan(String value) {
            addCriterion("AUDITORDATE >", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITORDATE >=", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateLessThan(String value) {
            addCriterion("AUDITORDATE <", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateLessThanOrEqualTo(String value) {
            addCriterion("AUDITORDATE <=", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateLike(String value) {
            addCriterion("AUDITORDATE like", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateNotLike(String value) {
            addCriterion("AUDITORDATE not like", value, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateIn(List<String> values) {
            addCriterion("AUDITORDATE in", values, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateNotIn(List<String> values) {
            addCriterion("AUDITORDATE not in", values, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateBetween(String value1, String value2) {
            addCriterion("AUDITORDATE between", value1, value2, "auditordate");
            return (Criteria) this;
        }

        public Criteria andAuditordateNotBetween(String value1, String value2) {
            addCriterion("AUDITORDATE not between", value1, value2, "auditordate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAppointdateIsNull() {
            addCriterion("APPOINTDATE is null");
            return (Criteria) this;
        }

        public Criteria andAppointdateIsNotNull() {
            addCriterion("APPOINTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAppointdateEqualTo(String value) {
            addCriterion("APPOINTDATE =", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateNotEqualTo(String value) {
            addCriterion("APPOINTDATE <>", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateGreaterThan(String value) {
            addCriterion("APPOINTDATE >", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINTDATE >=", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateLessThan(String value) {
            addCriterion("APPOINTDATE <", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateLessThanOrEqualTo(String value) {
            addCriterion("APPOINTDATE <=", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateLike(String value) {
            addCriterion("APPOINTDATE like", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateNotLike(String value) {
            addCriterion("APPOINTDATE not like", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateIn(List<String> values) {
            addCriterion("APPOINTDATE in", values, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateNotIn(List<String> values) {
            addCriterion("APPOINTDATE not in", values, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateBetween(String value1, String value2) {
            addCriterion("APPOINTDATE between", value1, value2, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateNotBetween(String value1, String value2) {
            addCriterion("APPOINTDATE not between", value1, value2, "appointdate");
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