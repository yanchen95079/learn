package com.yc.factory;

import com.yc.factory.enums.OperationSystemEnum;

/**
 * @author Yanchen
 * date 2019/3/10 13:33
 */
public class IPhone extends AbstractMobilePhone {

    public IPhone(){
        super("苹果手机-.-",OperationSystemEnum.IOS);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "name='" + name + '\'' +
                ", os=" + os.name() +
                '}';
    }
}
