package com.cqupt.service;

import com.cqupt.dao.oracle.HAdministratorMapper;
import com.cqupt.entity.HAdministrator;
import com.cqupt.entity.HAdministratorExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HAdministratorServiceImpl implements HAdministratorService{
    @Autowired
    private HAdministratorMapper hAdministratorMapper;
    /**
     * 根据输入的对象用户名，传回数据库里的admin对象
     *
     * @param inAdmin
     * @return
     */
    @Override
    public HAdministrator queryAdmin(HAdministrator inAdmin) {
        HAdministrator outAdmin = null;
        HAdministratorExample example = new HAdministratorExample();

        if(inAdmin != null && inAdmin.gethAdminName() != null){
            example.createCriteria().andHAdminNameEqualTo(inAdmin.gethAdminName());
        }
        List<HAdministrator> list = hAdministratorMapper.selectByExample(example);
        if(list.size() > 0){
            outAdmin = list.get(0);
        }
        return outAdmin;
    }

    /**
     * 根据主键adminID查询
     *
     * @param adminID
     * @return
     */
    @Override
    public HAdministrator queryAdminById(Integer adminID) {
        return hAdministratorMapper.selectByPrimaryKey(adminID);
    }

    /**
     * 返回数据库中的所有admin信息
     *
     * @return
     */
    @Override
    public List queryAdminList() {
        return hAdministratorMapper.selectByExample(null);
    }

    /**
     * 插入新的admin到数据库中
     *
     * @param inAdmin
     * @return
     */
    @Override
    public int insertAdmin(HAdministrator inAdmin) {
        return hAdministratorMapper.insertSelective(inAdmin);
    }

    /**
     * 更新已有的admin信息
     *
     * @param inAdmin
     * @return
     */
    @Override
    public int updateAdmin(HAdministrator inAdmin) {
        return hAdministratorMapper.updateByPrimaryKeySelective(inAdmin);
    }

    /**
     * 根据主键删除admin
     *
     * @param adminID
     * @return
     */
    @Override
    public int deleteAdmin(Integer adminID) {
        return deleteAdmin(adminID);
    }
}
