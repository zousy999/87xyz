package com.xyz.bq.common.config;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;
import com.xyz.bq.admin.routes.AdminRoutes;
import com.xyz.bq.front.interceptor.LoginInterceptor;
import com.xyz.bq.front.routes.FrontRoutes;

/**
 * @author zousy (zousy999@qq.com)
 * @company ShenZhen Montnets Technology CO.,LTD.
 * @date 2015/7/13
 */
public class DemoConfig extends JFinalConfig{
    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setViewType(ViewType.JSP);
        me.setError404View("/error/404.html");//前面“/”表示绝对路径
    }

    @Override
    public void configRoute(Routes me)
    {
        me.add(new AdminRoutes());
        me.add(new FrontRoutes());
    }

    @Override
    public void configPlugin(Plugins me) {
//        loadPropertyFile("a_little_config.properties");
//        C3p0Plugin c3p0Plugin = new C3p0Plugin(getProperty("jdbcUrl"),getProperty("user"),getProperty("password"));
//        me.add(c3p0Plugin);
//        ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
//        me.add(arp);
//        arp.addMapping("user", User.class);
    }

    @Override
    public void configInterceptor(Interceptors me) {
        me.add(new LoginInterceptor());
    }

    @Override
    public void configHandler(Handlers me) {
//        me.add(new ExtendsHandler());
    }
}
