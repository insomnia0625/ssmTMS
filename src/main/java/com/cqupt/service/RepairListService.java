package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.entity.RepairList;
import com.github.pagehelper.Page;

import java.util.List;

public interface RepairListService {
    /**
     * 根据主键rId查询补货单
     * @param rId
     * @return
     */
    public RepairList queryRepairListById(Integer rId);

    /**
     * 根据一个example查询出所有对应的的补货单对象
     * @return
     */
    public List queryRLList(RepairList inRepairList);

    /**
     * 查询所有的补货单
     * @return
     */
    public List queryAllRLList();

    /**
     * /**
     * 查询补货单你列表-分页数据
     * @param pagination
     * @return
     */
    public Page queryPageList(Pagination pagination);

    /**
     * 插入新的补货单
     * @param inRepairList
     * @return
     */
    public int insertRepairList(RepairList inRepairList);

    /**
     * 修改/更新补货单信息
     * @param inRepairList
     * @return
     */
    public int updateRepairList(RepairList inRepairList);

    /**
     * 按主键删除补货单
     * @param rId
     * @return
     */
    public int deleteRepairList(Integer rId);
}
