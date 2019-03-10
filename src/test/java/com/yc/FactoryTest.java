package com.yc;

import com.yc.factory.HuaWeiPhone;
import com.yc.factory.IMobilePhone;
import com.yc.factory.abstr.AbstrMobilePhoneFactory;
import com.yc.factory.abstr.MobilePhoneFactory;
import com.yc.factory.func.FuncMobilePhoneFactory;
import com.yc.factory.func.HuaWeiPhoneFactory;
import com.yc.factory.simple.SimpleMobilePhoneFactory;
import org.junit.Test;

/**
 * @author Yanchen
 * date 2019/3/10 13:33
 */
public class FactoryTest {
    @Test
    public void simpleFactoryTest(){
        IMobilePhone mobilePhone = SimpleMobilePhoneFactory.createMobilePhone(HuaWeiPhone.class);
        System.out.println(mobilePhone);
    }


    @Test
    public void FuncFactoryTest(){
        FuncMobilePhoneFactory factory = new HuaWeiPhoneFactory();
        IMobilePhone mobilePhone = factory.createMobilePhone();
        System.out.println(mobilePhone);

    }

    @Test
    public void AbstractFactoryTest(){
        AbstrMobilePhoneFactory factory = new MobilePhoneFactory();
        IMobilePhone huaWeiPhone = factory.createHuaWeiPhone();
        System.out.println(huaWeiPhone);

    }


}
