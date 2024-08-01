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

    private ImageIcon icon;
    private ImageIcon textFieldIcon;
    private ImageIcon passwordFieldIcon;

    private Font font;
    private Font textFieldFont;

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
        gbc.weightx = 1;
        gbc.weighty = 1;

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
        textFieldFont = new Font("Arial", Font.PLAIN, 20);

        textField = new JTextField(15);
        textField.setFont(textFieldFont);

        textField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        textField.setBackground(PRIMARY);
        textField.setForeground(Color.WHITE);

        passwordField = new JPasswordField(15);
        passwordField.setFont(textFieldFont);

        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        passwordField.setBackground(PRIMARY);
        passwordField.setForeground(Color.WHITE);

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
        buttonPanel = new JPanel();
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

        buttonPanel.add(loginButton);
        buttonPanel.add(resetButton);

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
