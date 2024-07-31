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
    private Font font;

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
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        //set up main panel to add all components to later
        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        //panel.setBackground(Color.LIGHT_GRAY);

        //set up components to add to logoPanel
        companyName = new JLabel("Rockwell Software");
        companyName.setForeground(Color.WHITE);

        //Icon set up
        icon = new ImageIcon("src/com/images/alien_outline.png");
        companyName.setIcon(icon);

        //Font setup
        font = new Font("arial", Font.BOLD, 36);
        companyName.setFont(font);

        //set text and logo position
        companyName.setHorizontalTextPosition(SwingConstants.CENTER);
        companyName.setVerticalTextPosition(SwingConstants.BOTTOM);
        companyName.setHorizontalAlignment(SwingConstants.CENTER);
        companyName.setVerticalAlignment(SwingConstants.CENTER);

        //set up panel for left side
        logoPanel = new JPanel(new BorderLayout());
        logoPanel.setBackground(Color.DARK_GRAY);
        logoPanel.add(companyName);
        

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
