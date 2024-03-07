package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.dao.oracle.TransportPlanMapper;
import com.cqupt.entity.TransportPlanExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportPlanServiceImpl implements TransportPlanService{
    @Autowired
    TransportPlanMapper tpMapper;

    /**
     * 查询所有的运输方案记录
     *
     * @return
     */
    @Override
    public List queryTransportPlanList() {
        return tpMapper.selectByExample(null);
    }

    /**
     * 按照运输方案号查询
     *
     * @param tpPId
     * @return
     */
    @Override
    public List queryTransportPlanById(Integer tpPId) {
        TransportPlanExample example =  new TransportPlanExample();
        example.createCriteria().andTpPIdEqualTo(tpPId);
        return tpMapper.selectByExample(example);
    }

    /**
     * /**
     * 查询运输方案列表-分页数据
     *
     * @param pagination
     * @return
     */
    @Override
    public Page queryPageList(Pagination pagination) {
        Page<Object> page = PageHelper.startPage(pagination.getPage(), pagination.getLimit(), true);
        List list = tpMapper.selectByExample(null);
        return page;
    }
}
