package com.tims.starterkit.service;

import com.tims.starterkit.dto.*;
import com.tims.starterkit.mbg.model.OmsOrder;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 订单管理Service
 * Created by macro on 2018/10/11.
 */
public interface OmsOrderService {
    /**
     * 订单查询
     */
    List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

}
