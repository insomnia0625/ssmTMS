package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.dao.oracle.SupplierStoreMapper;
import com.cqupt.entity.SupplierStore;
import com.cqupt.entity.SupplierStoreExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierStoreServiceImpl implements SupplierStoreService{
    @Autowired
    SupplierStoreMapper ssMapper;
    /**
     * 查询出supplier_store所有的单位运价信息
     *
     * @return
     */
    @Override
    public List queryPriceList() {
        return ssMapper.selectByExample(null);
    }

    /**
     * /**
     * 查询单位运价列表-分页数据
     *
     * @param pagination
     * @return
     */
    @Override
    public Page queryPageList(Pagination pagination) {
        Page<Object> page = PageHelper.startPage(pagination.getPage(), pagination.getLimit(), true);
        List list = ssMapper.selectByExample(null);
        return page;
    }

    /**
     * 更新单位运价信息
     *
     * @param inss
     * @return
     */
    @Override
    public int updatePrice(SupplierStore inss) {
        return 0;
    }
}
