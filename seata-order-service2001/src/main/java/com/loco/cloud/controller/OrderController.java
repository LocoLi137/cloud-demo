package com.loco.cloud.controller;

import com.loco.cloud.entities.Order;
import com.loco.cloud.resp.ResultData;
import com.loco.cloud.serivce.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  
 * @create 2024-01-06 15:56
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public ResultData create(Order order)
    {
        orderService.create(order);
        return ResultData.success(order);
    }
}
