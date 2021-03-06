package com.opensource.redisaux.limiter.annonations;


import com.opensource.redisaux.limiter.core.BaseRateLimiter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@LimiterType(mode = BaseRateLimiter.WINDOW_LIMITER)
public @interface WindowLimiter {
    /**
     * 持续时间，窗口间隔
     * @return
     */
    int during();

    TimeUnit timeUnit() default TimeUnit.SECONDS;

    /**
     * 通过的请求数
     * @return
     */
    long value();

    String fallback() default "";

    boolean passArgs() default false;



}