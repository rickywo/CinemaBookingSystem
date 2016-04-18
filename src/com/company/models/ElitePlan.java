package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class ElitePlan extends Plan {

    static Plan singleton = null;

    public static Plan getInstance() {
        if(singleton == null) singleton = new ElitePlan();
        return singleton;
    }

    private ElitePlan() {
        payment = 2000.0;
        discount = new double[]{0.15, 0.20};
    }
}
