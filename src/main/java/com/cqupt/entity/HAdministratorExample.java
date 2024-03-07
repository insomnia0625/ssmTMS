package com.cqupt.entity;

import java.util.ArrayList;
import java.util.List;

public class HAdministratorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    public HAdministratorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
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
     * This method corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
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

        public Criteria andHAdminIdIsNull() {
            addCriterion("h_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andHAdminIdIsNotNull() {
            addCriterion("h_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andHAdminIdEqualTo(Integer value) {
            addCriterion("h_admin_id =", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdNotEqualTo(Integer value) {
            addCriterion("h_admin_id <>", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdGreaterThan(Integer value) {
            addCriterion("h_admin_id >", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_admin_id >=", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdLessThan(Integer value) {
            addCriterion("h_admin_id <", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("h_admin_id <=", value, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdIn(List<Integer> values) {
            addCriterion("h_admin_id in", values, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdNotIn(List<Integer> values) {
            addCriterion("h_admin_id not in", values, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("h_admin_id between", value1, value2, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("h_admin_id not between", value1, value2, "hAdminId");
            return (Criteria) this;
        }

        public Criteria andHAdminNameIsNull() {
            addCriterion("h_admin_name is null");
            return (Criteria) this;
        }

        public Criteria andHAdminNameIsNotNull() {
            addCriterion("h_admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andHAdminNameEqualTo(String value) {
            addCriterion("h_admin_name =", value, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminNameNotEqualTo(String value) {
            addCriterion("h_admin_name <>", value, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminNameGreaterThan(String value) {
            addCriterion("h_admin_name >", value, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("h_admin_name >=", value, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminNameLessThan(String value) {
            addCriterion("h_admin_name <", value, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminNameLessThanOrEqualTo(String value) {
            addCriterion("h_admin_name <=", value, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminNameLike(String value) {
            addCriterion("h_admin_name like", value, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminNameNotLike(String value) {
            addCriterion("h_admin_name not like", value, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminNameIn(List<String> values) {
            addCriterion("h_admin_name in", values, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminNameNotIn(List<String> values) {
            addCriterion("h_admin_name not in", values, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminNameBetween(String value1, String value2) {
            addCriterion("h_admin_name between", value1, value2, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminNameNotBetween(String value1, String value2) {
            addCriterion("h_admin_name not between", value1, value2, "hAdminName");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdIsNull() {
            addCriterion("h_admin_pwd is null");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdIsNotNull() {
            addCriterion("h_admin_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdEqualTo(String value) {
            addCriterion("h_admin_pwd =", value, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdNotEqualTo(String value) {
            addCriterion("h_admin_pwd <>", value, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdGreaterThan(String value) {
            addCriterion("h_admin_pwd >", value, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdGreaterThanOrEqualTo(String value) {
            addCriterion("h_admin_pwd >=", value, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdLessThan(String value) {
            addCriterion("h_admin_pwd <", value, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdLessThanOrEqualTo(String value) {
            addCriterion("h_admin_pwd <=", value, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdLike(String value) {
            addCriterion("h_admin_pwd like", value, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdNotLike(String value) {
            addCriterion("h_admin_pwd not like", value, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdIn(List<String> values) {
            addCriterion("h_admin_pwd in", values, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdNotIn(List<String> values) {
            addCriterion("h_admin_pwd not in", values, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdBetween(String value1, String value2) {
            addCriterion("h_admin_pwd between", value1, value2, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPwdNotBetween(String value1, String value2) {
            addCriterion("h_admin_pwd not between", value1, value2, "hAdminPwd");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneIsNull() {
            addCriterion("h_admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneIsNotNull() {
            addCriterion("h_admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneEqualTo(Integer value) {
            addCriterion("h_admin_phone =", value, "hAdminPhone");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneNotEqualTo(Integer value) {
            addCriterion("h_admin_phone <>", value, "hAdminPhone");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneGreaterThan(Integer value) {
            addCriterion("h_admin_phone >", value, "hAdminPhone");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("h_admin_phone >=", value, "hAdminPhone");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneLessThan(Integer value) {
            addCriterion("h_admin_phone <", value, "hAdminPhone");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("h_admin_phone <=", value, "hAdminPhone");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneIn(List<Integer> values) {
            addCriterion("h_admin_phone in", values, "hAdminPhone");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneNotIn(List<Integer> values) {
            addCriterion("h_admin_phone not in", values, "hAdminPhone");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneBetween(Integer value1, Integer value2) {
            addCriterion("h_admin_phone between", value1, value2, "hAdminPhone");
            return (Criteria) this;
        }

        public Criteria andHAdminPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("h_admin_phone not between", value1, value2, "hAdminPhone");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderIsNull() {
            addCriterion("h_admin_gender is null");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderIsNotNull() {
            addCriterion("h_admin_gender is not null");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderEqualTo(String value) {
            addCriterion("h_admin_gender =", value, "hAdminGender");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderNotEqualTo(String value) {
            addCriterion("h_admin_gender <>", value, "hAdminGender");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderGreaterThan(String value) {
            addCriterion("h_admin_gender >", value, "hAdminGender");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderGreaterThanOrEqualTo(String value) {
            addCriterion("h_admin_gender >=", value, "hAdminGender");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderLessThan(String value) {
            addCriterion("h_admin_gender <", value, "hAdminGender");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderLessThanOrEqualTo(String value) {
            addCriterion("h_admin_gender <=", value, "hAdminGender");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderLike(String value) {
            addCriterion("h_admin_gender like", value, "hAdminGender");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderNotLike(String value) {
            addCriterion("h_admin_gender not like", value, "hAdminGender");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderIn(List<String> values) {
            addCriterion("h_admin_gender in", values, "hAdminGender");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderNotIn(List<String> values) {
            addCriterion("h_admin_gender not in", values, "hAdminGender");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderBetween(String value1, String value2) {
            addCriterion("h_admin_gender between", value1, value2, "hAdminGender");
            return (Criteria) this;
        }

        public Criteria andHAdminGenderNotBetween(String value1, String value2) {
            addCriterion("h_admin_gender not between", value1, value2, "hAdminGender");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_administrator
     *
     * @mbg.generated do_not_delete_during_merge Sun Apr 17 15:27:43 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table h_administrator
     *
     * @mbg.generated Sun Apr 17 15:27:43 CST 2022
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