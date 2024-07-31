package com.loginform;

import javax.swing.*;
import java.awt.*;

public class Launcher
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
            {
                if("Metal".equals(info.getName()))
                {
                    try
                    {
                        UIManager.setLookAndFeel(info.getClassName());
                    }
                    catch(ClassNotFoundException |
                          InstantiationException |
                          IllegalAccessException |
                          UnsupportedLookAndFeelException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                }
            }
            MainFrame mainFrame = new MainFrame();
            mainFrame.show();
        });
    }
}