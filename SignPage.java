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
import java.nio.IOException;
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
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Font f;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JComboBox area;
    JRadioButton rb1,rb2,rb3;
    JPasswordField pass,pass1;
    JButton b1,b2,b3;
     private FileWriter fileWriter;
    
    

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

        l3 = new JLabel("Date of Birth (dd/mm/yyy)");
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

        pass = new JPasswordField();
        pass.setBounds(600,470,160,21);
        f = new Font("Segoe UI",Font.PLAIN,15);
        pass.setFont(f);
        pass.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pass.setCaretColor(Color.black);
        pass.setOpaque(false);
        pass.setBorder(new LineBorder(Color.black));
        bg.add(pass);

        pass1 = new JPasswordField();
        pass1.setBounds(600,500,160,21);
         f = new Font("Segoe UI",Font.PLAIN,15);
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
        f = new Font("Segoe UI",Font.PLAIN,15);
        t1.setFont(f);
        t1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t1.setCaretColor(Color.black);
        t1.setOpaque(false);
        t1.setBorder(new LineBorder(Color.black));
        bg.add(t1);


        t2 = new JTextField();//lastname
        t2.setBounds(700,209,150,21);
        f = new Font("Segoe UI",Font.PLAIN,15);
        t2.setFont(f);
        t2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t2.setCaretColor(Color.black);
        t2.setOpaque(false);
        t2.setBorder(new LineBorder(Color.black));
        bg.add(t2);

        t3 = new JTextField();//DOB
        t3.setBounds(450,271,150,21);
        f = new Font("Segoe UI",Font.PLAIN,15);
        t3.setFont(f);
        t3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t3.setCaretColor(Color.black);
        t3.setOpaque(false);
        t3.setBorder(new LineBorder(Color.black));
        bg.add(t3);


        t4 = new JTextField();//email textfield position
        t4.setBounds(510,354,250,21);
        f = new Font("Segoe UI",Font.PLAIN,15);
        t4.setFont(f);
        t4.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t4.setCaretColor(Color.black);
        t4.setOpaque(false);
        t4.setBorder(new LineBorder(Color.black));
        bg.add(t4);


        t5 = new JTextField();//Contact Number textfield position
        t5.setBounds(600,395,160,21);
        f = new Font("Segoe UI",Font.PLAIN,15);
        t5.setFont(f);
        t5.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t5.setCaretColor(Color.black);
        t5.setOpaque(false);
        t5.setBorder(new LineBorder(Color.black));
        bg.add(t5);


        t6 = new JTextField();//UserName textfield position
        t6.setBounds(600,434,160,21);
        f = new Font("Segoe UI",Font.PLAIN,15);
        t6.setFont(f);
        t6.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        t6.setCaretColor(Color.black);
        t6.setOpaque(false);
        t6.setBorder(new LineBorder(Color.black));
        bg.add(t6);

        
        Color lightGreen = new Color(144, 238, 144);
        b1 = new JButton("Confirm");
        b1.setBounds(460,585,100,21);
        f = new Font("Segoe UI",Font.BOLD,15);
        b1.setFont(f);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setBorder(new LineBorder(Color.black));
        b1.setBackground(lightGreen);
        b1.setForeground(Color.black);
        bg.add(b1);


        Color lightOrange = new Color(255, 102, 102);
        b2 = new JButton("Clear");
        b2.setBounds(755,585,100,21);
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

         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);


         try {
           boolean fileExists = new File("UserFiles.txt").exists(); // Check if the file already exists
     
            fileWriter = new FileWriter("UserFiles.txt", fileExists);// Create a new FileWriter, if the file exists
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
        try {
            FileReader fr = new FileReader("UserFiles.txt");
            BufferedReader br = new BufferedReader(fr);//every line checking
            String line;

            while ((line = br.readLine()) != null) {
                if (line.trim().equals("User Name : " + userName)) {           
                    return true;// Username found, return true
                }
                br.readLine();// Skip the password line
            }

            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
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


    private void addUser(String firstName, String lastName, String dob, 
    String selectedArea, String gender, String email, String number, String userName, String password) {
        try{
        fileWriter.write("===============================================\n");
        fileWriter.write("====== ###        User Data          ### ======\n");
        fileWriter.write("===============================================\n\n");
        fileWriter.write("First Name: " + firstName + "\n");
        fileWriter.write("Last Name: " + lastName + "\n");
        fileWriter.write("Date of Birth: " + dob + "\n");
        fileWriter.write("Area: " + selectedArea + "\n");
        fileWriter.write("Gender: " + gender + "\n");
        fileWriter.write("Email: " + email + "\n");
        fileWriter.write("Contact Number: " + number + "\n");
        fileWriter.write("User Name: " + userName + "\n");
        fileWriter.write("Password: " + password + "\n");
        fileWriter.write("===============================================\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    


    public void actionPerformed(ActionEvent ae)
    {
        try{
            if(ae.getSource()==b1)
            {

                String firstName = t1.getText().toString();
                String lastName = t2.getText().toString();
                String dob = t3.getText();
                String selectedArea = area.getSelectedItem().toString();
                String gender = rb1.isSelected() ? "Male" : (rb2.isSelected() ? "Female" : "Other");         
                String email = t4.getText().toLowerCase();
                String number = t5.getText();
                String userName = t6.getText();
                String passWord = new String(pass.getPassword());
                String rePass = new String(pass1.getPassword());


                
            
                if(firstName.isEmpty()||lastName.isEmpty()||dob.isEmpty()||
                email.isEmpty()||number.isEmpty()||number.isEmpty()||userName.isEmpty()||
                passWord.isEmpty()||rePass.isEmpty()||
                ("Choose Area".equals(selectedArea)))
                {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                    JOptionPane.WARNING_MESSAGE);
                    return ;
                }

                else{
                    if(!validDate(dob)||!integer(number))
                {
                    JOptionPane.showMessageDialog(null, " Fill up with integer ",
                    "Error",JOptionPane.ERROR_MESSAGE );
                    return;
                }

                 else if(!vailedEmail(email))
                {
                    JOptionPane.showMessageDialog(this, "Invalid email address.", "Error", JOptionPane.ERROR_MESSAGE);
                     return;
                }
               
                   
                
               
                   else if (UsernameTaken(userName)) {
                        JOptionPane.showMessageDialog(this, "Username already taken.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else if (!passWord.equals(rePass)) {
                        JOptionPane.showMessageDialog(this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    } 
                    
                    }

                    addUser(firstName,lastName,dob,selectedArea,gender,email,number,userName,passWord);
                    JOptionPane.showMessageDialog(this, "Registration Successful..!");
                
                new LoginPage ();
                setVisible(false);
                dispose();
            }
            
            else if(ae.getSource()==b2)
            {
                clearFields();
            }
           else if(ae.getSource()==b3)
            {

                returnLogin();
            }
           
         
        }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }


       


        
        

        
    

     

            
        


        










