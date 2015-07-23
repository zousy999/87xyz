package com.xyz.bq.front.controller;

import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.xyz.bq.front.interceptor.DuplicationLoginInterceptor;
import com.xyz.bq.front.interceptor.LoginValidator;

/**
 * @author zousy (zousy999@qq.com)
 * @company ShenZhen Montnets Technology CO.,LTD.
 * @date 2015/7/13
 */
public class LoginController extends Controller{
    @Clear
    @Before(DuplicationLoginInterceptor.class)
    public void index(){
        render("/index.jsp");
    }
    @Clear
    @Before({LoginValidator.class,DuplicationLoginInterceptor.class})
    public void login(){
        setSessionAttr("isLogin", true);
        redirect("/");
    }

    @ActionKey("/error")
    public void error(){
        renderError(505);
    }
}
