package source;
import javax.swing.*;
import javax.swing.border.LineBorder;
import source.LoginPage;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.io.*;
import java.nio.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static javax.swing.JOptionPane.showMessageDialog;


class BackgroundPanel1 extends JPanel{
   
    private Image backgroundImage;



    public BackgroundPanel1(String imagePath) {
        URL imgUrl = getClass().getResource(imagePath);
        if (imgUrl != null) {
            this.backgroundImage = new ImageIcon(imgUrl).getImage();
        } else {
            System.out.println(imagePath);
        }
    }
    public void paintComponent(Graphics g)
    {

        super.paintComponent(g);
        if(backgroundImage != null)
        {
            g.drawImage(backgroundImage,0,0,getWidth(), getHeight(),this);
        }

    }
}


public class SignPage extends JFrame implements ActionListener{

    BackgroundPanel1 bg;
    ImageIcon icon;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    Font f;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JComboBox area,securityQsn;
    JRadioButton rb1,rb2,rb3;
    JPasswordField pass,pass1;
    JButton b1,b2,b3,b4,b5,b6,b7;
     private FileWriter fileWriter;
     private static final File USER_FILE = new File("UserFiles.txt");
    
    

    public SignPage()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,1920,1080 );
        setLayout(null);


          bg = new BackgroundPanel1("/images/Regi.png");
          bg.setLayout(null);

          
         Image logo = new ImageIcon(getClass().getResource("/images/logo.png")).getImage();
         Image resizeLogo = logo.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);

        icon = new ImageIcon(resizeLogo);
        this.setIconImage(icon.getImage());



        l1 = new JLabel("First Name ");
        l1.setBounds(450,175,100,20);
        f = new Font("Segoe UI",Font.BOLD,15);
        l1.setFont(f);
        bg.add(l1);



        l2 = new JLabel("Last Name ");
        l2.setBounds(700,173,100,23);
        f = new Font("Segoe UI",Font.BOLD,15);
        l2.setFont(f);
        bg.add(l2);

        l3 = new JLabel("Date of Birth (dd-mm-yyyy)");
        l3.setBounds(450,242,250,23);
        f = new Font("Segoe UI",Font.BOLD,15);
        l3.setFont(f);
        bg.add(l3);


        l4 = new JLabel("Area");
        l4.setBounds(700,242,100,23);
        f = new Font("Segoe UI",Font.BOLD,15);
        l4.setFont(f);
        bg.add(l4);
        

         String[] option = { "Choose Area", "Bashundhara", "Badda",
        "Gulsan", "Kuril", "Uttara" };
         area = new JComboBox<>(option);
         area.setBounds(700,270,153,23);
         f = new Font("Arial",Font.PLAIN,15);
         area.setFont(f);
         area.setCursor(new Cursor(Cursor.HAND_CURSOR));
         area.setSelectedIndex(0);
         area.setBackground(Color.white);
         area.setForeground(Color.black);
         bg.add(area);


        l4 = new JLabel("Gender");
        l4.setBounds(450,310,250,23);
        f = new Font("Segoe UI",Font.BOLD,17);
        l4.setFont(f);
        bg.add(l4);


        l5 = new JLabel("Email");
        l5.setBounds(450,353,50,23);
        f = new Font("Segoe UI",Font.BOLD,17);
        l5.setFont(f);
        bg.add(l5);

        l6 = new JLabel("Contact Number");
        l6.setBounds(450,395,150,23);
        f = new Font("Segoe UI",Font.BOLD,17);
        l6.setFont(f);
        bg.add(l6);


        l7 = new JLabel("User Name");
        l7.setBounds(450,434,150,23);
        f = new Font("Segoe UI",Font.BOLD,17);
        l7.setFont(f);
        bg.add(l7);


        l7 = new JLabel("Password");
        l7.setBounds(450,470,150,23);
        f = new Font("Segoe UI",Font.BOLD,17);
        l7.setFont(f);
        bg.add(l7);


        l7 = new JLabel("Re-type Password");
        l7.setBounds(450,500,150,23);
        f = new Font("Segoe UI",Font.BOLD,17);
        l7.setFont(f);
        bg.add(l7);


         
        l8 = new JLabel("Already have an account?");
        l8.setBounds(500,635,350,23);
        f = new Font("Arial",Font.BOLD,16);
        l8.setFont(f);
        l8.setForeground(Color.black);
        bg.add(l8);


        l9 = new JLabel("Security Question");
        l9.setBounds(450,530,250,23);
        f = new Font("Segoe UI",Font.BOLD,17);
        l9.setFont(f);
        bg.add(l9);
        
        Color Black = new Color(51, 51, 51);
        l10 = new JLabel("Text your Answer");
        l10.setBounds(450, 560, 320, 25);
        f = new Font("Segoe UI", Font.BOLD, 17);
        l10.setFont(f);
        l10.setForeground(Black);
        bg.add(l10);

        l11 = new JLabel("______________________________");
        l11.setBounds(600, 560, 600, 40);
        l11.setForeground(Color.black);
        bg.add(l11);


        pass = new JPasswordField();
        pass.setBounds(600,470,160,21);
        f = new Font("Segoe UI",Font.BOLD,15);
        pass.setFont(f);
        pass.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pass.setCaretColor(Color.black);
        pass.setOpaque(false);
        pass.setBorder(new LineBorder(Color.black));
        bg.add(pass);

        pass1 = new JPasswordField();
        pass1.setBounds(600,500,160,21);
         f = new Font("Segoe UI",Font.BOLD,15);
        pass1.setFont(f);
        pass1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pass1.setCaretColor(Color.black);
        pass1.setOpaque(false);
        pass1.setBorder(new LineBorder(Color.black));
        bg.add(pass1);

        ButtonGroup genderGroup = new ButtonGroup();
        rb1 = new JRadioButton("Male");
        rb1.setBounds(520,311,100,23);
        f = new Font("Segoe UI",Font.BOLD,15);
        rb1.setFont(f);
        rb1.setContentAreaFilled(false);
        rb1.setFocusPainted(false);
        rb1.setBorderPainted(false);
        genderGroup.add(rb1);
        bg.add(rb1);

        rb2 = new JRadioButton("Female");
        rb2.setBounds(600,311,100,23);
        f = new Font("Segoe UI",Font.BOLD,15);
        rb2.setFont(f);
        rb2.setContentAreaFilled(false);
        rb2.setFocusPainted(false);
        rb2.setBorderPainted(false);
        genderGroup.add(rb2);
        bg.add(rb2);

        rb3 = new JRadioButton("Other");
        rb3.setBounds(700,311,100,23);
        f = new Font("Segoe UI",Font.BOLD,15);
        rb3.setFont(f);
        rb3.setContentAreaFilled(false);
        rb3.setFocusPainted(false);
        rb3.setBorderPainted(false);
        genderGroup.add(rb3);
        bg.add(rb3);



        t1 = new JTextField();//first name
        t1.setBounds(450,210,150,20);
        f = new Font("Segoe UI",Font.BOLD,15);
        t1.setFont(f);
        t1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t1.setCaretColor(Color.black);
        t1.setOpaque(false);
        t1.setBorder(new LineBorder(Color.black));
        bg.add(t1);


        t2 = new JTextField();//lastname
        t2.setBounds(700,209,150,21);
        f = new Font("Segoe UI",Font.BOLD,15);
        t2.setFont(f);
        t2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t2.setCaretColor(Color.black);
        t2.setOpaque(false);
        t2.setBorder(new LineBorder(Color.black));
        bg.add(t2);

        t3 = new JTextField();//DOB
        t3.setBounds(450,271,150,21);
        f = new Font("Segoe UI",Font.BOLD,15);
        t3.setFont(f);
        t3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t3.setCaretColor(Color.black);
        t3.setOpaque(false);
        t3.setBorder(new LineBorder(Color.black));
        bg.add(t3);


        t4 = new JTextField();//email textfield position
        t4.setBounds(510,354,250,21);
        f = new Font("Segoe UI",Font.BOLD,15);
        t4.setFont(f);
        t4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t4.setCaretColor(Color.black);
        t4.setOpaque(false);
        t4.setBorder(new LineBorder(Color.black));
        bg.add(t4);


        t5 = new JTextField();//Contact Number textfield position
        t5.setBounds(600,395,160,21);
        f = new Font("Segoe UI",Font.BOLD,15);
        t5.setFont(f);
        t5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t5.setCaretColor(Color.black);
        t5.setOpaque(false);
        t5.setBorder(new LineBorder(Color.black));
        bg.add(t5);


        t6 = new JTextField();//UserName textfield position
        t6.setBounds(600,434,160,21);
        f = new Font("Segoe UI",Font.BOLD,15);
        t6.setFont(f);
        t6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t6.setCaretColor(Color.black);
        t6.setOpaque(false);
        t6.setBorder(new LineBorder(Color.black));
        bg.add(t6);




        String[] secQsn = { "Choose a Security Question...", "what's your father's name?", "what's your mother's name?",
                "whats your favourite pet name?", "what's your favorite sports?", "what's your favourite movie?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(600, 530, 250, 25);
        securityQsn.setSelectedIndex(0);
        securityQsn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        securityQsn.setBackground(Color.white);
        bg.add(securityQsn);


        
        t7 = new JTextField();
        t7.setBounds(600, 560, 500, 30);
        t7.setForeground(Color.black);
        t7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        t7.setCaretColor(Color.black);
        t7.setBorder(null);
        t7.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t7.setOpaque(false);
        bg.add(t7);
        

        
        
        Color lightGreen = new Color(144, 238, 144);
        b1 = new JButton("Confirm");
        b1.setBounds(460,605,100,21);
        f = new Font("Segoe UI",Font.BOLD,15);
        b1.setFont(f);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setBorder(new LineBorder(Color.black));
        b1.setBackground(lightGreen);
        b1.setForeground(Color.black);
        bg.add(b1);


        Color lightOrange = new Color(255, 102, 102);
        b2 = new JButton("Clear");
        b2.setBounds(755,605,100,21);
        f = new Font("Segoe UI",Font.BOLD,15);
        b2.setFont(f);
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setBorder(new LineBorder(Color.black));
        b2.setBackground(lightOrange);
        b2.setForeground(Color.black);
        bg.add(b2);



        b3 = new JButton("<html><u>Login<u><html>");
        b3.setBounds(620,633,220,23);
        f = new Font("Segoe UI",Font.BOLD,17);
        b3.setFont(f);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         b3.setBorder(null);
         b3.setContentAreaFilled(false);
        b3.setForeground(Color.black);
        b3.setBorderPainted(false);
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        bg.add(b3);

        b4 = new JButton();
        b4.setIcon(new ImageIcon("images/iconn.png"));
        b4.setBounds(770, 473, 25, 20);
        b4.setForeground(Color.black);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        b4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b4.setContentAreaFilled(false);
        bg.add(b4);

        b5 = new JButton();
        b5.setIcon(new ImageIcon("images/iconnn.png"));
        b5.setBounds(770, 473, 25, 20);
        b5.setForeground(Color.white);
        b5.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFocusPainted(false);
        b5.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b5.setContentAreaFilled(false);
        b5.setVisible(false);
        bg.add(b5);


        b6 = new JButton();
        b6.setIcon(new ImageIcon("images/iconn.png"));
        b6.setBounds(770, 500, 25, 20);
        b6.setForeground(Color.black);
        b6.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setFocusPainted(false);
        b6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b6.setContentAreaFilled(false);
        bg.add(b6);

        b7 = new JButton();
        b7.setIcon(new ImageIcon("images/iconnn.png"));
        b7.setBounds(770, 500, 25, 20);
        b7.setForeground(Color.white);
        b7.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b7.setFocusPainted(false);
        b7.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b7.setContentAreaFilled(false);
        b7.setVisible(false);
        bg.add(b7);

         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         b7.addActionListener(this);


         try {
            String absolutePath = getAbsolutePath("Data/UserFiles.txt");
            fileWriter = new FileWriter(absolutePath, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
       

        add(bg);
        setSize(1920,1080);
        setContentPane(bg);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private String getAbsolutePath(String relativePath) {
        Path currentRelativePath = Paths.get("");
        return currentRelativePath.toAbsolutePath().toString() + "/" + relativePath;
    }

    public void returnLogin(){
        new LoginPage();
        setVisible(false);
        dispose();
         }

    private void clearFields() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        pass.setText("");
        pass1.setText("");
        area.setSelectedIndex(0);
        rb1.setSelected(false);
        rb2.setSelected(false);
        rb3.setSelected(false);
    }

    private boolean integer (String input)
     {
        try{
            Integer.parseInt(input);//throw a NumberFormatException by Integer.pareInt();
            return true;
        }
        catch(NumberFormatException ne)
        {
            return false;
        }
     }

     private boolean validDate(String date) {
        String dateRegex = "^\\d{2}-\\d{2}-\\d{4}$";
        return date.matches(dateRegex);
    }

     private boolean vailedEmail(String Email)
     {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Email.matches(emailRegex);
     }

     private boolean UsernameTaken(String userName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {      
                if (line.contains("User Name: " + userName)) 
                {
                    return true; // Username found, already taken
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Username not found, available
    }


    

    public void dispose() {
        super.dispose();
        try {
            if (fileWriter != null) {
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String getCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return currentDateTime.format(formatter);
    }



    private void addUser(String firstName, String lastName, String dob, 
    String selectedArea, String gender, String email, String number, String userName, String password,
    String selectedSecurityQsn, String answerText) {
        try{
        fileWriter.write("===============================================\n");
        fileWriter.write("====== ###        User Data          ### ======\n");
        fileWriter.write("===============================================\n\n");
        fileWriter.write("Registration Date: " + getCurrentDateTime() + "\n\n");
        fileWriter.write("First Name: " + firstName + "\n");
        fileWriter.write("Last Name: " + lastName + "\n");
        fileWriter.write("Date of Birth: " + dob + "\n");
        fileWriter.write("Area: " + selectedArea + "\n");
        fileWriter.write("Gender: " + gender + "\n");
        fileWriter.write("Email: " + email + "\n");
        fileWriter.write("Contact Number: " + number + "\n");
        fileWriter.write("User Name: " + userName + "\n");
        fileWriter.write("Password: " + password + "\n");
        fileWriter.write("Security question: " + selectedSecurityQsn + "\n");
        fileWriter.write("Answer : " + answerText + "\n");
        fileWriter.write("===============================================\n");
        fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void callRegistration() {
        String firstName = t1.getText();
        String lastName = t2.getText();
        String dob = t3.getText();
        String selectedArea = area.getSelectedItem().toString();
        String gender = rb1.isSelected() ? "Male" : (rb2.isSelected() ? "Female" : "Other");
        String email = t4.getText().toLowerCase();
        String number = t5.getText();
        String userName = t6.getText();
        String passWord = new String(pass.getPassword());
        String rePass = new String(pass1.getPassword());
        String selectedSecurityQsn = securityQsn.getSelectedItem().toString();
        String answerText = t7.getText();
    
        // Validation checks
        if (firstName.isEmpty() || lastName.isEmpty() || dob.isEmpty() || email.isEmpty()
                || number.isEmpty() || userName.isEmpty() || passWord.isEmpty() || rePass.isEmpty()
                || ("Choose Area".equals(selectedArea)) || ((securityQsn.getSelectedIndex()) == 0)
                || answerText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            if (!validDate(dob) || !integer(number)) {
                JOptionPane.showMessageDialog(null, " Fill up with integer ", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (!vailedEmail(email)) {
                JOptionPane.showMessageDialog(this, "Invalid email address.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if ("Choose a Security Question...".equals(selectedSecurityQsn) || answerText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please select a security question and provide an answer.",
                        "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            } else if (UsernameTaken(userName)) {
                JOptionPane.showMessageDialog(this, "Username already taken.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (!passWord.equals(rePass)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
       
        addUser(firstName, lastName, dob, selectedArea, gender, email, number, userName, passWord,
                selectedSecurityQsn, answerText);

        JOptionPane.showMessageDialog(this, "Registration Successful!");     
        returnLogin();
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        try{
            if(ae.getSource()==b1)
            {

                 callRegistration();
                 
            }
          
            else if(ae.getSource()==b2)
            {
                clearFields();
            }
           else if(ae.getSource()==b3)
            {

                returnLogin();
            }

            else if (ae.getSource() == b4) {
                if (pass.getEchoChar() != '\u0000') {
                    pass.setEchoChar('\u0000');
                    b4.setVisible(false);
                    b5.setVisible(true);
                }
            }
    
            else if (ae.getSource() == b5) {
                pass.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                b5.setVisible(false);
                b4.setVisible(true);
            } 
            

            else if (ae.getSource() == b6) {
                if (pass1.getEchoChar() != '\u0000') {
                    pass1.setEchoChar('\u0000');
                    b6.setVisible(false);
                    b7.setVisible(true);
                }
            }

            else if (ae.getSource() == b7) {
                pass1.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                b7.setVisible(false);
                b6.setVisible(true);
            } else {
            }
                
        }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }


       


        
        

        
    

     

            
        


        










