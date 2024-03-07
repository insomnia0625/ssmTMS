package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.entity.Store;
import com.github.pagehelper.Page;

import java.util.List;

public interface StoreService {
    /**
     * 通过输入的Store名查询出单个的store
     * @param inStore
     * @return
     */
    public Store queryStore(Store inStore);

    /**
     * 通过主键storeid查询store
     * @param store_id
     * @return
     */
    public Store queryStoreById(Integer store_id);

    /**
     * 查询出所有的store对象
     * @return
     */
    public List queryStoreList();

    /**
     * /**
     * 查询用户列表-分页数据
     * @param pagination
     * @return
     */
    public Page queryPageList(Pagination pagination);

    /**
     * 插入新的Store
     * @param instore
     * @return
     */
    public int insertStore(Store instore);

    /**
     * 更新门店信息
     * @param instore
     * @return
     */
    public int updateStore(Store instore);

    /**
     * 按主键删除一个门店
     * @return
     */
    public int deleteStore(Integer store_id);
}
