package com.company.views;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by blahblah Team on 2016/4/18.
 */
public class AddMemberPanel extends JPanel{
    public static final String TITLE = "Add Member";
    private static final String REGISTER_MEMBER = "Register Member";
    private static final String HINT_MESSAGE = "Enter details of the new Member to be registered";
    private static final String MEMBER_ID = "Member ID";
    private static final String MEMBER_NAME = "Member Name";
    private static final String CONTACT_NUMBER = "Contact Number";
    private static final String ADMIN = "Admin";
    private static final String MEMBER = "Member";

    /**
     * Create the panel.
     */

    private JPanel north = new JPanel();
    private JPanel center = new JPanel();
    private JPanel south = new JPanel();
    private JLabel hint_label = new JLabel(HINT_MESSAGE);
    // Member ID component
    private JLabel id_label = new JLabel(MEMBER_ID);
    private JTextField id_textfield = new JTextField();
    // Member name component
    private JLabel name_label = new JLabel(MEMBER_NAME);
    private JTextField name_textfield = new JTextField();
    // Member contact number component
    private JLabel contact_label = new JLabel(CONTACT_NUMBER);
    private JTextField contact_textfield = new JTextField();
    // Vocation select radio group
    private JRadioButton admin_radiobutton = new JRadioButton(ADMIN);
    private JRadioButton member_radiobutton =new JRadioButton(MEMBER);
    private ButtonGroup bg = new ButtonGroup();
    // Register button component
    private JButton register_button = new JButton(REGISTER_MEMBER);
    private ActionListener mListener = new ActionListener (){

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO register new member into library system
            //doRegister();
        }

    };

    private ActionListener selectionListener = new ActionListener (){

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO check all input field is filled
            register_button.setEnabled(validateInputs());
        }

    };

    private KeyListener mKeyListener = new KeyListener() {

        @Override
        public void keyTyped(KeyEvent e) {
            register_button.setEnabled(validateInputs());
            //Log.d(Boolean.toString(validateInputs()));
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };

    AddMemberPanel() {
        setLayout(new BorderLayout(10, 0));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        initContent();
    }

    private void initContent() {

        initNorthView();
        initCenterView();
        initSouthView();
        add(north, BorderLayout.PAGE_START);
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.PAGE_END);
    }

    private void initNorthView() {
        north.add(hint_label);
    }

    private void initCenterView() {
        center.setLayout(new GridLayout(0, 2, 10, 0));
        // ID components
        center.add(id_label);
        center.add(id_textfield);
        id_textfield.addKeyListener(mKeyListener);
        // Name components
        //center.add(name_label);
        //center.add(name_textfield);
        //name_textfield.addKeyListener(mKeyListener);
        // Contact components
        //center.add(contact_label);
        //center.add(contact_textfield);
        //contact_textfield.addKeyListener(mKeyListener);
        // Button group with 2 radio buttons
        bg.add(admin_radiobutton);
        bg.add(member_radiobutton);
        center.add(admin_radiobutton);
        admin_radiobutton.addActionListener(selectionListener);
        center.add(member_radiobutton);
        member_radiobutton.addActionListener(selectionListener);

    }

    private void initSouthView() {
        south.add(register_button);
        register_button.setEnabled(false);
        register_button.addActionListener(mListener);
    }


    private boolean validateInputs() {
        if(id_textfield.getText().isEmpty() ||
                //name_textfield.getText().isEmpty() ||
                //contact_textfield.getText().isEmpty() ||
                bg.getSelection() == null)
            return false;
        else
            return true;
    }

}
