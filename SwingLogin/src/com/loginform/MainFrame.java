package com.loginform;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class MainFrame
{
    private JFrame frame;
    private JPanel panel;
    private JPanel logoPanel;
    private JPanel formPanel;
    private JLabel companyName;
    private ImageIcon icon;

    public MainFrame()
    {
        initialize();
    }

    private void initialize()
    {
        frame = new JFrame();
        frame.setTitle("Login Page");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setLocationRelativeTo(null);

        //set up main panel to add all components to later
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setBackground(Color.GRAY);

        //add panel to frame
        frame.add(panel, BorderLayout.CENTER);
    }

    public void show()
    {
        this.frame.setVisible(true);
    }
}
