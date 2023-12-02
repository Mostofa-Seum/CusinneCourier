import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

 class BackgroundPanel extends JPanel{

    private Image backgroundImage;
    public  BackgroundPanel (String imagePath)
    {
        this.backgroundImage=new ImageIcon(imagePath).getImage();
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

public class Login extends JFrame {
    
    ImageIcon icon;
    JPanel p1;
    JLabel l1,l2;
    BackgroundPanel bg;
    Font f1,f2;
    JTextField tf1,tf2;
    public Login()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,1920,1080);
        setLayout(null);
       
         
         bg = new BackgroundPanel("login.png");
         bg.setLayout(null);
   
        Image logo = new ImageIcon(getClass().getResource("logo.png")).getImage();
        Image resizeLogo = logo.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);

        icon = new ImageIcon(resizeLogo);
        this.setIconImage(icon.getImage());
  


        l1 = new JLabel("User Name ");
        l1.setBounds(30,300,300,40);
        l1.setForeground(Color.black);
         f1 = new Font("Segoe UI",Font.PLAIN,25);
        l1.setFont(f1);
        bg.add(l1);


        l2 = new JLabel("Password");
        l2.setBounds(30,400,300,40);
        l2.setForeground(Color.black);
        f1 = new Font("Segoe UI",Font.PLAIN,25);
        l2.setFont(f1);
        bg.add(l2);

        tf1 = new JTextField();
        tf1.setBounds(180,305,320,30);
        tf1.setForeground(Color.black);
        f1 = new Font("Segoe UI",Font.BOLD,18);
        tf1.setFont(f1);
        bg.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(180,405,320,30);
        tf2.setForeground(Color.black);
        f1 = new Font("Segoe UI",Font.BOLD,18);
        tf2.setFont(f1);
        bg.add(tf2);



     








     
        add(bg);
        setContentPane(bg);
        setVisible(true); 
        }

public static void main(String[] args) {

    new Login();
    
}

    
}

