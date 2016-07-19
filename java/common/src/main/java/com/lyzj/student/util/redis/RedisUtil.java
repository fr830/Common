package com.lyzj.student.util.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 封装Redis的通用方法
 * Created by kencery on 2016/7/18.
 */
@Component
public class RedisUtil {

    private static RedisUtil instance;

    /**
     * 定义Redis对象，实例化返回
     */
    public static RedisUtil getInstance() {
        return instance;
    }

    /**
     * 默认构造函数
     */
    public RedisUtil() {
        instance = this;
    }

    /**
     * 注入Redis模板的信息
     */
    @Autowired
    RedisTemplate redisTemplate;

    /**
     * 存储键值对
     *
     * @param key   值
     * @param value 对象
     */
    public void set(String key, Object value) {
        try {
            redisTemplate.opsForValue().set(key, value);
        } catch (Exception e) {
            //写入日志
        }
    }

    /**
     * 存储键值对
     *
     * @param key        值
     * @param value      对象
     * @param expireTime 过期时间(分钟)
     */
    public void set(String key, Object value, long expireTime) {
        try {
            redisTemplate.opsForValue().set(key, value, expireTime, TimeUnit.MINUTES);
        } catch (Exception e) {
            //写入日志
        }
    }

    /**
     * 根据键设置过期时间
     *
     * @param key        键
     * @param expireTime 过期时间
     * @param timeUnit   事件类型(毫秒、分钟、小时等)
     */
    public void setExpire(String key, long expireTime, TimeUnit timeUnit) {
        redisTemplate.expire(key, expireTime, timeUnit);
    }

    /**
     * 存入列表
     *
     * @param key  键
     * @param list 列表
     * @return
     */
    public Long rightPushAll(String key, List<?> list) {
        try {
            return redisTemplate.opsForList().rightPushAll(key, list);
        } catch (Exception e) {
            //写入日志
            return Long.valueOf(0);
        }
    }

    /**
     * 存入列表
     *
     * @param key        键
     * @param list       列表
     * @param expireTime 过期时间
     * @return
     */
    public Long rightPushAll(String key, List<?> list, long expireTime) {
        try {
            Long result = redisTemplate.opsForList().rightPushAll(key, list);
            redisTemplate.expire(key, expireTime, TimeUnit.MINUTES);
            return result;
        } catch (Exception e) {
            //写入日志
            return Long.valueOf(0);
        }
    }

    /**
     * 设置哈希,不设置过期时间
     *
     * @param key     键
     * @param hashMap 哈希值
     */
    public void setHash(String key, HashMap hashMap) {
        setHash(key, hashMap, -1);
    }

    /**
     * 设置哈希,设置过期时间
     *
     * @param key        键
     * @param hashMap    值
     * @param expireTime 过期时间
     */
    public void setHash(String key, HashMap hashMap, long expireTime) {
        try {
            redisTemplate.opsForHash().putAll(key, hashMap);
            if (expireTime > 0) {
                setExpire(key, expireTime, TimeUnit.MINUTES);
            }
        } catch (Exception e) {
            //写入日志
        }
    }

    /**
     * 根据键删除内容
     *
     * @param key 键
     */
    public void del(String key) {
        try {
            redisTemplate.delete(key);
        } catch (Exception e) {
            //写入日志
        }
    }

    /**
     * 根据多个键删除内容
     *
     * @param keys 键
     * @return
     */
    public Object del(final String... keys) {
        try {
            return redisTemplate.execute((RedisCallback) connection -> {
                long result = 0;
                for (int i = 0; i < keys.length; i++) {
                    result = connection.del(keys[i].getBytes());
                }
                return result;
            });
        } catch (Exception e) {
            //写入日志
            return -1;
        }
    }

    /**
     * 根据Key判断键是否存在
     *
     * @param key 键
     * @return
     */
    public boolean exists(final String key) {
        try {
            return (boolean) redisTemplate.execute((RedisCallback) connection -> connection.exists(key.getBytes()));
        } catch (Exception e) {
            //写入日志
            return false;
        }
    }

    /**
     * 判断哈希Key是否存在
     *
     * @param key     键
     * @param hashKey 哈希键
     * @return
     */
    public boolean hashKeyExists(String key, Object hashKey) {
        try {
            return redisTemplate.opsForHash().hasKey(key, hashKey);
        } catch (Exception e) {
            //写入日志
            return false;
        }
    }

    /**
     * 根据key读取Value
     *
     * @param key 键
     * @return
     */
    public Object getValue(String key) {
        try {
            return redisTemplate.opsForValue().get(key);
        } catch (Exception e) {
            //写入日志
            return null;
        }
    }

    /**
     * 根据key查询出来全部的集合信息
     *
     * @param key
     * @return
     */
    public List range(String key) {
        try {
            return redisTemplate.opsForList().range(key, 0, -1);
        } catch (Exception e) {
            //写入日志
            return null;
        }
    }

    /**
     * 获取Hash值
     *
     * @param key     键
     * @param hashKey 哈希键
     * @return
     */
    public Object getHashValue(String key, Object hashKey) {
        try {
            return redisTemplate.opsForHash().get(key, hashKey);
        } catch (Exception e) {
            //写入日志
            return null;
        }
    }
}