package com.cqupt.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RepairListExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    public RepairListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdIsNull() {
            addCriterion("h_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andHAdminIdIsNotNull() {
            addCriterion("h_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andHAdminIdEqualTo(String value) {
            addCriterion("h_admin_id =", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdNotEqualTo(String value) {
            addCriterion("h_admin_id <>", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdGreaterThan(String value) {
            addCriterion("h_admin_id >", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("h_admin_id >=", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdLessThan(String value) {
            addCriterion("h_admin_id <", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdLessThanOrEqualTo(String value) {
            addCriterion("h_admin_id <=", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdLike(String value) {
            addCriterion("h_admin_id like", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdNotLike(String value) {
            addCriterion("h_admin_id not like", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdIn(List<String> values) {
            addCriterion("h_admin_id in", values, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdNotIn(List<String> values) {
            addCriterion("h_admin_id not in", values, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdBetween(String value1, String value2) {
            addCriterion("h_admin_id between", value1, value2, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdNotBetween(String value1, String value2) {
            addCriterion("h_admin_id not between", value1, value2, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andRGIdIsNull() {
            addCriterion("r_g_id is null");
            return (Criteria) this;
        }

        public Criteria andRGIdIsNotNull() {
            addCriterion("r_g_id is not null");
            return (Criteria) this;
        }

        public Criteria andRGIdEqualTo(Integer value) {
            addCriterion("r_g_id =", value, "rGId");
            return (Criteria) this;
        }

        public Criteria andRGIdNotEqualTo(Integer value) {
            addCriterion("r_g_id <>", value, "rGId");
            return (Criteria) this;
        }

        public Criteria andRGIdGreaterThan(Integer value) {
            addCriterion("r_g_id >", value, "rGId");
            return (Criteria) this;
        }

        public Criteria andRGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_g_id >=", value, "rGId");
            return (Criteria) this;
        }

        public Criteria andRGIdLessThan(Integer value) {
            addCriterion("r_g_id <", value, "rGId");
            return (Criteria) this;
        }

        public Criteria andRGIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_g_id <=", value, "rGId");
            return (Criteria) this;
        }

        public Criteria andRGIdIn(List<Integer> values) {
            addCriterion("r_g_id in", values, "rGId");
            return (Criteria) this;
        }

        public Criteria andRGIdNotIn(List<Integer> values) {
            addCriterion("r_g_id not in", values, "rGId");
            return (Criteria) this;
        }

        public Criteria andRGIdBetween(Integer value1, Integer value2) {
            addCriterion("r_g_id between", value1, value2, "rGId");
            return (Criteria) this;
        }

        public Criteria andRGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_g_id not between", value1, value2, "rGId");
            return (Criteria) this;
        }

        public Criteria andRGNumberIsNull() {
            addCriterion("r_g_number is null");
            return (Criteria) this;
        }

        public Criteria andRGNumberIsNotNull() {
            addCriterion("r_g_number is not null");
            return (Criteria) this;
        }

        public Criteria andRGNumberEqualTo(Integer value) {
            addCriterion("r_g_number =", value, "rGNumber");
            return (Criteria) this;
        }

        public Criteria andRGNumberNotEqualTo(Integer value) {
            addCriterion("r_g_number <>", value, "rGNumber");
            return (Criteria) this;
        }

        public Criteria andRGNumberGreaterThan(Integer value) {
            addCriterion("r_g_number >", value, "rGNumber");
            return (Criteria) this;
        }

        public Criteria andRGNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_g_number >=", value, "rGNumber");
            return (Criteria) this;
        }

        public Criteria andRGNumberLessThan(Integer value) {
            addCriterion("r_g_number <", value, "rGNumber");
            return (Criteria) this;
        }

        public Criteria andRGNumberLessThanOrEqualTo(Integer value) {
            addCriterion("r_g_number <=", value, "rGNumber");
            return (Criteria) this;
        }

        public Criteria andRGNumberIn(List<Integer> values) {
            addCriterion("r_g_number in", values, "rGNumber");
            return (Criteria) this;
        }

        public Criteria andRGNumberNotIn(List<Integer> values) {
            addCriterion("r_g_number not in", values, "rGNumber");
            return (Criteria) this;
        }

        public Criteria andRGNumberBetween(Integer value1, Integer value2) {
            addCriterion("r_g_number between", value1, value2, "rGNumber");
            return (Criteria) this;
        }

        public Criteria andRGNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("r_g_number not between", value1, value2, "rGNumber");
            return (Criteria) this;
        }

        public Criteria andRGNameIsNull() {
            addCriterion("r_g_name is null");
            return (Criteria) this;
        }

        public Criteria andRGNameIsNotNull() {
            addCriterion("r_g_name is not null");
            return (Criteria) this;
        }

        public Criteria andRGNameEqualTo(String value) {
            addCriterion("r_g_name =", value, "rGName");
            return (Criteria) this;
        }

        public Criteria andRGNameNotEqualTo(String value) {
            addCriterion("r_g_name <>", value, "rGName");
            return (Criteria) this;
        }

        public Criteria andRGNameGreaterThan(String value) {
            addCriterion("r_g_name >", value, "rGName");
            return (Criteria) this;
        }

        public Criteria andRGNameGreaterThanOrEqualTo(String value) {
            addCriterion("r_g_name >=", value, "rGName");
            return (Criteria) this;
        }

        public Criteria andRGNameLessThan(String value) {
            addCriterion("r_g_name <", value, "rGName");
            return (Criteria) this;
        }

        public Criteria andRGNameLessThanOrEqualTo(String value) {
            addCriterion("r_g_name <=", value, "rGName");
            return (Criteria) this;
        }

        public Criteria andRGNameLike(String value) {
            addCriterion("r_g_name like", value, "rGName");
            return (Criteria) this;
        }

        public Criteria andRGNameNotLike(String value) {
            addCriterion("r_g_name not like", value, "rGName");
            return (Criteria) this;
        }

        public Criteria andRGNameIn(List<String> values) {
            addCriterion("r_g_name in", values, "rGName");
            return (Criteria) this;
        }

        public Criteria andRGNameNotIn(List<String> values) {
            addCriterion("r_g_name not in", values, "rGName");
            return (Criteria) this;
        }

        public Criteria andRGNameBetween(String value1, String value2) {
            addCriterion("r_g_name between", value1, value2, "rGName");
            return (Criteria) this;
        }

        public Criteria andRGNameNotBetween(String value1, String value2) {
            addCriterion("r_g_name not between", value1, value2, "rGName");
            return (Criteria) this;
        }

        public Criteria andRDateIsNull() {
            addCriterion("r_date is null");
            return (Criteria) this;
        }

        public Criteria andRDateIsNotNull() {
            addCriterion("r_date is not null");
            return (Criteria) this;
        }

        public Criteria andRDateEqualTo(Date value) {
            addCriterionForJDBCDate("r_date =", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("r_date <>", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateGreaterThan(Date value) {
            addCriterionForJDBCDate("r_date >", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_date >=", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateLessThan(Date value) {
            addCriterionForJDBCDate("r_date <", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_date <=", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateIn(List<Date> values) {
            addCriterionForJDBCDate("r_date in", values, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("r_date not in", values, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("r_date between", value1, value2, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("r_date not between", value1, value2, "rDate");
            return (Criteria) this;
        }

        public Criteria andRStateIsNull() {
            addCriterion("r_state is null");
            return (Criteria) this;
        }

        public Criteria andRStateIsNotNull() {
            addCriterion("r_state is not null");
            return (Criteria) this;
        }

        public Criteria andRStateEqualTo(Boolean value) {
            addCriterion("r_state =", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotEqualTo(Boolean value) {
            addCriterion("r_state <>", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThan(Boolean value) {
            addCriterion("r_state >", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("r_state >=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThan(Boolean value) {
            addCriterion("r_state <", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThanOrEqualTo(Boolean value) {
            addCriterion("r_state <=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateIn(List<Boolean> values) {
            addCriterion("r_state in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotIn(List<Boolean> values) {
            addCriterion("r_state not in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateBetween(Boolean value1, Boolean value2) {
            addCriterion("r_state between", value1, value2, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("r_state not between", value1, value2, "rState");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table repair_list
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 18 16:27:41 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table repair_list
     *
     * @mbg.generated Mon Apr 18 16:27:41 CST 2022
     */
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