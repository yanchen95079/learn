package com.yc.factory.enums;

/**
 * @author Yanchen
 * date 2019/3/10 13:33
 */
public enum OperationSystemEnum {

    ANDROID("Android（安卓)"),
    IOS("iOS（苹果）");


    protected String name;

    OperationSystemEnum(String name) {
        this.name = name;
    }
}
