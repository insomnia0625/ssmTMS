package com.cqupt.dao.oracle;

import com.cqupt.entity.Store;
import com.cqupt.entity.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface StoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Sun Apr 17 19:00:01 CST 2022
     */
    long countByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Sun Apr 17 19:00:01 CST 2022
     */
    int deleteByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Sun Apr 17 19:00:01 CST 2022
     */
    int deleteByPrimaryKey(Integer storeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Sun Apr 17 19:00:01 CST 2022
     */
    int insert(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Sun Apr 17 19:00:01 CST 2022
     */
    int insertSelective(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Sun Apr 17 19:00:01 CST 2022
     */
    List<Store> selectByExample(StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Sun Apr 17 19:00:01 CST 2022
     */
    Store selectByPrimaryKey(Integer storeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Sun Apr 17 19:00:01 CST 2022
     */
    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Sun Apr 17 19:00:01 CST 2022
     */
    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Sun Apr 17 19:00:01 CST 2022
     */
    int updateByPrimaryKeySelective(Store record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbg.generated Sun Apr 17 19:00:01 CST 2022
     */
    int updateByPrimaryKey(Store record);
}