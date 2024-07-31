package com.loginform;

import javax.swing.*;
import java.awt.*;

public class MainFrame
{
    private JFrame frame;

    private JPanel panel;
    private JPanel logoPanel;
    private JPanel formPanel;
    private JPanel formPanelWrapper;

    private JLabel companyName;
    private JLabel textFieldLabel;
    private JLabel passwordFieldLabel;

    private ImageIcon icon;
    private ImageIcon textFieldIcon;
    private ImageIcon passwordFieldIcon;

    private Font font;

    private JTextField textField;
    private JPasswordField passwordField;

    private JButton loginButton;
    private JButton resetButton;

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
        logoPanel.setBackground(new Color(74, 31, 61));
        logoPanel.add(companyName);

        //set up fields
        textField = new JTextField(10);
        textField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
        textField.setBackground(new Color(186, 79, 84));
        textField.setForeground(Color.WHITE);

        passwordField = new JPasswordField(10);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE));
        passwordField.setBackground(new Color(186, 79, 84));
        passwordField.setForeground(Color.WHITE);

        //set up text field logo
        textFieldIcon = new ImageIcon("src/com/images/person_16.png");

        //set up text field label
        textFieldLabel = new JLabel(" ");
        textFieldLabel.setIcon(textFieldIcon);
        textFieldLabel.setIconTextGap(150);

        //remove later if not needed
        textFieldLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        textFieldLabel.setVerticalTextPosition(SwingConstants.CENTER);
        textFieldLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldLabel.setVerticalAlignment(SwingConstants.CENTER);

        //set up password field logo
        passwordFieldIcon = new ImageIcon("src/com/images/lock_16.png");

        //set up password field label
        passwordFieldLabel = new JLabel(" ");
        passwordFieldLabel.setIcon(passwordFieldIcon);
        passwordFieldLabel.setIconTextGap(150);

        //remove later in not needed
        passwordFieldLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        passwordFieldLabel.setVerticalTextPosition(SwingConstants.CENTER);
        passwordFieldLabel.setHorizontalAlignment(SwingConstants.CENTER);
        passwordFieldLabel.setVerticalAlignment(SwingConstants.CENTER);

        //set up panel for right
        formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 150));
        formPanelWrapper = new JPanel(new GridLayout(2, 4));
        formPanel.setBackground(new Color(186, 79, 84));
        formPanelWrapper.setBackground(new Color(186, 79, 84));


        //add text field components
        formPanelWrapper.add(textFieldLabel);
        formPanelWrapper.add(textField);

        //add password
        formPanelWrapper.add(passwordFieldLabel);
        formPanelWrapper.add(passwordField);

        //add wrapper
        formPanel.add(formPanelWrapper);

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
