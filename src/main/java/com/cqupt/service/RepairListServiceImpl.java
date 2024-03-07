package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.dao.oracle.RepairListMapper;
import com.cqupt.entity.RepairList;
import com.cqupt.entity.RepairListExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairListServiceImpl implements RepairListService{
    @Autowired
    private RepairListMapper repairListMapper;
    /**
     * 根据主键rId查询补货单
     *
     * @param rId
     * @return
     */
    @Override
    public RepairList queryRepairListById(Integer rId) {
        return repairListMapper.selectByPrimaryKey(rId);
    }

    /**
     * 根据一个example查询出所有的补货单对象
     *
     * @return
     */
    @Override
    public List queryRLList(RepairList inRepairList) {
        RepairListExample example = new RepairListExample();
        example.createCriteria().andStoreIdEqualTo(inRepairList.getStoreId());
        return repairListMapper.selectByExample(example);
    }

    /**
     * 查询所有的补货单
     *
     * @return
     */
    @Override
    public List queryAllRLList() {
        return repairListMapper.selectByExample(null);
    }

    /**
     * /**
     * 查询补货单你列表-分页数据
     *
     * @param pagination
     * @return
     */
    @Override
    public Page queryPageList(Pagination pagination) {
        Page<Object> page = PageHelper.startPage(pagination.getPage(), pagination.getLimit(), true);
        List list = repairListMapper.selectByExample(null);
        return page;
    }

    /**
     * 插入新的补货单
     *
     * @param inRepairList
     * @return
     */
    @Override
    public int insertRepairList(RepairList inRepairList) {
        return repairListMapper.insertSelective(inRepairList);
    }

    /**
     * 修改/更新补货单信息
     *
     * @param inRepairList
     * @return
     */
    @Override
    public int updateRepairList(RepairList inRepairList) {
        return repairListMapper.updateByPrimaryKeySelective(inRepairList);
    }

    /**
     * 按主键删除补货单
     *
     * @param rId
     * @return
     */
    @Override
    public int deleteRepairList(Integer rId) {
        return repairListMapper.deleteByPrimaryKey(rId);
    }
}
