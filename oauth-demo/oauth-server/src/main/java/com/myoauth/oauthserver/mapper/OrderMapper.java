package com.myoauth.oauthserver.mapper;

import com.myoauth.oauthserver.domain.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    Order selectOrderByOrderId(Long orderId);
}
