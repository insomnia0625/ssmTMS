package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.entity.TransportVehicle;
import com.github.pagehelper.Page;

import java.util.List;

public interface TransportVehicleService {

    /**
     * 根据主键vid查询车辆
     * @param vId
     * @return
     */
    public TransportVehicle queryVehicleById(Integer vId);

    /**
     * 根据Example查询满足条件的车辆-分页数据
     * @param inVehicle
     * @return
     */
    public Page queryVehicleByExample(Pagination pagination, TransportVehicle inVehicle);

    /**
     * 查询出所有的车辆对象
     * @return
     */
    public List queryVehicleList();

    /**
     * /**
     * 查询车辆列表-分页数据
     * @param pagination
     * @return
     */
    public Page queryPageList(Pagination pagination);

    /**
     * 插入新的车辆
     * @param inVehicle
     * @return
     */
    public int insertVehicle(TransportVehicle inVehicle);

    /**
     * 更新车辆信息
     * @param inVehicle
     * @return
     */
    public int updateVehicle(TransportVehicle inVehicle);

    /**
     * 按主键删除一个车辆
     * @param vId
     * @return
     */
    public int deleteVehicle(Integer vId);
}
