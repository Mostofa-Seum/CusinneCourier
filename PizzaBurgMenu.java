import javax.swing.*;
import java.awt.*;

public class PizzaBurgMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PizzaBurg Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        ImageIcon logoIcon = new ImageIcon("logo.png");
        frame.setIconImage(logoIcon.getImage());

        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(0xdba24a));
        frame.add(topPanel, BorderLayout.NORTH);

        JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backButtonPanel.setBackground(new Color(0xdba24a));

        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(0x99141e));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButtonPanel.add(backButton);
        topPanel.add(backButtonPanel, BorderLayout.WEST);

        JPanel signupLoginLogoutPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        signupLoginLogoutPanel.setBackground(new Color(0xdba24a));

        JButton signupButton = new JButton("Signup");
        JButton loginButton = new JButton("Login");
        //JButton logoutButton = new JButton("Log Out");  
        signupButton.setFocusPainted(false);
        loginButton.setFocusPainted(false);
        //logoutButton.setFocusPainted(false);

        signupButton.setBackground(new Color(0x99141e));
        signupButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(0x336699));
        loginButton.setForeground(Color.WHITE);
        // logoutButton.setBackground(new Color(0x992e2e));
        // logoutButton.setForeground(Color.WHITE);

        signupLoginLogoutPanel.add(signupButton);
        signupLoginLogoutPanel.add(loginButton);
        //signupLoginLogoutPanel.add(logoutButton);  

        topPanel.add(signupLoginLogoutPanel, BorderLayout.EAST);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(0xdba24a));
        frame.add(bottomPanel, BorderLayout.SOUTH);

        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.setPreferredSize(new Dimension(150, 40));
        checkoutButton.setBackground(new Color(0x413016));
        checkoutButton.setForeground(Color.WHITE);
        checkoutButton.setFocusPainted(false);
        checkoutButton.setFont(new Font("Tahoma", Font.BOLD, 16));

        bottomPanel.add(checkoutButton, BorderLayout.CENTER);

        JPanel gridPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        frame.add(gridPanel, BorderLayout.CENTER);

        Color panelColor = new Color(0xdba24a);

        setupPanel(gridPanel, panelColor, "BBQ Meat Machine Pizza (315).jpg", "BBQ Meat Machine Pizza - 315Tk", new Dimension(400, 300));
        setupPanel(gridPanel, panelColor, "chedder Cream Pizza (275).jpg", "Chedder Cream Pizza - 275Tk", new Dimension(400, 300));
        setupPanel(gridPanel, panelColor, "Deep Sea Fantasy Pizza (295).jpg", "Deep Sea Fansaty Pizza - 295Tk", new Dimension(400, 300));
        setupPanel(gridPanel, panelColor, "Four Flavours Pizza (325).jpg", "Four Flavours Pizza - 325Tk", new Dimension(350, 300));
        setupPanel(gridPanel, panelColor, "Kebab Cocktail (325).jpeg", "Kebab Cocktail - 325Tk", new Dimension(450, 300));
        setupPanel(gridPanel, panelColor, "Meat Mashala  Pizza (315).jpeg", "Meat Mashala Pizza - 315Tk", new Dimension(350, 300));

        frame.setVisible(true);
    }

    private static void setupPanel(JPanel containerPanel, Color panelColor, String imagePath, String itemName, Dimension imageSize) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(panelColor);

        ImageIcon image = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(
                imageSize.width, imageSize.height, Image.SCALE_SMOOTH));
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(image);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(imageLabel);

        JTextField textBox = new JTextField(itemName);
        textBox.setEditable(false);
        textBox.setHorizontalAlignment(JTextField.CENTER);
        textBox.setFont(new Font("Tahoma", Font.BOLD, 12));
        textBox.setBackground(new Color(0x413016));
        textBox.setForeground(Color.WHITE);
        textBox.setBorder(null);
        panel.add(textBox, BorderLayout.NORTH);

        JButton addToCartButton = new JButton("Add to Cart");
        addToCartButton.setPreferredSize(new Dimension(75, 30));
        addToCartButton.setBackground(new Color(0x8e6930));
        addToCartButton.setForeground(Color.WHITE);
        addToCartButton.setFocusPainted(false);
        addToCartButton.setFont(new Font("Tahoma", Font.BOLD, 12));

        JButton orderNowButton = new JButton("Order Now");
        orderNowButton.setPreferredSize(new Dimension(75, 30));
        orderNowButton.setBackground(Color.BLACK);
        orderNowButton.setForeground(Color.YELLOW);
        orderNowButton.setFocusPainted(false);
        orderNowButton.setFont(new Font("Tahoma", Font.BOLD, 12));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3, 0, 0));
        buttonPanel.add(addToCartButton);
        buttonPanel.add(orderNowButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        containerPanel.add(panel);
    }
}
