package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.core.annotation.LogAnno;

/**
 * @author lastwhisper
 * @desc
 * @email gaojun56@163.com
 */
@RestController
public class UserController {
    /**
     * @desc 这里为了方便直接在controller上进行aop日志记录，也可以放在service上。
     * @author lastwhisper
     * @Param 
     * @return
     */
    @LogAnno(operateType = "添加用户sss")
    @RequestMapping(value = "/user/add")
    public void add() {
        System.out.println("向数据库中添加用户!!");
    }
}
