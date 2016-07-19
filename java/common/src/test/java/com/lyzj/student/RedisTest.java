package com.lyzj.student;

import com.lyzj.student.util.redis.RedisCacheKeys;
import com.lyzj.student.util.redis.RedisUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * 测试Redis
 * Created by kencery on 2016/7/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath:/spring.xml", "classpath:/spring-redis.xml"})
public class RedisTest {

    @Autowired
    RedisUtil redisUtil;

    /**
     * 测试存储键值对，不设置过期时间
     */
    @Test
    public void setTest() {
        redisUtil.set(RedisCacheKeys.testKey, "Kencery");
        Object o = redisUtil.getValue(RedisCacheKeys.testKey);
        Assert.assertEquals(o, "Kencery");
        redisUtil.del(RedisCacheKeys.testKey);
    }

    /**
     * 测试存储键值对，设置过期时间
     */
    @Test
    public void setTest1() {
        redisUtil.set(RedisCacheKeys.testKey, "Kencery", 1);
        Object o = redisUtil.getValue(RedisCacheKeys.testKey);
        Assert.assertEquals(o, "Kencery");
    }

    /**
     * 根据键设置过期时间
     */
    @Test
    public void setExpireTest() {
        redisUtil.setExpire("newkey", 1, TimeUnit.MINUTES);
    }

    /**
     * 存入列表,不设置过期时间
     */
    @Test
    public void rightPushAllTest() {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        redisUtil.rightPushAll(RedisCacheKeys.testKey, list);

        List result = redisUtil.range(RedisCacheKeys.testKey);
        System.out.println(result);
        redisUtil.del(RedisCacheKeys.testKey);
    }

    /**
     * 存入列表,设置过期时间
     */
    @Test
    public void rightPushAllTest1() {
        List<String> list = new ArrayList<>();
        list.add("chengyuanping");
        list.add("hanyinglong");
        redisUtil.rightPushAll(RedisCacheKeys.testKey, list, 1);

        List result = (List) redisUtil.range(RedisCacheKeys.testKey);
        System.out.println(result);
    }

    /**
     * 存入哈希，不设置过期时间
     */
    @Test
    public void setHashTest() {
        HashMap hashtable = new HashMap();
        hashtable.put(1, "Hello");
        hashtable.put(2, "World");
        hashtable.put(3, "Redis");
        redisUtil.setHash(RedisCacheKeys.testKey, hashtable);
        System.out.println("哈希键为3的值:" + redisUtil.getHashValue(RedisCacheKeys.testKey, 3));

        redisUtil.del(RedisCacheKeys.testKey);
    }

    /**
     * 存入哈希，设置过期时间
     */
    @Test
    public void setHashTest1() {
        HashMap hashtable = new HashMap();
        hashtable.put(1, "Hello");
        hashtable.put(2, "World");
        hashtable.put(3, "Redis");
        redisUtil.setHash(RedisCacheKeys.testKey, hashtable, 1);
        System.out.println("哈希键为1的值:" + redisUtil.getHashValue(RedisCacheKeys.testKey, 1));
    }

    /**
     * 根据key验证是否存在
     */
    @Test
    public void existsTest() {
        boolean isBool = redisUtil.exists("mykey1");
        System.out.println(isBool);
    }

    /**
     * 根据多个变量删除redis中的内容
     */
    @Test
    public void delTest() {
        Object o = redisUtil.del("mykey1", "t2", "t1");
        System.out.println(o);
    }
}