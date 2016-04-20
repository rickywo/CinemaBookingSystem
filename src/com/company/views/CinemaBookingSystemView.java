package com.company.views;

import com.company.controller.SystemController;
import com.company.models.Admin;
import com.company.models.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by blahblah Team on 2016/4/18.
 */
public class CinemaBookingSystemView extends  JFrame{
    private JTabbedPane tabbedPane = new JTabbedPane();
    private static final int ADD_PLAY = 0,
    ADD_SHOW =1,
    ADD_MEMBER = 2,
    TOP_UP = 3,
    UPGRADE_PLAN = 4,
    MAKE_BOOKING = 5,
    CANCEL_BOOKING = 6,
    SEARCH_PLAY = 7;

    private JPanel panel[] = new JPanel[8];
    private User user;


    public CinemaBookingSystemView() {
        setBounds(100, 100, 800, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Initialize all panels

        initPanels();
        getContentPane().add(tabbedPane);
        initLoginPage();
    }

    private void initLoginPage() {

        LoginDialog loginDialog = new LoginDialog(this, true);
        loginDialog.setVisible(true);

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
        tabbedPane.setEnabledAt(SEARCH_PLAY, true);
    }

    class LoginDialog extends JDialog {

        private final JLabel jlblUsername = new JLabel("Username");
        //private final JLabel jlblPassword = new JLabel("Password");

        private final JTextField jtfUsername = new JTextField(15);
        //private final JPasswordField jpfPassword = new JPasswordField();

        private final JButton jbtOk = new JButton("Login");
        private final JButton jbtCancel = new JButton("Cancel");

        private final JLabel jlblStatus = new JLabel(" ");

        public LoginDialog() {
            this(null, true);
        }

        public LoginDialog(final JFrame parent, boolean modal) {
            super(parent, modal);

            JPanel p3 = new JPanel(new GridLayout(1, 1));
            p3.add(jlblUsername);

            JPanel p4 = new JPanel(new GridLayout(1, 1));
            p4.add(jtfUsername);

            JPanel p1 = new JPanel();
            p1.add(p3);
            p1.add(p4);

            JPanel p2 = new JPanel();
            p2.add(jbtOk);
            p2.add(jbtCancel);

            JPanel p5 = new JPanel(new BorderLayout());
            p5.add(p2, BorderLayout.CENTER);
            p5.add(jlblStatus, BorderLayout.NORTH);
            jlblStatus.setForeground(Color.RED);
            jlblStatus.setHorizontalAlignment(SwingConstants.CENTER);

            setLayout(new BorderLayout());
            add(p1, BorderLayout.CENTER);
            add(p5, BorderLayout.SOUTH);
            pack();
            setLocationRelativeTo(null);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });


            jbtOk.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    user = SystemController.login(jtfUsername.getText());
                    if (user != null) {
                        enableAdminTabs(user instanceof Admin);
                        parent.setVisible(true);
                        setVisible(false);
                    } else {
                        jlblStatus.setText("Invalid username or password");
                    }
                }
            });
            jbtCancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    parent.dispose();
                    System.exit(0);
                }
            });
        }
    }
}
