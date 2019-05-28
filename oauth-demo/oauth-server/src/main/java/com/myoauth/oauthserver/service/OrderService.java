package com.myoauth.oauthserver.service;

import com.myoauth.oauthserver.domain.Order;

public interface OrderService {
    Order selectOrderByOrderId(Long orderId);
}
