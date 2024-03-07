package com.cqupt.entity;

import java.util.ArrayList;
import java.util.List;

public class TransportPlanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    public TransportPlanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
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
     * This method corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
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

        public Criteria andTpIdIsNull() {
            addCriterion("tp_id is null");
            return (Criteria) this;
        }

        public Criteria andTpIdIsNotNull() {
            addCriterion("tp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTpIdEqualTo(Integer value) {
            addCriterion("tp_id =", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotEqualTo(Integer value) {
            addCriterion("tp_id <>", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdGreaterThan(Integer value) {
            addCriterion("tp_id >", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tp_id >=", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLessThan(Integer value) {
            addCriterion("tp_id <", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLessThanOrEqualTo(Integer value) {
            addCriterion("tp_id <=", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdIn(List<Integer> values) {
            addCriterion("tp_id in", values, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotIn(List<Integer> values) {
            addCriterion("tp_id not in", values, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdBetween(Integer value1, Integer value2) {
            addCriterion("tp_id between", value1, value2, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tp_id not between", value1, value2, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpPIdIsNull() {
            addCriterion("tp_p_id is null");
            return (Criteria) this;
        }

        public Criteria andTpPIdIsNotNull() {
            addCriterion("tp_p_id is not null");
            return (Criteria) this;
        }

        public Criteria andTpPIdEqualTo(Integer value) {
            addCriterion("tp_p_id =", value, "tpPId");
            return (Criteria) this;
        }

        public Criteria andTpPIdNotEqualTo(Integer value) {
            addCriterion("tp_p_id <>", value, "tpPId");
            return (Criteria) this;
        }

        public Criteria andTpPIdGreaterThan(Integer value) {
            addCriterion("tp_p_id >", value, "tpPId");
            return (Criteria) this;
        }

        public Criteria andTpPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tp_p_id >=", value, "tpPId");
            return (Criteria) this;
        }

        public Criteria andTpPIdLessThan(Integer value) {
            addCriterion("tp_p_id <", value, "tpPId");
            return (Criteria) this;
        }

        public Criteria andTpPIdLessThanOrEqualTo(Integer value) {
            addCriterion("tp_p_id <=", value, "tpPId");
            return (Criteria) this;
        }

        public Criteria andTpPIdIn(List<Integer> values) {
            addCriterion("tp_p_id in", values, "tpPId");
            return (Criteria) this;
        }

        public Criteria andTpPIdNotIn(List<Integer> values) {
            addCriterion("tp_p_id not in", values, "tpPId");
            return (Criteria) this;
        }

        public Criteria andTpPIdBetween(Integer value1, Integer value2) {
            addCriterion("tp_p_id between", value1, value2, "tpPId");
            return (Criteria) this;
        }

        public Criteria andTpPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tp_p_id not between", value1, value2, "tpPId");
            return (Criteria) this;
        }

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Integer value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Integer value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Integer value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Integer value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Integer value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Integer> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Integer> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Integer value1, Integer value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
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

        public Criteria andTpNumberIsNull() {
            addCriterion("tp_number is null");
            return (Criteria) this;
        }

        public Criteria andTpNumberIsNotNull() {
            addCriterion("tp_number is not null");
            return (Criteria) this;
        }

        public Criteria andTpNumberEqualTo(Integer value) {
            addCriterion("tp_number =", value, "tpNumber");
            return (Criteria) this;
        }

        public Criteria andTpNumberNotEqualTo(Integer value) {
            addCriterion("tp_number <>", value, "tpNumber");
            return (Criteria) this;
        }

        public Criteria andTpNumberGreaterThan(Integer value) {
            addCriterion("tp_number >", value, "tpNumber");
            return (Criteria) this;
        }

        public Criteria andTpNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tp_number >=", value, "tpNumber");
            return (Criteria) this;
        }

        public Criteria andTpNumberLessThan(Integer value) {
            addCriterion("tp_number <", value, "tpNumber");
            return (Criteria) this;
        }

        public Criteria andTpNumberLessThanOrEqualTo(Integer value) {
            addCriterion("tp_number <=", value, "tpNumber");
            return (Criteria) this;
        }

        public Criteria andTpNumberIn(List<Integer> values) {
            addCriterion("tp_number in", values, "tpNumber");
            return (Criteria) this;
        }

        public Criteria andTpNumberNotIn(List<Integer> values) {
            addCriterion("tp_number not in", values, "tpNumber");
            return (Criteria) this;
        }

        public Criteria andTpNumberBetween(Integer value1, Integer value2) {
            addCriterion("tp_number between", value1, value2, "tpNumber");
            return (Criteria) this;
        }

        public Criteria andTpNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("tp_number not between", value1, value2, "tpNumber");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table transport_plan
     *
     * @mbg.generated do_not_delete_during_merge Mon May 02 21:44:16 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table transport_plan
     *
     * @mbg.generated Mon May 02 21:44:16 CST 2022
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