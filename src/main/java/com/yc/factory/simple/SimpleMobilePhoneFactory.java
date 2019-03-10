package com.yc.factory.simple;

import com.yc.factory.AbstractMobilePhone;
import com.yc.factory.IMobilePhone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Yanchen
 * date 2019/3/10 13:33
 */
public class SimpleMobilePhoneFactory {

    private final static Logger LOG = LoggerFactory.getLogger(SimpleMobilePhoneFactory.class);

    public static <T extends AbstractMobilePhone> IMobilePhone createMobilePhone(Class<T> clazz){
        try {
            return clazz.newInstance();
        } catch (Exception e){
            LOG.error(e.getMessage());
        }
        return null;
    }
}
