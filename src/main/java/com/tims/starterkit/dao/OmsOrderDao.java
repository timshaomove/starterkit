package com.tims.starterkit.dao;

import com.tims.starterkit.dto.OmsOrderQueryParam;
import com.tims.starterkit.mbg.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单查询自定义Dao
 * Created by macro on 2018/10/12.
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

}
