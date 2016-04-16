package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class DeluxePlan extends Plan {
    DeluxePlan() {
        payment = 1000.0;
        discount = new double[]{0.1, 0.15};
    }
}
