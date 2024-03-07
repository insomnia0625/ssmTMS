package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.entity.Supplier;
import com.github.pagehelper.Page;

import java.util.List;

public interface SupplierService {

    /**
     * 根据输入的供应商对象查询
     * @param insupplier
     * @return
     */
    public Supplier querySupplier(Supplier insupplier);

    /**
     * 通过主键查询供应商
     * @param supplierId
     * @return
     */
    public Supplier querySuppierById(Integer supplierId);

    /**
     * 查询出所有的供应商对象
     * @return
     */
    public List querySupplierList();

    /**
     * 查询供应商列表-分页数据
     * @param pagination
     * @return
     */
    public Page queryPageList(Pagination pagination);

    /**
     * 插入新的供应商
     * @param insupplier
     * @return
     */
    public int insertSupplier(Supplier insupplier);

    /**
     * 更新供应商信息
     * @param insupplier
     * @return
     */
    public int updateSupplier(Supplier insupplier);

    /**
     * 按主键删除一个供应商
     * @param supplierId
     * @return
     */
    public int deleteSupplier(Integer supplierId);
}
