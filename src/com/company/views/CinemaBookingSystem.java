package com.company.views;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;

/**
 * Created by blahblah Team on 2016/4/18.
 */
public class CinemaBookingSystem extends  JFrame{
    private JTabbedPane tabbedPane = new JTabbedPane();
    static final int ADD_PLAY = 0,
    ADD_SHOW =1,
    ADD_MEMBER = 2,
    TOP_UP = 3,
    UPGRADE_PLAN = 4,
    MAKE_BOOKING = 5,
    CANCEL_BOOKING = 6,
    SEARCH_PLAY = 7;

    private JPanel panel[] = new JPanel[8];
    private JPanel login = new JPanel();


    public CinemaBookingSystem() {
        setBounds(100, 100, 800, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Load all data from file into model
        // initLibrarySystem();
        // Initialize all panels
        initLoginPage();
        initPanels();

        getContentPane().add(tabbedPane);
        enableAdminTabs(true);
    }

    private void initLoginPage() {
        login.setLayout(new BoxLayout(login, BoxLayout.Y_AXIS));
        JPanel a = new JPanel(), p = new JPanel();
        a.setLayout(new BorderLayout());
        p.setLayout(new BorderLayout());
        a.add(new JLabel("Account Name:"), BorderLayout.WEST);
        a.add(new JTextField(), BorderLayout.CENTER);
        p.add(new JLabel("Password:"), BorderLayout.WEST);
        p.add(new JTextField(), BorderLayout.CENTER);
        login.add(a);
        login.add(p);

    }

    private void initPanels() {
        panel[ADD_PLAY] = new AddPlayPanel();
        panel[ADD_SHOW] = new AddShowPanel();
        panel[ADD_MEMBER] = new AddMemberPanel();
        panel[TOP_UP] = new TopUpAccountPanel();
        panel[UPGRADE_PLAN] = new UpgradePlanPanel();
        panel[MAKE_BOOKING] = new MakeBookingPanel();
        panel[CANCEL_BOOKING] = new CancelBookingPanel();
        panel[SEARCH_PLAY] = new SearchPlay();
        tabbedPane.add(AddPlayPanel.TITLE, panel[ADD_PLAY]);
        tabbedPane.add(AddShowPanel.TITLE, panel[ADD_SHOW]);
        tabbedPane.add(AddMemberPanel.TITLE, panel[ADD_MEMBER]);
        tabbedPane.add(TopUpAccountPanel.TITLE, panel[TOP_UP]);
        tabbedPane.add(UpgradePlanPanel.TITLE, panel[UPGRADE_PLAN]);
        tabbedPane.add(MakeBookingPanel.TITLE, panel[MAKE_BOOKING]);
        tabbedPane.add(CancelBookingPanel.TITLE, panel[CANCEL_BOOKING]);
        tabbedPane.add(SearchPlay.TITLE, panel[SEARCH_PLAY]);
    }

    private void enableAdminTabs(boolean b) {
        tabbedPane.setEnabledAt(ADD_PLAY, b);
        tabbedPane.setEnabledAt(ADD_SHOW, b);
        tabbedPane.setEnabledAt(ADD_MEMBER, b);
        tabbedPane.setEnabledAt(TOP_UP, b);
        tabbedPane.setEnabledAt(UPGRADE_PLAN, b);
        tabbedPane.setEnabledAt(MAKE_BOOKING, !b);
        tabbedPane.setEnabledAt(CANCEL_BOOKING, !b);
        tabbedPane.setEnabledAt(SEARCH_PLAY, b);
    }
}
