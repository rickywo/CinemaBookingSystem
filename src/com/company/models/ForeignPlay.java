package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class ForeignPlay extends Play {
    ForeignPlay(String name, Type type) {
        super(name);
        standardRate = 200.0;
    }

    @Override
    public String getType() {
        return Type.FOREIGN.getTypeName();
    }
}
