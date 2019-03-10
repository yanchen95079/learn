package com.yc.factory;

import com.yc.factory.enums.OperationSystemEnum;

import java.io.Serializable;

/**
 * @author Yanchen
 * date 2019/3/10 13:33
 */
public abstract class AbstractMobilePhone implements IMobilePhone,Serializable {

    private static final long serialVersionUID = -3238761865985269052L;
    protected final String name;
    protected final OperationSystemEnum os;

    protected AbstractMobilePhone(String name, OperationSystemEnum os) {
        this.name = name;
        this.os = os;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getOperationSystem(){
        return os.name();
    }
}
