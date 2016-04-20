package com.company;

import com.company.controller.SystemController;
import com.company.views.CinemaBookingSystemView;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SystemController.test(); // Test code
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CinemaBookingSystemView frame = new CinemaBookingSystemView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


}
