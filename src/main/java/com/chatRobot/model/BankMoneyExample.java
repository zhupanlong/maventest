package com.chatRobot.model;

import java.util.ArrayList;
import java.util.List;

public class BankMoneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankMoneyExample() {
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

        public Criteria andLoanapplicationIsNull() {
            addCriterion("LOANAPPLICATION is null");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationIsNotNull() {
            addCriterion("LOANAPPLICATION is not null");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationEqualTo(String value) {
            addCriterion("LOANAPPLICATION =", value, "loanapplication");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationNotEqualTo(String value) {
            addCriterion("LOANAPPLICATION <>", value, "loanapplication");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationGreaterThan(String value) {
            addCriterion("LOANAPPLICATION >", value, "loanapplication");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationGreaterThanOrEqualTo(String value) {
            addCriterion("LOANAPPLICATION >=", value, "loanapplication");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationLessThan(String value) {
            addCriterion("LOANAPPLICATION <", value, "loanapplication");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationLessThanOrEqualTo(String value) {
            addCriterion("LOANAPPLICATION <=", value, "loanapplication");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationLike(String value) {
            addCriterion("LOANAPPLICATION like", value, "loanapplication");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationNotLike(String value) {
            addCriterion("LOANAPPLICATION not like", value, "loanapplication");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationIn(List<String> values) {
            addCriterion("LOANAPPLICATION in", values, "loanapplication");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationNotIn(List<String> values) {
            addCriterion("LOANAPPLICATION not in", values, "loanapplication");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationBetween(String value1, String value2) {
            addCriterion("LOANAPPLICATION between", value1, value2, "loanapplication");
            return (Criteria) this;
        }

        public Criteria andLoanapplicationNotBetween(String value1, String value2) {
            addCriterion("LOANAPPLICATION not between", value1, value2, "loanapplication");
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

        public Criteria andPeriodIsNull() {
            addCriterion("PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(String value) {
            addCriterion("PERIOD =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(String value) {
            addCriterion("PERIOD <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(String value) {
            addCriterion("PERIOD >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(String value) {
            addCriterion("PERIOD <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(String value) {
            addCriterion("PERIOD <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLike(String value) {
            addCriterion("PERIOD like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotLike(String value) {
            addCriterion("PERIOD not like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<String> values) {
            addCriterion("PERIOD in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<String> values) {
            addCriterion("PERIOD not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(String value1, String value2) {
            addCriterion("PERIOD between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(String value1, String value2) {
            addCriterion("PERIOD not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andAccrualIsNull() {
            addCriterion("ACCRUAL is null");
            return (Criteria) this;
        }

        public Criteria andAccrualIsNotNull() {
            addCriterion("ACCRUAL is not null");
            return (Criteria) this;
        }

        public Criteria andAccrualEqualTo(String value) {
            addCriterion("ACCRUAL =", value, "accrual");
            return (Criteria) this;
        }

        public Criteria andAccrualNotEqualTo(String value) {
            addCriterion("ACCRUAL <>", value, "accrual");
            return (Criteria) this;
        }

        public Criteria andAccrualGreaterThan(String value) {
            addCriterion("ACCRUAL >", value, "accrual");
            return (Criteria) this;
        }

        public Criteria andAccrualGreaterThanOrEqualTo(String value) {
            addCriterion("ACCRUAL >=", value, "accrual");
            return (Criteria) this;
        }

        public Criteria andAccrualLessThan(String value) {
            addCriterion("ACCRUAL <", value, "accrual");
            return (Criteria) this;
        }

        public Criteria andAccrualLessThanOrEqualTo(String value) {
            addCriterion("ACCRUAL <=", value, "accrual");
            return (Criteria) this;
        }

        public Criteria andAccrualLike(String value) {
            addCriterion("ACCRUAL like", value, "accrual");
            return (Criteria) this;
        }

        public Criteria andAccrualNotLike(String value) {
            addCriterion("ACCRUAL not like", value, "accrual");
            return (Criteria) this;
        }

        public Criteria andAccrualIn(List<String> values) {
            addCriterion("ACCRUAL in", values, "accrual");
            return (Criteria) this;
        }

        public Criteria andAccrualNotIn(List<String> values) {
            addCriterion("ACCRUAL not in", values, "accrual");
            return (Criteria) this;
        }

        public Criteria andAccrualBetween(String value1, String value2) {
            addCriterion("ACCRUAL between", value1, value2, "accrual");
            return (Criteria) this;
        }

        public Criteria andAccrualNotBetween(String value1, String value2) {
            addCriterion("ACCRUAL not between", value1, value2, "accrual");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(String value) {
            addCriterion("CAPITAL =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(String value) {
            addCriterion("CAPITAL <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(String value) {
            addCriterion("CAPITAL >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("CAPITAL >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(String value) {
            addCriterion("CAPITAL <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(String value) {
            addCriterion("CAPITAL <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLike(String value) {
            addCriterion("CAPITAL like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotLike(String value) {
            addCriterion("CAPITAL not like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<String> values) {
            addCriterion("CAPITAL in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<String> values) {
            addCriterion("CAPITAL not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(String value1, String value2) {
            addCriterion("CAPITAL between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(String value1, String value2) {
            addCriterion("CAPITAL not between", value1, value2, "capital");
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