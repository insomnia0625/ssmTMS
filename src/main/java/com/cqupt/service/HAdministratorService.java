package com.cqupt.service;

import com.cqupt.entity.HAdministrator;

import java.util.List;

public interface HAdministratorService {
    /**
     * 根据输入的对象用户名，传回数据库里的admin对象
     * @param inAdmin
     * @return
     */
    public HAdministrator queryAdmin(HAdministrator inAdmin);

    /**
     * 根据主键adminID查询
     * @param adminID
     * @return
     */
    public HAdministrator queryAdminById(Integer adminID);

    /**
     * 返回数据库中的所有admin信息
     * @return
     */
    public List queryAdminList();

    /**
     * 插入新的admin到数据库中
     * @param inAdmin
     * @return
     */
    public int insertAdmin(HAdministrator inAdmin);

    /**
     * 更新已有的admin信息
     * @return
     */
    public int updateAdmin(HAdministrator inAdmin);

    /**
     * 根据主键删除admin
     * @param adminID
     * @return
     */
    public int deleteAdmin(Integer adminID);
}
