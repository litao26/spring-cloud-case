package com.xuetao.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.xuetao.springcloud.entities.CommonResult;


/**
 * @ClassName CustomerBlockHandler
 * @Description TODO
 * @Author EDZ
 * @DaTe 2021/3/9 15:39
 * @Version 1.0
 **/
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
