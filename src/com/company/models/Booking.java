package com.company.models;

import java.util.Date;

/**
 * Created by blahblah on 2016/4/16.
 */
public abstract class Booking {

    private String id;
    private Date date;
    private User user;
    private int[] seats;

    String getBookingId() {
        return id;
    }

    abstract void cancelBooking();
}
