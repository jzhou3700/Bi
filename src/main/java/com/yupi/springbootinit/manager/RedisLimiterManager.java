package com.yupi.springbootinit.manager;


import com.yupi.springbootinit.common.ErrorCode;
import com.yupi.springbootinit.exception.BusinessException;
import org.redisson.api.RRateLimiter;
import org.redisson.api.RateIntervalUnit;
import org.redisson.api.RateType;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* 专门提供RedisLimiter限流基础服务的（提供了通用的能力））
* */
@Service
public class RedisLimiterManager {


    @Resource
    private RedissonClient redissonClient;

    /**
    * @Description: 限流操作
    * @Param: key区分不同的限流器，比如不同的用户id应该分别统计
    * @return:
    * @Author: Mr.Zhou
    * @Date: 2024/9/29
    */
    public void doRateLimit(String key){
        RRateLimiter rateLimiter= redissonClient.getRateLimiter(key);
        rateLimiter.trySetRate(RateType.OVERALL,2,1, RateIntervalUnit.SECONDS);
        // 每当回个操作来了后，请求一个令牌
        boolean flag = rateLimiter.tryAcquire(1);
        if(!flag){
            throw new BusinessException(ErrorCode.TOO_MANY_REQUEST);
        }


    }
}
