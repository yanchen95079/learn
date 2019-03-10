package com.yc.factory;

import com.yc.factory.enums.OperationSystemEnum;

/**
 * @author Yanchen
 * date 2019/3/10 13:33
 */
public class HuaWeiPhone extends AbstractMobilePhone{

    public HuaWeiPhone(){
        super("华为手机",OperationSystemEnum.ANDROID);
    }

    @Override
    public String toString() {
        return "HuaWeiPhone{" +
                "name='" + name + '\'' +
                ", os=" + os.name() +
                '}';
    }
}
