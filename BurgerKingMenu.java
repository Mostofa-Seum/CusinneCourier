import javax.swing.*;
import java.awt.*;

public class BurgerKingMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Burger King Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        ImageIcon logoIcon = new ImageIcon("logo.png");
        frame.setIconImage(logoIcon.getImage());

        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(0xf6822e));
        frame.add(topPanel, BorderLayout.NORTH);

        JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backButtonPanel.setBackground(new Color(0xf6822e));

        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(0x99141e));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButtonPanel.add(backButton);
        topPanel.add(backButtonPanel, BorderLayout.WEST);

        JPanel signupLoginLogoutPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        signupLoginLogoutPanel.setBackground(new Color(0xf6822e));

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
        bottomPanel.setBackground(new Color(0xf6822e));
        frame.add(bottomPanel, BorderLayout.SOUTH);

        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.setPreferredSize(new Dimension(150, 40));
        checkoutButton.setBackground(new Color(0x2E8B57));
        checkoutButton.setForeground(Color.WHITE);
        checkoutButton.setFocusPainted(false);
        checkoutButton.setFont(new Font("Tahoma", Font.BOLD, 16));

        bottomPanel.add(checkoutButton, BorderLayout.CENTER);

        JPanel gridPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        frame.add(gridPanel, BorderLayout.CENTER);

        Color panelColor = new Color(0xf6822e);

        setupPanel(gridPanel, panelColor, "Chicken Stacker - (469).jpg", "Chicken Stacker - 469Tk", new Dimension(400, 300));
        setupPanel(gridPanel, panelColor, "Creamy Double Cheese Burger - (389).jpg", "Creamy Double Cheese Burger - 389Tk", new Dimension(400, 300));
        setupPanel(gridPanel, panelColor, "Crispy king-(379).jpg", "Crispy King - 379Tk", new Dimension(400, 300));
        setupPanel(gridPanel, panelColor, "Fried Chicken - 2PC-(299).png", "Fried Chicken 2PC - 299Tk", new Dimension(300, 300));
        setupPanel(gridPanel, panelColor, "long Chees Bunger- (409).jpg", "Long Cheese Burger - 409Tk", new Dimension(450, 300));
        setupPanel(gridPanel, panelColor, "Whopper-(479).png", "Whopper - 479Tk", new Dimension(300, 300));

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
        textBox.setBackground(new Color(0x9c521b));
        textBox.setForeground(Color.WHITE);
        textBox.setBorder(null);
        panel.add(textBox, BorderLayout.NORTH);

        JButton addToCartButton = new JButton("Add to Cart");
        addToCartButton.setPreferredSize(new Dimension(75, 30));
        addToCartButton.setBackground(new Color(0xf7161d));
        addToCartButton.setForeground(Color.WHITE);
        addToCartButton.setFocusPainted(false);
        addToCartButton.setFont(new Font("Tahoma", Font.BOLD, 12));

        JButton orderNowButton = new JButton("Order Now");
        orderNowButton.setPreferredSize(new Dimension(75, 30));
        orderNowButton.setBackground(new Color(0x0063b1));
        orderNowButton.setForeground(Color.WHITE);
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
