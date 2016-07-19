package com.lyzj.student.util.redis;

/**
 * 存放Redis的常量(缓存时间、Key)
 * Created by kencery on 2016/7/18.
 */
public final class RedisCacheKeys {

    /**
     * 缓存生效时间
     */
    public static final int expireTime = 30;

    /**
     * 测试键，除了测试其它地方都不能使用
     */
    public static final String testKey = "com.lyzj.student.test";
}
