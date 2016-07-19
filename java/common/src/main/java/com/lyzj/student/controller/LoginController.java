package com.lyzj.student.controller;

import com.lyzj.student.util.redis.RedisCacheKeys;
import com.lyzj.student.util.redis.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kencery on 2016/7/15.
 */
@Controller
@RequestMapping(value = "/login")
@Api(tags = "Login_Api",description = "登录业务逻辑接口调用")
public class LoginController {

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "登录", notes = "返回登录是否成功并且将登录信息缓存")
    public String login() {
        return "OK";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "修改用户信息", notes = "返回修改是否成功")
    public String edit(@RequestParam(value = "", name = "署名", required = true) String signature,
                       @RequestParam(value = "", name = "时间戳", required = false) String timestamp,
                       @RequestBody(required = false) String xmlStr) {
        redisUtil.set(RedisCacheKeys.testKey, "test", 1);
        Object o = redisUtil.getValue(RedisCacheKeys.testKey);
        return o.toString();
    }
}