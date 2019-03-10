package com.yc.factory.func;

import com.yc.factory.IMobilePhone;
import com.yc.factory.IPhone;

/**
 * @author Yanchen
 * date 2019/3/10 13:33
 */
public class IPhoneFactory implements FuncMobilePhoneFactory {
    @Override
    public IMobilePhone createMobilePhone() {
        return new IPhone();
    }
}
