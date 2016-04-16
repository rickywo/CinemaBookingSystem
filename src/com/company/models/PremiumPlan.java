package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class PremiumPlan extends Plan {
    PremiumPlan() {
        payment = 500.0;
        discount = new double[]{0.05, 0.1};
    }
}
