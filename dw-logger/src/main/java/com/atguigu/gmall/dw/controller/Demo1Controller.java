package com.atguigu.gmall.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * Author:chenxiaoyang
 * Date:
 * Version:
 */
@Controller
public class Demo1Controller {
    @ResponseBody
    @RequestMapping(value="testDemo", method = RequestMethod.POST)
    public String testDemo(@RequestParam("logString" )String logString){
        System.out.println(logString);
        return "hello demo";
    }
}

