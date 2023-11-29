import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

 class BackgroundPanel extends JPanel{

    public Image backgroundImage;
    public void BackgroundPanel (String imagePath)
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

public class Logo extends JFrame {
    Font font = new Font("Roboto",Font.BOLD,15);
    ImageIcon icon;
    JPanel panel;
    BackgroundPanel bg;
    public Logo()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,740,740);
         
        bg = new BackgroundPanel();
         bg.BackgroundPanel("B.jpg");

     
        icon = new ImageIcon(getClass().getResource("font.jpg"));
        this.setIconImage(icon.getImage());

        
        add(bg);
        setContentPane(bg);
        setVisible(true); 
        }

public static void main(String[] args) {

    new Logo();
    
}

    
}

