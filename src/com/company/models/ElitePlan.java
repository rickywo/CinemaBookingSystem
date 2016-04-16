package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class ElitePlan extends Plan {

    ElitePlan() {
        payment = 2000.0;
        discount = new double[]{0.15, 0.20};
    }
}
