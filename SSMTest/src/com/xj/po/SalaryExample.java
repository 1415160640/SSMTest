package com.xj.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryExample() {
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

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Double value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Double value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Double value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Double value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Double value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Double value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Double> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Double> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Double value1, Double value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Double value1, Double value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDaymoneyIsNull() {
            addCriterion("daymoney is null");
            return (Criteria) this;
        }

        public Criteria andDaymoneyIsNotNull() {
            addCriterion("daymoney is not null");
            return (Criteria) this;
        }

        public Criteria andDaymoneyEqualTo(Double value) {
            addCriterion("daymoney =", value, "daymoney");
            return (Criteria) this;
        }

        public Criteria andDaymoneyNotEqualTo(Double value) {
            addCriterion("daymoney <>", value, "daymoney");
            return (Criteria) this;
        }

        public Criteria andDaymoneyGreaterThan(Double value) {
            addCriterion("daymoney >", value, "daymoney");
            return (Criteria) this;
        }

        public Criteria andDaymoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("daymoney >=", value, "daymoney");
            return (Criteria) this;
        }

        public Criteria andDaymoneyLessThan(Double value) {
            addCriterion("daymoney <", value, "daymoney");
            return (Criteria) this;
        }

        public Criteria andDaymoneyLessThanOrEqualTo(Double value) {
            addCriterion("daymoney <=", value, "daymoney");
            return (Criteria) this;
        }

        public Criteria andDaymoneyIn(List<Double> values) {
            addCriterion("daymoney in", values, "daymoney");
            return (Criteria) this;
        }

        public Criteria andDaymoneyNotIn(List<Double> values) {
            addCriterion("daymoney not in", values, "daymoney");
            return (Criteria) this;
        }

        public Criteria andDaymoneyBetween(Double value1, Double value2) {
            addCriterion("daymoney between", value1, value2, "daymoney");
            return (Criteria) this;
        }

        public Criteria andDaymoneyNotBetween(Double value1, Double value2) {
            addCriterion("daymoney not between", value1, value2, "daymoney");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("worktime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("worktime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(Double value) {
            addCriterion("worktime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(Double value) {
            addCriterion("worktime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(Double value) {
            addCriterion("worktime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(Double value) {
            addCriterion("worktime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(Double value) {
            addCriterion("worktime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(Double value) {
            addCriterion("worktime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<Double> values) {
            addCriterion("worktime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<Double> values) {
            addCriterion("worktime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(Double value1, Double value2) {
            addCriterion("worktime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(Double value1, Double value2) {
            addCriterion("worktime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyIsNull() {
            addCriterion("worktimemoney is null");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyIsNotNull() {
            addCriterion("worktimemoney is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyEqualTo(Double value) {
            addCriterion("worktimemoney =", value, "worktimemoney");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyNotEqualTo(Double value) {
            addCriterion("worktimemoney <>", value, "worktimemoney");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyGreaterThan(Double value) {
            addCriterion("worktimemoney >", value, "worktimemoney");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("worktimemoney >=", value, "worktimemoney");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyLessThan(Double value) {
            addCriterion("worktimemoney <", value, "worktimemoney");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyLessThanOrEqualTo(Double value) {
            addCriterion("worktimemoney <=", value, "worktimemoney");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyIn(List<Double> values) {
            addCriterion("worktimemoney in", values, "worktimemoney");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyNotIn(List<Double> values) {
            addCriterion("worktimemoney not in", values, "worktimemoney");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyBetween(Double value1, Double value2) {
            addCriterion("worktimemoney between", value1, value2, "worktimemoney");
            return (Criteria) this;
        }

        public Criteria andWorktimemoneyNotBetween(Double value1, Double value2) {
            addCriterion("worktimemoney not between", value1, value2, "worktimemoney");
            return (Criteria) this;
        }

        public Criteria andSpringIsNull() {
            addCriterion("spring is null");
            return (Criteria) this;
        }

        public Criteria andSpringIsNotNull() {
            addCriterion("spring is not null");
            return (Criteria) this;
        }

        public Criteria andSpringEqualTo(Integer value) {
            addCriterion("spring =", value, "spring");
            return (Criteria) this;
        }

        public Criteria andSpringNotEqualTo(Integer value) {
            addCriterion("spring <>", value, "spring");
            return (Criteria) this;
        }

        public Criteria andSpringGreaterThan(Integer value) {
            addCriterion("spring >", value, "spring");
            return (Criteria) this;
        }

        public Criteria andSpringGreaterThanOrEqualTo(Integer value) {
            addCriterion("spring >=", value, "spring");
            return (Criteria) this;
        }

        public Criteria andSpringLessThan(Integer value) {
            addCriterion("spring <", value, "spring");
            return (Criteria) this;
        }

        public Criteria andSpringLessThanOrEqualTo(Integer value) {
            addCriterion("spring <=", value, "spring");
            return (Criteria) this;
        }

        public Criteria andSpringIn(List<Integer> values) {
            addCriterion("spring in", values, "spring");
            return (Criteria) this;
        }

        public Criteria andSpringNotIn(List<Integer> values) {
            addCriterion("spring not in", values, "spring");
            return (Criteria) this;
        }

        public Criteria andSpringBetween(Integer value1, Integer value2) {
            addCriterion("spring between", value1, value2, "spring");
            return (Criteria) this;
        }

        public Criteria andSpringNotBetween(Integer value1, Integer value2) {
            addCriterion("spring not between", value1, value2, "spring");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyIsNull() {
            addCriterion("springmoney is null");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyIsNotNull() {
            addCriterion("springmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyEqualTo(Double value) {
            addCriterion("springmoney =", value, "springmoney");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyNotEqualTo(Double value) {
            addCriterion("springmoney <>", value, "springmoney");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyGreaterThan(Double value) {
            addCriterion("springmoney >", value, "springmoney");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("springmoney >=", value, "springmoney");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyLessThan(Double value) {
            addCriterion("springmoney <", value, "springmoney");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyLessThanOrEqualTo(Double value) {
            addCriterion("springmoney <=", value, "springmoney");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyIn(List<Double> values) {
            addCriterion("springmoney in", values, "springmoney");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyNotIn(List<Double> values) {
            addCriterion("springmoney not in", values, "springmoney");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyBetween(Double value1, Double value2) {
            addCriterion("springmoney between", value1, value2, "springmoney");
            return (Criteria) this;
        }

        public Criteria andSpringmoneyNotBetween(Double value1, Double value2) {
            addCriterion("springmoney not between", value1, value2, "springmoney");
            return (Criteria) this;
        }

        public Criteria andYingfaIsNull() {
            addCriterion("yingfa is null");
            return (Criteria) this;
        }

        public Criteria andYingfaIsNotNull() {
            addCriterion("yingfa is not null");
            return (Criteria) this;
        }

        public Criteria andYingfaEqualTo(Double value) {
            addCriterion("yingfa =", value, "yingfa");
            return (Criteria) this;
        }

        public Criteria andYingfaNotEqualTo(Double value) {
            addCriterion("yingfa <>", value, "yingfa");
            return (Criteria) this;
        }

        public Criteria andYingfaGreaterThan(Double value) {
            addCriterion("yingfa >", value, "yingfa");
            return (Criteria) this;
        }

        public Criteria andYingfaGreaterThanOrEqualTo(Double value) {
            addCriterion("yingfa >=", value, "yingfa");
            return (Criteria) this;
        }

        public Criteria andYingfaLessThan(Double value) {
            addCriterion("yingfa <", value, "yingfa");
            return (Criteria) this;
        }

        public Criteria andYingfaLessThanOrEqualTo(Double value) {
            addCriterion("yingfa <=", value, "yingfa");
            return (Criteria) this;
        }

        public Criteria andYingfaIn(List<Double> values) {
            addCriterion("yingfa in", values, "yingfa");
            return (Criteria) this;
        }

        public Criteria andYingfaNotIn(List<Double> values) {
            addCriterion("yingfa not in", values, "yingfa");
            return (Criteria) this;
        }

        public Criteria andYingfaBetween(Double value1, Double value2) {
            addCriterion("yingfa between", value1, value2, "yingfa");
            return (Criteria) this;
        }

        public Criteria andYingfaNotBetween(Double value1, Double value2) {
            addCriterion("yingfa not between", value1, value2, "yingfa");
            return (Criteria) this;
        }

        public Criteria andShifaIsNull() {
            addCriterion("shifa is null");
            return (Criteria) this;
        }

        public Criteria andShifaIsNotNull() {
            addCriterion("shifa is not null");
            return (Criteria) this;
        }

        public Criteria andShifaEqualTo(Double value) {
            addCriterion("shifa =", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaNotEqualTo(Double value) {
            addCriterion("shifa <>", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaGreaterThan(Double value) {
            addCriterion("shifa >", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaGreaterThanOrEqualTo(Double value) {
            addCriterion("shifa >=", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaLessThan(Double value) {
            addCriterion("shifa <", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaLessThanOrEqualTo(Double value) {
            addCriterion("shifa <=", value, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaIn(List<Double> values) {
            addCriterion("shifa in", values, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaNotIn(List<Double> values) {
            addCriterion("shifa not in", values, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaBetween(Double value1, Double value2) {
            addCriterion("shifa between", value1, value2, "shifa");
            return (Criteria) this;
        }

        public Criteria andShifaNotBetween(Double value1, Double value2) {
            addCriterion("shifa not between", value1, value2, "shifa");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
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