package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.dao.oracle.SupplierMapper;
import com.cqupt.entity.Supplier;
import com.cqupt.entity.SupplierExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService{
    @Autowired
    private SupplierMapper supplierMapper;
    /**
     * 根据输入的供应商对象查询
     *
     * @param insupplier
     * @return
     */
    @Override
    public Supplier querySupplier(Supplier insupplier) {
        Supplier outSupplier = null;

        SupplierExample example = new SupplierExample();
        if(insupplier != null && insupplier.getSupplierName() != null){
            example.createCriteria().andSupplierNameEqualTo(insupplier.getSupplierName());
        }
        List<Supplier> list = supplierMapper.selectByExample(example);
        if(list.size() > 0){
            outSupplier = list.get(0);
        }
        return outSupplier;
    }

    /**
     * 通过主键查询供应商
     *
     * @param supplierId
     * @return
     */
    @Override
    public Supplier querySuppierById(Integer supplierId) {
        return supplierMapper.selectByPrimaryKey(supplierId);
    }

    /**
     * 查询出所有的供应商对象
     *
     * @return
     */
    @Override
    public List querySupplierList() {
        return supplierMapper.selectByExample(null);
    }

    /**
     * 查询供应商列表-分页数据
     *
     * @param pagination
     * @return
     */
    @Override
    public Page queryPageList(Pagination pagination) {
        Page<Object> page = PageHelper.startPage(pagination.getPage(), pagination.getLimit(), true);
        List list = supplierMapper.selectByExample(null);
        return page;
    }

    /**
     * 插入新的供应商
     *
     * @param insupplier
     * @return
     */
    @Override
    public int insertSupplier(Supplier insupplier) {
        return supplierMapper.insertSelective(insupplier);
    }

    /**
     * 更新供应商信息
     *
     * @param insupplier
     * @return
     */
    @Override
    public int updateSupplier(Supplier insupplier) {
        return supplierMapper.updateByPrimaryKeySelective(insupplier);
    }

    /**
     * 按主键删除一个供应商
     *
     * @param supplierId
     * @return
     */
    @Override
    public int deleteSupplier(Integer supplierId) {
        return supplierMapper.deleteByPrimaryKey(supplierId);
    }
}
