package com.lyzj.student.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kencery on 2016/7/15.
 */
@Controller
@RequestMapping(value = "/")
@Api(tags = "Home_Api",hidden = true)
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "首页面",hidden = true)
    public String Index() {
        return "redirect:apidoc.html";
    }
}
