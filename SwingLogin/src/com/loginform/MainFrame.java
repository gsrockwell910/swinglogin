package com.loginform;

import javax.swing.*;
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
        frame.setSize(1000, 500);
        frame.setLayout(new BorderLayout(0, 0));
        frame.setLocationRelativeTo(null);

        //set up main panel to add all components to later
        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.setBackground(Color.GRAY);


        //set up panel for left side
        logoPanel = new JPanel(new BorderLayout());
        logoPanel.setBackground(Color.DARK_GRAY);

        //set up panel for right
        formPanel = new JPanel(new BorderLayout());
        formPanel.setBackground(Color.ORANGE);

        //add panel to frame
        panel.add(logoPanel);
        panel.add(formPanel);

        frame.add(panel, BorderLayout.CENTER);
    }

    public void show()
    {
        this.frame.setVisible(true);
    }
}
