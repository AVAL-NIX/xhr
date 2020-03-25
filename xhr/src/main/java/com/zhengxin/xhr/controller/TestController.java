package com.zhengxin.xhr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: // TODO
 * <br>
 * @date: 2020/3/24 14:08
 * @author: zhengxin
 * @version: mall V1.0
 * @since: JDK 1.8
 */
@RestController
public class TestController {


    @RequestMapping("/test")
    public String test(String a){


        return "ok" +  a;
    }
}
