package com.loco.cloud.service;

import com.loco.cloud.entities.Pay;

import java.util.List;

/**
 *  
 *  @create 2024-1-21 17:28
 */
public interface PayService
{
    public int add(Pay pay);
    public int delete(Integer id);
    public int update(Pay pay);

    public Pay getById(Integer id);

    public List<Pay> getAll();

}
