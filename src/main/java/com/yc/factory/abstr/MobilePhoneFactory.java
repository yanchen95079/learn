package com.yc.factory.abstr;

import com.yc.factory.HuaWeiPhone;
import com.yc.factory.IMobilePhone;
import com.yc.factory.IPhone;

/**
 * @author Yanchen
 * date 2019/3/10 13:33
 */
public class MobilePhoneFactory extends AbstrMobilePhoneFactory {
    @Override
    public IMobilePhone createHuaWeiPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public IMobilePhone createIPhone() {
        return new IPhone();
    }
}
