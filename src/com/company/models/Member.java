package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class Member extends User {
    private double credit;
    private Plan plan;

    Member(String id) {
        super(id);
        changePlan('S');
    }

    public void changePlan(int p) {
        switch(p) {
            case Plan.PREMIUM:
                plan = new PremiumPlan();
                break;
            case Plan.ELITE:
                plan = new ElitePlan();
                break;
            case Plan.STANDARD:
            default:
                plan = new StandardPlan();
                break;
        }
    }

    public double topUpCredit(double amount) {
        this.credit += amount;
        return this.credit;
    }

    public void makeBooking() {
        //TODO: call makeBooking function in Main class
    }

    public void cancelBooking() {
        // TODO: call cancel booking function in Main class
    }
}