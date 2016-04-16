package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class LocalPlay extends Play {
    LocalPlay(String name, Type type) {
        super(name);
        standardRate = 100.0;
    }

    @Override
    public String getType() {
        return Type.LOCAL.getTypeName();
    }
}
