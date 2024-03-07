package com.cqupt.service;

import com.cqupt.common.Pagination;
import com.cqupt.entity.StoreGoods;
import com.github.pagehelper.Page;

import java.util.List;

public interface StoreGoodsService {

    /**
     * 通过输入的货物对象查询出单类货物
     * @param inGoods
     * @return
     */
    public StoreGoods queryGoods(StoreGoods inGoods);

    /**
     * 通过主键查询一类货物
     * @param gId
     * @return
     */
    public StoreGoods queryGoodsById(Integer gId);

    /**
     * 查询门店货物分页数据
     * @param pagination
     * @return
     */
    public Page queryPageList(Pagination pagination, StoreGoods sg);

    /**
     * 查询一个货物列表
     * @return
     */
    public List queryGoodsList(StoreGoods inGoods);

    /**
     * 新增一类新的货物
     * @param inGoods
     * @return
     */
    public int insertGoods(StoreGoods inGoods);

    /**
     * 更新一类货物的信息
     * @param inGoods
     * @return
     */
    public int updateGoods(StoreGoods inGoods);

    /**
     * 删除掉一类货物
     * @param inGoods
     * @return
     */
    public int deleteGoods(StoreGoods inGoods);
}
