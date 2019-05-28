package com.myoauth.oauthserver.controller;

import com.myoauth.oauthserver.domain.Order;
import com.myoauth.oauthserver.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class TestController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{orderId}")
    public Order selectOrderByOrderId(@PathVariable("orderId") Long orderId) {
       return  this.orderService.selectOrderByOrderId(orderId);
    }

}
