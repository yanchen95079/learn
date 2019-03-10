package com.yc.factory.abstr;

import com.yc.factory.IMobilePhone;

/**
 * @author Yanchen
 * date 2019/3/10 13:33
 */
public abstract class AbstrMobilePhoneFactory {

    public abstract IMobilePhone createHuaWeiPhone();

    public abstract IMobilePhone createIPhone();

}
