package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ui {
    public static void main(String[] args) {
        // Create a new JFrame (the main window)
        JFrame frame = new JFrame("Simple Swing Application");

        // Set the size of the window
        frame.setSize(300, 200);

        // Make sure the application exits when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button and add an action listener
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hello, Swing!");
            }
        });

        // Add the button to the frame (window)
        frame.add(button);

        // Make the window visible
        frame.setVisible(true);
    }
}


