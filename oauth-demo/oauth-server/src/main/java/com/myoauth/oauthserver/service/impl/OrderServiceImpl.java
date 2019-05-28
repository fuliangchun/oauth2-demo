package com.myoauth.oauthserver.service.impl;

import com.myoauth.oauthserver.domain.Order;
import com.myoauth.oauthserver.mapper.OrderMapper;
import com.myoauth.oauthserver.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Order selectOrderByOrderId(Long orderId) {
        return orderMapper.selectOrderByOrderId(orderId);
    }
}
