package com.xyz.bq.front.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;

/**
 * @author zousy (zousy999@qq.com)
 * @company ShenZhen Montnets Technology CO.,LTD.
 * @date 2015/7/20
 */
public class DuplicationLoginInterceptor implements Interceptor{
    @Override
    public void intercept(Invocation inv) {
        Controller c = inv.getController();
        if(c.getSessionAttr("isLogin") != null){
            c.render("/main.jsp");
        }else{
            inv.invoke();
        }
    }
}
