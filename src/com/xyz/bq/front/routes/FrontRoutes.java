package com.xyz.bq.front.routes;

import com.jfinal.config.Routes;
import com.xyz.bq.front.controller.LoginController;

/**
 * @author zousy (zousy999@qq.com)
 * @company ShenZhen Montnets Technology CO.,LTD.
 * @date 2015/7/23
 */
public class FrontRoutes extends Routes{
    @Override
    public void config() {
        add("/", LoginController.class);
    }
}
