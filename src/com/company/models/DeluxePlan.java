package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class DeluxePlan extends Plan {

    static Plan singleton = null;

    public static Plan getInstance() {
        if(singleton == null) singleton = new DeluxePlan();
        return singleton;
    }

    private DeluxePlan() {
        payment = 1000.0;
        discount = new double[]{0.1, 0.15};
    }
}
