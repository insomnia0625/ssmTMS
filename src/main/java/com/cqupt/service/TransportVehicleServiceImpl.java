package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.dao.oracle.TransportVehicleMapper;
import com.cqupt.entity.TransportVehicle;
import com.cqupt.entity.TransportVehicleExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportVehicleServiceImpl implements TransportVehicleService{
    @Autowired
    private TransportVehicleMapper tvMapper;

    /**
     * 根据主键vid查询车辆
     *
     * @param vId
     * @return
     */
    @Override
    public TransportVehicle queryVehicleById(Integer vId) {
        return tvMapper.selectByPrimaryKey(vId);
    }

    /**
     * 根据Example查询满足条件的车辆
     *
     * @param inVehicle
     * @return
     */
    @Override
    public Page queryVehicleByExample(Pagination pagination, TransportVehicle inVehicle) {
        Page<Object> page = PageHelper.startPage(pagination.getPage(), pagination.getLimit(), true);
        TransportVehicleExample example = new TransportVehicleExample();
        example.createCriteria().andVAvailableEqualTo(inVehicle.getvAvailable());
        List list = tvMapper.selectByExample(example);
        return page;
    }

    /**
     * 查询出所有的车辆对象
     *
     * @return
     */
    @Override
    public List queryVehicleList() {
        return tvMapper.selectByExample(null);
    }

    /**
     * /**
     * 查询车辆列表-分页数据
     *
     * @param pagination
     * @return
     */
    @Override
    public Page queryPageList(Pagination pagination) {
        Page<Object> page = PageHelper.startPage(pagination.getPage(), pagination.getLimit(), true);
        List list = tvMapper.selectByExample(null);
        return page;
    }

    /**
     * 插入新的车辆
     *
     * @param inVehicle
     * @return
     */
    @Override
    public int insertVehicle(TransportVehicle inVehicle) {
        return tvMapper.insertSelective(inVehicle);
    }

    /**
     * 更新车辆信息
     *
     * @param inVehicle
     * @return
     */
    @Override
    public int updateVehicle(TransportVehicle inVehicle) {
        return tvMapper.updateByPrimaryKeySelective(inVehicle);
    }

    /**
     * 按主键删除一个车辆
     *
     * @param vId
     * @return
     */
    @Override
    public int deleteVehicle(Integer vId) {
        return tvMapper.deleteByPrimaryKey(vId);
    }
}
