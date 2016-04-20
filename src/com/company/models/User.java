package com.company.models;

/**
 * Created by blahblah Team on 2016/4/16.
 */
public class User {

    public static final int ADMIN = 0;
    public static final int MEMBER = 1;
    private String id;

    User(String id) {
        this.id = id;
    }

    public void searchShow(String showId) {
        // TODO: call searchShow function in Main class
    }
}
