package com.cqupt.entity;

public class Supplier {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_id
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    private Integer supplierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_name
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    private String supplierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_address
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    private String supplierAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.supplier_phone
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    private Integer supplierPhone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_id
     *
     * @return the value of supplier.supplier_id
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_id
     *
     * @param supplierId the value for supplier.supplier_id
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_name
     *
     * @return the value of supplier.supplier_name
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_name
     *
     * @param supplierName the value for supplier.supplier_name
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_address
     *
     * @return the value of supplier.supplier_address
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    public String getSupplierAddress() {
        return supplierAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_address
     *
     * @param supplierAddress the value for supplier.supplier_address
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.supplier_phone
     *
     * @return the value of supplier.supplier_phone
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    public Integer getSupplierPhone() {
        return supplierPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.supplier_phone
     *
     * @param supplierPhone the value for supplier.supplier_phone
     *
     * @mbg.generated Wed Apr 20 14:52:05 CST 2022
     */
    public void setSupplierPhone(Integer supplierPhone) {
        this.supplierPhone = supplierPhone;
    }
}