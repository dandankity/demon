package com.dchen.controller;

import caculate.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.support.RequestContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by dchen on 7/16/14.
 */
@Controller
@RequestMapping("/hello")
public class CaculateController {
    @Autowired
    private Client caculateBean;

    @RequestMapping(method = RequestMethod.POST)
    String printWelcome(ModelMap model,HttpServletRequest request) {

        String add1 = request.getParameter("add1");
        String add2 = request.getParameter("add2");
      //  ApplicationContext applicationContext= RequestContextUtils.getWebApplicationContext(request);
       // Client caculator = (Client)applicationContext.getBean("caculateBean");

        String result=caculateBean.add(add1,add2);

        model.addAttribute("message", "Spring 3 MVC Hello World"+result);
        return "hello";

    }

}