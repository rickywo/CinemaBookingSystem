package com.company.models;

import java.util.Date;
import java.util.Hashtable;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class TheatreManager {

    private Hashtable <String, User> users;
    private Hashtable <String, Play> plays;
    private Hashtable <Date, Show> shows;
    private Hashtable <Date, Hashtable<String, Booking>> bookings;

    private static TheatreManager singleton;

    public static TheatreManager getInstance() {
        if(singleton == null) singleton = new TheatreManager();
        return singleton;
    }

    private TheatreManager() {
        users = new Hashtable<String, User>();
        plays = new Hashtable<String, Play>();
        shows = new Hashtable<Date, Show>();
        bookings = new Hashtable<Date, Hashtable<String, Booking>>();
    }

    public User getUserById(String id) {
        // TODO: use id as key to find User in Hashtable users
        return users.get(id);
    }

    public Play getPlayByName(String name) {
        return plays.get(name);
    }

    public Show getShowByDate(Date date) {
        return shows.get(date);
    }

    public Booking getBookingByDateAndUserID(Date date, String id) {
        return bookings.get(date).get(id);
    }

    public void addMember(int type, String account) {
        // TODO: Add a member in to Hashtable users
        switch (type) {
            case User.ADMIN:
                users.put(account, new Admin(account));
                break;
            case User.MEMBER:
            default:
                users.put(account, new Member(account));
                break;
        }
    }

    public boolean addPlay() {
        // TODO: Add a play in to hashtable plays
        return true;
    }

    public boolean addShow() {
        return true;
    }

    private boolean addBooking() {
        // TODO: Add a booking record into hashtable bookings
        return true;
    }

    public boolean topUpMemeberAccount(String memberId, double amount) {
        // TODO: top up account
        return true;
    }

    public boolean makeBooking() {
        // TODO: make a booking
        return true;
    }

    public boolean upgradePlan(String uid, int plan) {
        // TODO: upgrade plan
        Member m = (Member) getUserById(uid);
        m.changePlan(plan);
        return true;
    }

    public void cancelBooking(String uid, Date date) {
        // TODO: cancel a booking
    }

}
