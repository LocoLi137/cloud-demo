package com.loco.cloud.mapper;

import com.loco.cloud.entities.Account;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

/**
 *  
 * @create 2024-01-06 16:14
 */

public interface AccountMapper extends Mapper<Account>
{

    /**
     * @param userId
     * @param money 本次消费金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") Long money);
}

