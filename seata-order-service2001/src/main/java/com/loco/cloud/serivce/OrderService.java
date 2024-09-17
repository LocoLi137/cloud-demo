package com.loco.cloud.serivce;

import com.loco.cloud.entities.Order;

/**
 *  
 * @create 2024-01-06 15:39
 */
public interface OrderService
{
    /**
     * 创建订单
     */
    void create(Order order);
}
