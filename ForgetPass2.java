package source;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class ForgetPass2 {
    JFrame frame;
    JPanel p1;
    JLabel l1, l2, l3, l4, l5, l6;
    JButton  b3, b4, b5;
    JTextField tf1;
    ImageIcon i1,originalIcon,scaledIcon;
    Image originalImage,scaledImage;


    ForgetPass2() 
    {
        frame = new JFrame();
  

        i1 = new ImageIcon("images/logo.png");
        frame.setIconImage(i1.getImage());

        p1 = new JPanel();
        p1.setBounds(700, 0, 666, 768);
        p1.setBackground(new Color(226, 234, 148));

         l1 = new JLabel();
         originalIcon = new ImageIcon("images/recovery.png"); 
         originalImage = originalIcon.getImage();
         scaledImage = originalImage.getScaledInstance(750, 700, Image.SCALE_SMOOTH);
         scaledIcon = new ImageIcon(scaledImage);

        l1.setIcon(scaledIcon);
        l1.setBounds(0, 0, 750, 700);

        b3 = new JButton();
        b3.setIcon(new ImageIcon("return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setForeground(Color.black);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);

        l2 = new JLabel("Enter Recovery Code");
        l2.setBounds(760, 150, 500, 60);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 26));

        l3 = new JLabel("Check your email. You must recieve an Email with recovery code for  ");
        l3.setBounds(760, 230, 500, 60);
        l3.setForeground(Color.black);
        l3.setFont(new Font("Segoe UI", Font.BOLD, 15));

        l4 = new JLabel("password reset");
        l4.setBounds(760, 250, 500, 60);
        l4.setForeground(Color.black);
        l4.setFont(new Font("Segoe UI", Font.BOLD, 15));

        tf1 = new JTextField();
        tf1.setBounds(760, 300, 200, 20);
        tf1.setBorder(null);

        l5 = new JLabel("Didn't recieve code ?");
        l5.setBounds(760, 340, 200, 20);
        l5.setForeground(Color.black);
        l5.setFont(new Font("Segoe UI", Font.BOLD, 15));

        b4 = new JButton("Send again");
        b4.setBounds(890, 342, 100, 20);
        b4.setForeground(Color.black);
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);

        b5 = new JButton("Submit");
        b5.setBounds(760, 370, 100, 20);
        b5.setBackground(new Color(135, 220, 0));
        b5.setForeground(new Color(217, 217, 217));
        b5.setFocusPainted(false);
        b5.setVisible(true);


        l6 = new JLabel("Forgot Password");
        l6.setBounds(280, 680, 400, 40);
        l6.setFont(new Font("Segoe UI", Font.BOLD, 22));

      
        frame.add(b3);
        frame.add(b4);
        frame.add(b4);
        frame.add(b5);

      
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);

    
        frame.add(tf1);
        frame.add(p1);

        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(false);

        

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b3) {
                    new ForgetPass();
                    frame.setVisible(false);
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b4) {

                    showMessageDialog(null, "Recovery Code resend succesful ", "Message",
                            -1);

                }
            }
        });

        tf1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == tf1) {
                    if (!tf1.getText().equals("")) {

                        b5.setVisible(true);
                    } else {
                        b5.setVisible(false);
                    }

                }
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == b5) {
                    if (tf1.getText().equals("")) {
                        showMessageDialog(null, " Invalid recovery code ", "Message", -1);
                    }

                    else {
                        //new ForgetPass3();
                        frame.setVisible(false);

                    }

                }
            }
        });

    }

}
