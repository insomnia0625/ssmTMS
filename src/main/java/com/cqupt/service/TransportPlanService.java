package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.dao.oracle.TransportPlanMapper;
import com.github.pagehelper.Page;

import java.util.List;

public interface TransportPlanService {

    /**
     * 查询所有的运输方案记录
     * @return
     */
    public List queryTransportPlanList();

    /**
     * 按照运输方案号查询
     * @param tpPId
     * @return
     */
    public List queryTransportPlanById(Integer tpPId);

    /**
     * /**
     * 查询运输方案列表-分页数据
     *
     * @param pagination
     * @return
     */
    public Page queryPageList(Pagination pagination);
}
