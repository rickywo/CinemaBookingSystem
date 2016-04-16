package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class Plan {
    public static final int STANDARD = 0;
    public static final int PREMIUM = 1;
    public static final int ELITE = 2;
    double discount[] = {0.0, 0.0};
    double payment;

    public double getPayment() {
        return payment;
    }

    public double[] getDiscount() {
        return discount;
    }
}
