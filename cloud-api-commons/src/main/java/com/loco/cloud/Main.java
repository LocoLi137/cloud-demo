package com.loco.cloud;

import java.time.ZonedDateTime;

/**
 *  
 *  @create 2024-1-22 23:08
 */
public class Main
{
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
    }
}
