package com.loginform;

import javax.swing.*;
import java.awt.*;

public class MainFrame
{
    private JFrame frame;

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
    }

    public void show()
    {
        this.frame.setVisible(true);
    }
}
