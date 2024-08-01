package com.loginform;

import javax.swing.*;
import java.awt.*;

public class MainFrame
{
    private JFrame frame;

    private JPanel panel;
    private JPanel logoPanel;
    private JPanel formPanel;
    private JPanel buttonPanel;

    private JLabel companyName;
    private JLabel textFieldLabel;
    private JLabel passwordFieldLabel;
    private JLabel forgotPasswordLabel;

    private ImageIcon icon;
    private ImageIcon textFieldIcon;
    private ImageIcon passwordFieldIcon;

    private Font font;
    private Font textFieldFont;
    private Font passwordFieldFont;
    private Font forgotPasswordFont;

    private JTextField textField;
    private JPasswordField passwordField;

    private JButton loginButton;
    private JButton resetButton;

    private final Color PRIMARY = Color.DARK_GRAY;
    private final Color SECONDARY = Color.CYAN;

    public MainFrame()
    {
        initialize();
    }

    private void initialize()
    {
        frame = new JFrame();
        frame.setTitle("Login Page");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(950, 500);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        //set up main panel to add all components to later
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;

        //set up components to add to logoPanel
        companyName = new JLabel("Rockwell Software");
        companyName.setForeground(Color.BLACK);

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
        logoPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcLogo = new GridBagConstraints();
        gbcLogo.insets = new Insets(10, 10, 10, 10); // Padding

        gbcLogo.gridx = 0;
        gbcLogo.gridy = 0;
        gbcLogo.anchor = GridBagConstraints.CENTER;
        logoPanel.add(companyName, gbcLogo);

        logoPanel.setBackground(SECONDARY);

        //set up fields
        //TODO: make textFieldGenerator() to clean code up
        textFieldFont = new Font("Arial", Font.PLAIN, 20);

        textField = new JTextField(15);
        textField.setFont(textFieldFont);

        textField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        textField.setBackground(PRIMARY);
        textField.setForeground(Color.WHITE);
        textField.setCaretColor(Color.WHITE);

        passwordFieldFont = new Font("Arial", Font.PLAIN, 25);

        passwordField = new JPasswordField(15);
        passwordField.setFont(passwordFieldFont);

        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        passwordField.setBackground(PRIMARY);
        passwordField.setForeground(Color.WHITE);
        passwordField.setCaretColor(Color.WHITE);

        //set up text field logo
        textFieldIcon = new ImageIcon("src/com/images/person_16.png");

        //set up text field label
        textFieldLabel = new JLabel();
        textFieldLabel.setIcon(textFieldIcon);
        textFieldLabel.setHorizontalAlignment(SwingConstants.LEFT);

        //set up password field logo
        passwordFieldIcon = new ImageIcon("src/com/images/lock_16.png");

        //set up password field label
        passwordFieldLabel = new JLabel();
        passwordFieldLabel.setIcon(passwordFieldIcon);
        passwordFieldLabel.setHorizontalAlignment(SwingConstants.LEFT);

        //set up panel for right
        formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbcForm = new GridBagConstraints();
        gbcForm.insets = new Insets(10, 10, 10, 10);

        // Use GridBagLayout to align text and password fields with their labels
        gbcForm.gridx = 0;
        gbcForm.gridy = 0;
        gbcForm.anchor = GridBagConstraints.LINE_END;
        formPanel.add(textFieldLabel, gbcForm);

        gbcForm.gridx = 1;
        gbcForm.gridy = 0;
        gbcForm.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(textField, gbcForm);

        gbcForm.gridx = 0;
        gbcForm.gridy = 1;
        gbcForm.anchor = GridBagConstraints.LINE_END;
        formPanel.add(passwordFieldLabel, gbcForm);

        gbcForm.gridx = 1;
        gbcForm.gridy = 1;
        gbcForm.fill = GridBagConstraints.HORIZONTAL;
        formPanel.add(passwordField, gbcForm);

        //set up buttons
        //create button panel and button
        //TODO: make buttonGenerator() to clean code up
        buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setBackground(PRIMARY);

        loginButton = new JButton("Login");
        loginButton.setFocusable(false);
        loginButton.setToolTipText("Login to Rockwell Software portal");
        loginButton.setPreferredSize(new Dimension(100, 30));

        loginButton.setBackground(PRIMARY);
        loginButton.setForeground(Color.WHITE);

        loginButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        resetButton = new JButton("Reset");
        resetButton.setFocusable(false);
        resetButton.setToolTipText("Reset this form");

        resetButton.setPreferredSize(new Dimension(100, 30));

        resetButton.setBackground(PRIMARY);
        resetButton.setForeground(Color.WHITE);

        resetButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        // Use GridBagConstraints to position buttons with padding
        GridBagConstraints gbcButton = new GridBagConstraints();
        gbcButton.insets = new Insets(10, 33, 0, 30); // Add right padding to each button
        gbcButton.fill = GridBagConstraints.NONE;
        gbcButton.anchor = GridBagConstraints.CENTER;

        // Add loginButton with padding
        gbcButton.gridx = 0;
        gbcButton.gridy = 0;
        buttonPanel.add(loginButton, gbcButton);

        // Add resetButton with padding
        gbcButton.gridx = 1;
        gbcButton.gridy = 0;
        buttonPanel.add(resetButton, gbcButton);

        forgotPasswordLabel = new JLabel("Forgot Password?");
        forgotPasswordFont = new Font("Arial", Font.PLAIN, 15);
        forgotPasswordLabel.setFont(forgotPasswordFont);
        forgotPasswordLabel.setForeground(Color.WHITE);
        forgotPasswordLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        //add mouse listener to forgot password label
        forgotPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                //TODO: Handle forgot password action
                System.out.println("Forgot Password? clicked");
            }
        });

        // Add action listeners to buttons
        loginButton.addActionListener(e -> {
            // TODO: Handle login action here
            System.out.println("Login button clicked");
        });

        resetButton.addActionListener(e -> {
            // TODO: Handle reset action here
            System.out.println("Reset button clicked");
        });

        // Add buttonPanel to formPanel below the password field
        gbcForm.gridx = 0;
        gbcForm.gridy = 2; // Position button panel below the password field
        gbcForm.gridwidth = 2; // Span both columns
        gbcForm.fill = GridBagConstraints.HORIZONTAL; // Make the buttonPanel fill horizontally

        // Add left padding to move the buttonPanel to the right
        gbcForm.insets = new Insets(10, 70, 10, 10);

        formPanel.add(buttonPanel, gbcForm);

        // Add the "Forgot Password?" label below the buttonPanel
        gbcForm.gridy = 3; // Position "Forgot Password?" label below the buttonPanel
        gbcForm.insets = new Insets(25, 170, 10, 10); // Adjust padding as needed
        formPanel.add(forgotPasswordLabel, gbcForm);

        formPanel.setBackground(PRIMARY);

        // Add both panels to the mainPanel with equal weight
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        panel.add(logoPanel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        panel.add(formPanel, gbc);

        frame.add(panel, BorderLayout.CENTER);
    }

    public void show()
    {
        this.frame.setVisible(true);
    }
}