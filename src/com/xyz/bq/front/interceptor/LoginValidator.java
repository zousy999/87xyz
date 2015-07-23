package com.xyz.bq.front.interceptor;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

/**
 * @author zousy (zousy999@qq.com)
 * @company ShenZhen Montnets Technology CO.,LTD.
 * @date 2015/7/20
 */
public class LoginValidator extends Validator{
    @Override
    protected void validate(Controller c) {

        validateRequiredString("_username","tip1","请输入用户名");
        validateRequiredString("_password","tip2","请输入密码");
    }

    @Override
    protected void handleError(Controller c) {
        c.keepPara("_username");
        c.render("/index.jsp");
    }
}
