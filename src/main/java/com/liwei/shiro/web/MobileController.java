package com.liwei.shiro.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Liwei on 2016/9/19.
 */
@RequestMapping(value = "/phone")
@Controller
public class MobileController {
    private static final Logger logger = LoggerFactory.getLogger(MobileController.class);

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public String login(){
        return "成功";
    }

   
}
