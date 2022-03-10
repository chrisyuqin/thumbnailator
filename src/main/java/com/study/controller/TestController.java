package com.study.controller;

import cn.hutool.core.date.DateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @project: fssc-service-image
 * @ClassName: TestController
 * @author: Qin Wei Chang
 * @creat: 2022/3/10 2:58 下午
 * 描述:1
 */
@Controller
public class TestController {

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(String aa){
        System.out.println(DateUtil.format(new Date(),"yyyy-MM-dd HH:mm:ss.sss")+Thread.currentThread().getName());
        return DateUtil.format(new Date(),"yyyy-MM-dd HH:mm:ss.sss")+"|-:";
    }



}
