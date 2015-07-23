package com.xyz.bq.front.handler;

import com.jfinal.core.JFinal;
import com.jfinal.handler.Handler;
import com.jfinal.render.RenderFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zousy (zousy999@qq.com)
 * @company ShenZhen Montnets Technology CO.,LTD.
 * @date 2015/7/20
 * 由于actionhandler不处理.后缀的请求 这里将调整 使其对某些特定后缀进行拦截处理
 */
public class ExtendsHandler extends Handler{
    private static final RenderFactory renderFactory = RenderFactory.me();
    public ExtendsHandler() {
        super();
    }

    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, boolean[] isHandled) {
        int index = target.lastIndexOf(".jsp");
        if (index != -1){
            renderFactory.getErrorRender(404).setContext(request, response).render();
            return;
        }
        nextHandler.handle(target,request,response,isHandled);
    }
}
