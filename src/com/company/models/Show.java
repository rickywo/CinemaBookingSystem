package com.company.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class Show {
    private Play play;
    private Date date;
    private User[] seats = new User[50];
    Show(Play play, String dateString) {
        this.play = play;
        date = parseDateString(dateString);
    }

    private Date parseDateString(String dateString) {
        DateFormat df = DateFormat.getDateInstance();
        Date date = null;
        try {
            date = df.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public boolean bookSeat(User user, int seat) {
        if(seats[seat] != null) return false;
        seats[seat] = user;
        return true;
    }
}
