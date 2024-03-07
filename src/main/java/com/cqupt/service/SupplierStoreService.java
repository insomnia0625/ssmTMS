package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.dao.oracle.SupplierStoreMapper;
import com.cqupt.entity.SupplierStore;
import com.github.pagehelper.Page;

import java.util.List;

public interface SupplierStoreService {
    /**
     * 查询出supplier_store所有的单位运价信息
     * @return
     */
    public List queryPriceList();

    /**
     * /**
     * 查询单位运价列表-分页数据
     *
     * @param pagination
     * @return
     */
    public Page queryPageList(Pagination pagination);

    /**
     * 更新单位运价信息
     * @param inss
     * @return
     */
    public int updatePrice(SupplierStore inss);
}
