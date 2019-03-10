package com.yc.factory.func;

import com.yc.factory.HuaWeiPhone;
import com.yc.factory.IMobilePhone;

/**
 * @author Yanchen
 * date 2019/3/10 13:33
 */
public class HuaWeiPhoneFactory implements FuncMobilePhoneFactory {
    @Override
    public IMobilePhone createMobilePhone() {
        return new HuaWeiPhone();
    }
}
