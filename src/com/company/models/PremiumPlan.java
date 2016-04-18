package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class PremiumPlan extends Plan {

    static Plan singleton = null;

    public static Plan getInstance() {
        if(singleton == null) singleton = new PremiumPlan();
        return singleton;
    }

    private PremiumPlan() {
        payment = 500.0;
        discount = new double[]{0.05, 0.1};
    }
}
