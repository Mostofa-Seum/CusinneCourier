package source;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import static javax.swing.JOptionPane.showMessageDialog;


class BackgroundPanel extends JPanel{
    private Image backgroundImage;

  
    public BackgroundPanel(String imagePath) {
        URL imgUrl = getClass().getResource(imagePath);
        if (imgUrl != null) {
            this.backgroundImage = new ImageIcon(imgUrl).getImage();
        } else {
            System.out.println( imagePath);
        }
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(backgroundImage != null)
        {
            g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
        }
    }


}

public class LoginPage extends JFrame implements ActionListener{
    
    ImageIcon icon;
    JPanel p1;
    JLabel  l,ll, l1,l2,l3;
    BackgroundPanel bg;
    Font f1,f2;
    JTextField tf1,tf2;
    JPasswordField pass;
    JButton b1,b2,b3,b4,b5,b6;
    JCheckBox cb;
    private static final File USER_FILE = new File("UserFiles.txt");
   

    public LoginPage()
    {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,1920,1080);
        setLayout(null);
       
        
         bg = new BackgroundPanel("/images/login.png");
         bg.setLayout(null);
   
         Image logo = new ImageIcon(getClass().getResource("/images/logo.png")).getImage();
         Image resizeLogo = logo.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);

        icon = new ImageIcon(resizeLogo);
       this.setIconImage(icon.getImage());



        l = new JLabel("Welcome");
        l.setBounds(145,200,600,35);
        l.setForeground(Color.black);
        f1 = new Font("Castellar",Font.BOLD,40);
        l.setFont(f1);
        bg.add(l);

         ll = new JLabel("Cusinne Courier");
         ll.setBounds(105,250,600,40);
        ll.setForeground(Color.black);
        f1 = new Font("Castellar",Font.BOLD,32);
        ll.setFont(f1);
        bg.add(ll);

        l1 = new JLabel("User Name ");
        l1.setBounds(30,320,300,40);
        l1.setForeground(Color.black);
        l1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        f1 = new Font("Segoe UI",Font.PLAIN,25);
        l1.setFont(f1);
        bg.add(l1);


        l2 = new JLabel("Password");
        l2.setBounds(30,393,300,40);
        l2.setForeground(Color.black);
        l2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        f1 = new Font("Segoe UI",Font.PLAIN,25);
        l2.setFont(f1);
        l2.setBorder(null);
        bg.add(l2);

        l3 = new JLabel("Don't have an account?");
        l3.setBounds(140,550,230,30);
        l3.setForeground(Color.black);
        f1 = new Font("Segoe UI",Font.PLAIN,20);
        l3.setFont(f1);
        bg.add(l3);


        l3 = new JLabel("");
        l3.setBounds(155,550,230,30);
        l3.setForeground(Color.black);
        f1 = new Font("Segoe UI",Font.PLAIN,20);
        l3.setFont(f1);
        bg.add(l3);





        tf1 = new JTextField();
        tf1.setBounds(180,326,320,30);
        tf1.setForeground(Color.black);
        tf1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tf1.setCaretColor(Color.black);
        f1 = new Font("Segoe UI",Font.PLAIN,18);
        tf1.setFont(f1);
        tf1.setBorder( new LineBorder(Color.black));
        bg.add(tf1);

        pass = new JPasswordField();
        pass.setBounds(180,400,320,30);
        pass.setForeground(Color.black);
        pass.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pass.setCaretColor(Color.black);
        f1 = new Font("Segoe UI",Font.BOLD,18);
        pass.setFont(f1);
        pass.setBorder( new LineBorder(Color.black));
        bg.add(pass);

        cb = new JCheckBox("Remember me");
        cb.setBounds(30,440,168,60);
        cb.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cb.setForeground(Color.black);
        cb.setFocusPainted(false);
        f1 = new Font("Segoe UI",Font.PLAIN,20);
        cb.setFont(f1);
        cb.setContentAreaFilled(false);
        bg.add(cb);



        b1 = new JButton("Forget Password?");
        b1.setBounds(340,453,180,33);
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        f1 = new Font("Segoe UI",Font.PLAIN,20);
        b1.setFont(f1);
        b1.setBorder(new LineBorder(Color.black));
        b1.setContentAreaFilled(false);
        b1.setBorder(null);
        bg.add(b1);


        b2 = new JButton("Login");
        b2.setBounds(110,510,325,30);
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        f1 = new Font("Segoe UI",Font.PLAIN,18);
        b2.setFont(f1);
        b2.setBorder(new LineBorder(Color.black));
        bg.add(b2);



        b3 = new JButton("<html><u>SIGN UP<u><html>");//SIGN UP Page
        b3.setBounds(333,552,105,30);
        b3.setBackground(Color.white);
        b3.setForeground(Color.black);
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        f1 = new Font("Arial",Font.PLAIN,17);
        b3.setFont(f1);
        b3.setOpaque(false);
        b3.setBorder(null);
        b3.setContentAreaFilled(false);
        bg.add(b3);


        b2.addActionListener(this);
        b3.addActionListener(this);
        

        // if (file.exists() && !file.isDirectory()) {} 
        // else {}

        if (USER_FILE.exists() && !USER_FILE.isDirectory()) {} 
        else {}
             

        add(bg);
        setContentPane(bg);
        setSize(1920,1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true); 

    
    }
                  
    // private boolean registeredUser(String userName, String password) {
    //     try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    //         String line;
    
    //         while ((line = br.readLine()) != null) {
    //             if (line.trim().startsWith("User Name: " + userName)) {
    //                 // Check the password in the next line
    //                 line = br.readLine();
    //                 if (line != null && line.trim().startsWith("Password: " + password.trim())) {
    //                     return true; // Username and password match
    //                 }
    //             }
    //         }
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    
    //     return false; // No matching username and password found
    // }
    
    //      public void actionPerformed(ActionEvent ae) {
    //     if (ae.getSource() == b2) {
    //         String userName = tf1.getText();
    //         String passWord = new String(pass.getPassword());

    //         if (userName.trim().isEmpty() || passWord.trim().isEmpty()) {
    //             JOptionPane.showMessageDialog(this, "Enter your username and password to continue.", "Error", JOptionPane.ERROR_MESSAGE);
    //             return; 
    //         }
    

    //         if (registeredUser(userName, passWord)) {
    //             JOptionPane.showMessageDialog(this, "Login Successful!");
    //         } else {
    //             JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);

    //         }
    //     }
    //      else if (ae.getSource() == b3) 
    //     {
    //         new SignPage();          
    //         setVisible(false);
    //         dispose();
    //     }

    private boolean isValidUser(String userName, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            boolean isUsernameFound = false;
    
            while ((line = br.readLine()) != null) {
                System.out.println("Line read: " + line); // Debugging line
    
                if (line.trim().startsWith("User Name: " + userName)) {
                    isUsernameFound = true;
                    // Check the password in the next line
                    line = br.readLine();
                    System.out.println("Password line: " + line); // Debugging line
    
                    if (line != null && line.trim().startsWith("Password: " + password.trim())) {
                        return true; // Username and password match
                    }
                }
            }
    
            // Check if the username was found, regardless of the password match
            if (isUsernameFound) {
                System.out.println("Username found, but password doesn't match"); // Debugging line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return false; // No matching username and password found
    }
    
    
    

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {
            String userName = tf1.getText();
            String passWord = new String(pass.getPassword());

            if (userName.trim().isEmpty() || passWord.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter your username and password to continue.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (isValidUser(userName, passWord)) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (ae.getSource() == b3) {
            new SignPage();
            setVisible(false);
            dispose();
        }
    }
       
        }
    
       

       
