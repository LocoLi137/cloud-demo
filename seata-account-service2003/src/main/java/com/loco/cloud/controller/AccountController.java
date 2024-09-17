package com.loco.cloud.controller;

import com.loco.cloud.resp.ResultData;
import com.loco.cloud.serivce.AccountService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  
 * @create 2024-01-06 16:16
 */
@RestController
public class AccountController {

    @Resource
    AccountService accountService;
    /**
     * 扣减账户余额
     */
    @RequestMapping("/account/decrease")
    public ResultData decrease(@RequestParam("userId") Long userId, @RequestParam("money") Long money){
        accountService.decrease(userId,money);
        return ResultData.success("扣减账户余额成功！");
    }
}
