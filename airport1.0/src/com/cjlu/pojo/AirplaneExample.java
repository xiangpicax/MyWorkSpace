package com.cjlu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AirplaneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AirplaneExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAirnoIsNull() {
            addCriterion("airno is null");
            return (Criteria) this;
        }

        public Criteria andAirnoIsNotNull() {
            addCriterion("airno is not null");
            return (Criteria) this;
        }

        public Criteria andAirnoEqualTo(String value) {
            addCriterion("airno =", value, "airno");
            return (Criteria) this;
        }

        public Criteria andAirnoNotEqualTo(String value) {
            addCriterion("airno <>", value, "airno");
            return (Criteria) this;
        }

        public Criteria andAirnoGreaterThan(String value) {
            addCriterion("airno >", value, "airno");
            return (Criteria) this;
        }

        public Criteria andAirnoGreaterThanOrEqualTo(String value) {
            addCriterion("airno >=", value, "airno");
            return (Criteria) this;
        }

        public Criteria andAirnoLessThan(String value) {
            addCriterion("airno <", value, "airno");
            return (Criteria) this;
        }

        public Criteria andAirnoLessThanOrEqualTo(String value) {
            addCriterion("airno <=", value, "airno");
            return (Criteria) this;
        }

        public Criteria andAirnoLike(String value) {
            addCriterion("airno like", value, "airno");
            return (Criteria) this;
        }

        public Criteria andAirnoNotLike(String value) {
            addCriterion("airno not like", value, "airno");
            return (Criteria) this;
        }

        public Criteria andAirnoIn(List<String> values) {
            addCriterion("airno in", values, "airno");
            return (Criteria) this;
        }

        public Criteria andAirnoNotIn(List<String> values) {
            addCriterion("airno not in", values, "airno");
            return (Criteria) this;
        }

        public Criteria andAirnoBetween(String value1, String value2) {
            addCriterion("airno between", value1, value2, "airno");
            return (Criteria) this;
        }

        public Criteria andAirnoNotBetween(String value1, String value2) {
            addCriterion("airno not between", value1, value2, "airno");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTakeidIsNull() {
            addCriterion("takeid is null");
            return (Criteria) this;
        }

        public Criteria andTakeidIsNotNull() {
            addCriterion("takeid is not null");
            return (Criteria) this;
        }

        public Criteria andTakeidEqualTo(Integer value) {
            addCriterion("takeid =", value, "takeid");
            return (Criteria) this;
        }

        public Criteria andTakeidNotEqualTo(Integer value) {
            addCriterion("takeid <>", value, "takeid");
            return (Criteria) this;
        }

        public Criteria andTakeidGreaterThan(Integer value) {
            addCriterion("takeid >", value, "takeid");
            return (Criteria) this;
        }

        public Criteria andTakeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("takeid >=", value, "takeid");
            return (Criteria) this;
        }

        public Criteria andTakeidLessThan(Integer value) {
            addCriterion("takeid <", value, "takeid");
            return (Criteria) this;
        }

        public Criteria andTakeidLessThanOrEqualTo(Integer value) {
            addCriterion("takeid <=", value, "takeid");
            return (Criteria) this;
        }

        public Criteria andTakeidIn(List<Integer> values) {
            addCriterion("takeid in", values, "takeid");
            return (Criteria) this;
        }

        public Criteria andTakeidNotIn(List<Integer> values) {
            addCriterion("takeid not in", values, "takeid");
            return (Criteria) this;
        }

        public Criteria andTakeidBetween(Integer value1, Integer value2) {
            addCriterion("takeid between", value1, value2, "takeid");
            return (Criteria) this;
        }

        public Criteria andTakeidNotBetween(Integer value1, Integer value2) {
            addCriterion("takeid not between", value1, value2, "takeid");
            return (Criteria) this;
        }

        public Criteria andSeatIsNull() {
            addCriterion("seat is null");
            return (Criteria) this;
        }

        public Criteria andSeatIsNotNull() {
            addCriterion("seat is not null");
            return (Criteria) this;
        }

        public Criteria andSeatEqualTo(Integer value) {
            addCriterion("seat =", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotEqualTo(Integer value) {
            addCriterion("seat <>", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThan(Integer value) {
            addCriterion("seat >", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat >=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThan(Integer value) {
            addCriterion("seat <", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatLessThanOrEqualTo(Integer value) {
            addCriterion("seat <=", value, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatIn(List<Integer> values) {
            addCriterion("seat in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotIn(List<Integer> values) {
            addCriterion("seat not in", values, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatBetween(Integer value1, Integer value2) {
            addCriterion("seat between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andSeatNotBetween(Integer value1, Integer value2) {
            addCriterion("seat not between", value1, value2, "seat");
            return (Criteria) this;
        }

        public Criteria andFlytimeIsNull() {
            addCriterion("flytime is null");
            return (Criteria) this;
        }

        public Criteria andFlytimeIsNotNull() {
            addCriterion("flytime is not null");
            return (Criteria) this;
        }

        public Criteria andFlytimeEqualTo(Date value) {
            addCriterionForJDBCDate("flytime =", value, "flytime");
            return (Criteria) this;
        }

        public Criteria andFlytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("flytime <>", value, "flytime");
            return (Criteria) this;
        }

        public Criteria andFlytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("flytime >", value, "flytime");
            return (Criteria) this;
        }

        public Criteria andFlytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("flytime >=", value, "flytime");
            return (Criteria) this;
        }

        public Criteria andFlytimeLessThan(Date value) {
            addCriterionForJDBCDate("flytime <", value, "flytime");
            return (Criteria) this;
        }

        public Criteria andFlytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("flytime <=", value, "flytime");
            return (Criteria) this;
        }

        public Criteria andFlytimeIn(List<Date> values) {
            addCriterionForJDBCDate("flytime in", values, "flytime");
            return (Criteria) this;
        }

        public Criteria andFlytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("flytime not in", values, "flytime");
            return (Criteria) this;
        }

        public Criteria andFlytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("flytime between", value1, value2, "flytime");
            return (Criteria) this;
        }

        public Criteria andFlytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("flytime not between", value1, value2, "flytime");
            return (Criteria) this;
        }

        public Criteria andLandidIsNull() {
            addCriterion("landid is null");
            return (Criteria) this;
        }

        public Criteria andLandidIsNotNull() {
            addCriterion("landid is not null");
            return (Criteria) this;
        }

        public Criteria andLandidEqualTo(Integer value) {
            addCriterion("landid =", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidNotEqualTo(Integer value) {
            addCriterion("landid <>", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidGreaterThan(Integer value) {
            addCriterion("landid >", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("landid >=", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidLessThan(Integer value) {
            addCriterion("landid <", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidLessThanOrEqualTo(Integer value) {
            addCriterion("landid <=", value, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidIn(List<Integer> values) {
            addCriterion("landid in", values, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidNotIn(List<Integer> values) {
            addCriterion("landid not in", values, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidBetween(Integer value1, Integer value2) {
            addCriterion("landid between", value1, value2, "landid");
            return (Criteria) this;
        }

        public Criteria andLandidNotBetween(Integer value1, Integer value2) {
            addCriterion("landid not between", value1, value2, "landid");
            return (Criteria) this;
        }

        public Criteria andExistIsNull() {
            addCriterion("exist is null");
            return (Criteria) this;
        }

        public Criteria andExistIsNotNull() {
            addCriterion("exist is not null");
            return (Criteria) this;
        }

        public Criteria andExistEqualTo(Integer value) {
            addCriterion("exist =", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistNotEqualTo(Integer value) {
            addCriterion("exist <>", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistGreaterThan(Integer value) {
            addCriterion("exist >", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistGreaterThanOrEqualTo(Integer value) {
            addCriterion("exist >=", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistLessThan(Integer value) {
            addCriterion("exist <", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistLessThanOrEqualTo(Integer value) {
            addCriterion("exist <=", value, "exist");
            return (Criteria) this;
        }

        public Criteria andExistIn(List<Integer> values) {
            addCriterion("exist in", values, "exist");
            return (Criteria) this;
        }

        public Criteria andExistNotIn(List<Integer> values) {
            addCriterion("exist not in", values, "exist");
            return (Criteria) this;
        }

        public Criteria andExistBetween(Integer value1, Integer value2) {
            addCriterion("exist between", value1, value2, "exist");
            return (Criteria) this;
        }

        public Criteria andExistNotBetween(Integer value1, Integer value2) {
            addCriterion("exist not between", value1, value2, "exist");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
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