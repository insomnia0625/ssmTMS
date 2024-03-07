package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.dao.oracle.StoreGoodsMapper;
import com.cqupt.entity.StoreGoods;
import com.cqupt.entity.StoreGoodsExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreGoodsServiceImpl implements StoreGoodsService{
    @Autowired
    private StoreGoodsMapper sgMapper;
    /**
     * 通过输入的货物对象查询出单类货物
     *
     * @param inGoods
     * @return
     */
    @Override
    public StoreGoods queryGoods(StoreGoods inGoods) {
         StoreGoods outGoods = null;

        StoreGoodsExample example = new StoreGoodsExample();
        if(inGoods != null && inGoods.getgName() != null){
            example.createCriteria().andGNameEqualTo(inGoods.getgName());
        }
        List<StoreGoods> list = sgMapper.selectByExample(example);
        if(list.size() > 0){
            outGoods = list.get(0);
        }
         return outGoods;
    }

    /**
     * 通过主键查询一类货物
     *
     * @param gId
     * @return
     */
    @Override
    public StoreGoods queryGoodsById(Integer gId) {
        return sgMapper.selectByPrimaryKey(gId);
    }

    /**
     * 查询门店货物分页数据
     *
     * @param pagination
     * @return
     */
    @Override
    public Page queryPageList(Pagination pagination, StoreGoods sg) {
        Page<Object> page = PageHelper.startPage(pagination.getPage(), pagination.getLimit(), true);
        StoreGoodsExample example = new StoreGoodsExample();
        example.createCriteria().andStoreIdEqualTo(sg.getStoreId());
        List list = sgMapper.selectByExample(example);
        return page;
    }

    /**
     * 查询一个货物列表
     *
     * @param inGoods
     * @return
     */
    @Override
    public List queryGoodsList(StoreGoods inGoods) {
        StoreGoodsExample example = new StoreGoodsExample();
        example.createCriteria().andStoreIdEqualTo(inGoods.getStoreId());
        return sgMapper.selectByExample(example);
    }

    /**
     * 新增一类新的货物
     *
     * @param inGoods
     * @return
     */
    @Override
    public int insertGoods(StoreGoods inGoods) {
        return sgMapper.insertSelective(inGoods);
    }

    /**
     * 更新一类货物的信息
     *
     * @param inGoods
     * @return
     */
    @Override
    public int updateGoods(StoreGoods inGoods) {
        return sgMapper.updateByPrimaryKeySelective(inGoods);
    }

    /**
     * 删除掉一类货物
     *
     * @param inGoods
     * @return
     */
    @Override
    public int deleteGoods(StoreGoods inGoods) {
        StoreGoodsExample example = new StoreGoodsExample();
        example.createCriteria().andStoreIdEqualTo(inGoods.getStoreId());
        return sgMapper.deleteByExample(example );
    }
}
