package com.lyzj.student;

import com.lyzj.student.util.redis.RedisCacheKeys;
import com.lyzj.student.util.redis.RedisUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 测试Redis
 * Created by kencery on 2016/7/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring.xml", "classpath:/spring-*.xml"})
public class RedisTest {

    @Autowired
    RedisUtil redisUtil;

    @Test
    public  void  setTest() {
        redisUtil.set(RedisCacheKeys.testKey, "test", 1);
        Object o = redisUtil.getValue(RedisCacheKeys.testKey);
        Assert.assertEquals(0, "test");
    }

/*
    @Test
    public void setTest() {
        redisUtil.set(RedisCacheKeys.testKey, "test", 1);
        Object o = redisUtil.getValue(RedisCacheKeys.testKey);
        Assert.assertEquals(o, "test");
        redisUtil.del(RedisCacheKeys.testKey);
    }

    @Test
    public void existsTest() {
        System.out.println(redisUtil.exists("test"));
    }

    @Test
    public void delsTest() {
        redisUtil.set(RedisCacheKeys.testKey, "test", 1);
        redisUtil.set("com.etao.cashier.delstest", "test", 1);

        System.out.println("删除key:" + redisUtil.del(RedisCacheKeys.testKey, "com.etao.cashier.delstest"));
    }

    @Test
    public void saveListTest() {
        List<String> list = new ArrayList<>();
        list.add("mike");
        list.add("张三");

        redisUtil.set(RedisCacheKeys.testKey, list, 1);

        List result = (List) redisUtil.getValue(RedisCacheKeys.testKey);
        System.out.println(result);
        redisUtil.del(RedisCacheKeys.testKey);
    }

    @Test
    public void rightPushAllTest() {
        List<String> list = new ArrayList<>();
        list.add("mike");
        list.add("张三");

        System.out.println(redisUtil.rightPushAll(RedisCacheKeys.testKey, list));

        System.out.println(redisUtil.range(RedisCacheKeys.testKey));

        redisUtil.del(RedisCacheKeys.testKey);
    }

    @Test
    public void hashTest() {
        HashMap hashtable = new HashMap();
        hashtable.put(1, "你好");
        hashtable.put(2, "错误");
        hashtable.put(3, "hello world");
        String key = RedisCacheKeys.testKey + ".hash";
        redisUtil.setHash(key, hashtable);

        System.out.println("哈希键为3的值:" + redisUtil.getHashValue(key, 3));

        redisUtil.del(key);
    }*/
}