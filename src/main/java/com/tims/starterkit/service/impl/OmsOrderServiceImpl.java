package com.tims.starterkit.service.impl;

import com.github.pagehelper.PageHelper;
import com.tims.starterkit.dao.OmsOrderDao;
import com.tims.starterkit.dto.*;
import com.tims.starterkit.mbg.mapper.OmsOrderMapper;
import com.tims.starterkit.mbg.model.OmsOrder;
import com.tims.starterkit.mbg.model.OmsOrderExample;
import com.tims.starterkit.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 订单管理Service实现类
 * Created by macro on 2018/10/11.
 */
@Service
public class OmsOrderServiceImpl implements OmsOrderService {
    @Autowired
    private OmsOrderMapper orderMapper;
    @Autowired
    private OmsOrderDao orderDao;

    @Override
    public List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return orderDao.getList(queryParam);
    }

}
