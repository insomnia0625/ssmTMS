package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.dao.oracle.StoreMapper;
import com.cqupt.entity.Store;
import com.cqupt.entity.StoreExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService{
    @Autowired
    private StoreMapper storeMapper;
    /**
     * 通过输入的Store名查询出单个的store
     *
     * @param inStore
     * @return
     */
    @Override
    public Store queryStore(Store inStore) {
        Store outStore = null;

        StoreExample example = new StoreExample();
        if(inStore != null && inStore.getStoreName() != null){
            example.createCriteria().andStoreNameEqualTo(inStore.getStoreName());
        }
        List<Store> list = storeMapper.selectByExample(example);
        if(list.size() > 0){
            outStore = list.get(0);
        }
        return outStore;
    }

    /**
     * 通过主键storeid查询store
     *
     * @param store_id
     * @return
     */
    @Override
    public Store queryStoreById(Integer store_id) {
        return storeMapper.selectByPrimaryKey(store_id);
    }

    /**
     * 查询出所有的store对象
     *
     * @return
     */
    @Override
    public List queryStoreList() {
        return storeMapper.selectByExample(null);
    }

    /**
     * /**
     * 查询用户列表-分页数据
     *
     * @param pagination
     * @return
     */
    @Override
    public Page queryPageList(Pagination pagination) {
        Page<Object> page = PageHelper.startPage(pagination.getPage(), pagination.getLimit(), true);
        List list = storeMapper.selectByExample(null);
        return page;
    }

    /**
     * 插入新的Store
     *
     * @param instore
     * @return
     */
    @Override
    public int insertStore(Store instore) {
        return storeMapper.insertSelective(instore);
    }

    /**
     * 更新门店信息
     *
     * @param instore
     * @return
     */
    @Override
    public int updateStore(Store instore) {
        return storeMapper.updateByPrimaryKeySelective(instore);
    }

    /**
     * 按主键删除一个门店
     *
     * @param store_id
     * @return
     */
    @Override
    public int deleteStore(Integer store_id) {
        return storeMapper.deleteByPrimaryKey(store_id);
    }
}
