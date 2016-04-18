package com.company;

import com.company.views.CinemaBookingSystem;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CinemaBookingSystem frame = new CinemaBookingSystem();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
