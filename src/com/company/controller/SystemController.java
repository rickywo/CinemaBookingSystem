package com.company.controller;

import com.company.models.TheatreManager;
import com.company.models.User;

/**
 * Created by blahblah Team on 2016/4/20.
 */
public class SystemController {
    private static TheatreManager manager = TheatreManager.getInstance();

    public static User login(String account) {
        return manager.getUserById(account);
    }

    public static void test() {
        manager.addMember(User.ADMIN, "admin");
        manager.addMember(User.MEMBER, "m1");
        manager.addMember(User.MEMBER, "m2");
    }
}
