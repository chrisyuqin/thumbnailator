package com.study.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.LocalDateTimeUtil;
import com.study.task.AsyncTask;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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

    /**
     * 这里使用构造函数注入，spring官方文档推荐的
     * 也可以用注解的形式注入
     */
    private AsyncTask asyncTask;
    public TestController(AsyncTask asyncTask) {
        this.asyncTask = asyncTask;
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(String aa){
        System.out.println(DateUtil.format(new Date(),"yyyy-MM-dd HH:mm:ss.sss")+Thread.currentThread().getName());
        System.out.println(aa);
        String task = aa+"-";
        try {
             task = asyncTask.task(aa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            asyncTask.taskAsync1(task);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return DateUtil.format(new Date(),"yyyy-MM-dd HH:mm:ss.sss")+"|-:"+task;
    }



}
