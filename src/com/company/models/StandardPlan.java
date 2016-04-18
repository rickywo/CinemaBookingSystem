package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class StandardPlan extends Plan {

    static Plan singleton = null;

    public static Plan getInstance() {
        if(singleton == null) singleton = new StandardPlan();
        return singleton;
    }

    private StandardPlan() {
        payment = 0.0;
        discount = new double[]{0.0, 0.0};
    }
}
