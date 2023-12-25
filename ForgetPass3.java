package source;

import javax.swing.*;
import javax.swing.border.LineBorder;

//import source.ForgetPass2;

import java.awt.*;
import java.awt.event.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class ForgetPass3 {
    JFrame f2;
    JPanel p1;
    JLabel l1, l2, l3, l4, l5, l6, l8;
    JTextField tf1;
    JPasswordField pf1;
    JButton  b3, b4, b5, b6;
    JCheckBox c1;
    ImageIcon i1,originalIcon,scaledIcon;
    Image originalImage,scaledImage;

    ForgetPass3() {

        f2 = new JFrame();

        i1 = new ImageIcon("images/logo.png");
        f2.setIconImage(i1.getImage());

        p1 = new JPanel();
        p1.setBounds(700, 0, 666, 768);
        p1.setBackground(new Color(244, 255, 187));

         l1 = new JLabel();
         originalIcon = new ImageIcon("images/Fp.jpg"); 
         originalImage = originalIcon.getImage();
         scaledImage = originalImage.getScaledInstance(750, 700, Image.SCALE_SMOOTH);
         scaledIcon = new ImageIcon(scaledImage);

         l1.setIcon(scaledIcon);
         l1.setBounds(0, 0, 750, 700);


        l2 = new JLabel("Recovery Password");
        l2.setBounds(900, 150, 350, 60);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 35));

        l3 = new JLabel("New Password");
        l3.setBounds(850, 280, 300, 40);
        l3.setForeground(Color.black);
        l3.setFont(new Font("Segoe UI", Font.BOLD, 20));

        l4 = new JLabel("________________________________________________________");
        l4.setBounds(850, 330, 400, 40);
        l4.setForeground(Color.black);
        l4.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        l5 = new JLabel("Confrim Password");
        l5.setBounds(850, 380, 200, 40);
        l5.setForeground(Color.black);
        l5.setFont(new Font("Segoe UI", Font.BOLD, 20));

        l6 = new JLabel("________________________________________________________");
        l6.setBounds(850, 430, 400, 40);
        l6.setForeground(Color.black);
        l6.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        l8 = new JLabel("Forgot Password");
        l8.setBounds(280, 680, 400, 40);
        l8.setFont(new Font("Segoe UI", Font.BOLD, 22));

        tf1 = new JTextField();
        tf1.setBounds(855, 320, 380, 30);
        tf1.setFont(new Font("Segoe UI", Font.BOLD, 22));
        tf1.setForeground(Color.black);
        tf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tf1.setCaretColor(Color.black);
        tf1.setBorder(null);
        tf1.setOpaque(false);

        pf1 = new JPasswordField();
        pf1.setBounds(855, 420, 380, 30);
        pf1.setFont(new Font("Segoe UI", Font.BOLD, 22));
        pf1.setForeground(Color.white);
        pf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pf1.setCaretColor(Color.black);
        pf1.setBorder(null);
        pf1.setOpaque(false);

        
        b3 = new JButton("Change Password");
        b3.setBounds(850, 550, 400, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setForeground(Color.black);
        b3.setBackground(new Color(244, 255, 187));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setBorder(new LineBorder(Color.black));
        b3.setFocusPainted(false);

        b4 = new JButton();
        b4.setIcon(new ImageIcon("images/iconn.png"));
        b4.setBounds(1250, 430, 25, 20);
        b4.setForeground(Color.black);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        b4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b4.setContentAreaFilled(false);

        b5 = new JButton();
        b5.setIcon(new ImageIcon("images/iconnn.png"));
        b5.setBounds(1250, 430, 25, 20);
        b5.setForeground(Color.white);
        b5.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFocusPainted(false);
        b5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b5.setContentAreaFilled(false);
        b5.setVisible(false);

        b6 = new JButton();
        b6.setIcon(new ImageIcon("images/return.png"));
        b6.setBounds(15, 8, 35, 40);
        b6.setForeground(Color.white);
        b6.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setFocusPainted(false);
        b6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b6.setContentAreaFilled(false);

        // adding
        f2.add(l1);
        f2.add(l2);
        f2.add(l3);
        f2.add(l4);
        f2.add(l5);
        f2.add(l6);
        f2.add(l8);

        // adding text field
        f2.add(tf1);
        f2.add(pf1);

        // adding button

        f2.add(b3);
        f2.add(b4);
        f2.add(b5);
        f2.add(b6);

        // add
    
        f2.add(p1);

        f2.setSize(1920, 1080);
        f2.setLayout(new BorderLayout());
        f2.setLocationRelativeTo(null);
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {
                    if (pf1.getEchoChar() != '\u0000') {
                        pf1.setEchoChar('\u0000');
                        b4.setVisible(false);
                        b5.setVisible(true);
                    }
                }
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b5) {
                    pf1.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                    b5.setVisible(false);
                    b4.setVisible(true);
                } else {
                }
            }
        });

        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b6) {
                    new ForgetPass2();
                    f2.setVisible(false);
                }
            }
        });

    
}
}
