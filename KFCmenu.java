import javax.swing.*;
import java.awt.*;

public class KFCmenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KFC Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        ImageIcon logoIcon = new ImageIcon("logo.png");
        frame.setIconImage(logoIcon.getImage());

        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(0x520102));
        frame.add(topPanel, BorderLayout.NORTH);

        JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backButtonPanel.setBackground(new Color(0x520102));

        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(0x99141e));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButtonPanel.add(backButton);
        topPanel.add(backButtonPanel, BorderLayout.WEST);

        JPanel signupLoginPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        signupLoginPanel.setBackground(new Color(0x520102));

        JButton signupButton = new JButton("Signup");
        JButton loginButton = new JButton("Login");
        signupButton.setFocusPainted(false);
        loginButton.setFocusPainted(false);

        signupButton.setBackground(new Color(0x99141e));
        signupButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(0x336699));
        loginButton.setForeground(Color.WHITE);

        signupLoginPanel.add(signupButton);
        signupLoginPanel.add(loginButton);

        topPanel.add(signupLoginPanel, BorderLayout.EAST);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(0x520102));
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

        Color panelColor = new Color(0x520102);

        setupPanel(gridPanel, panelColor, "6 PC BONELESS STRIPS (489).jpg", "6 PC Boneless Strips - 489Tk", new Dimension(300, 300));
        setupPanel(gridPanel, panelColor, "CHICKEN POPCORN (219).jpg", "Chicken Popcorn - 219Tk", new Dimension(300, 300));
        setupPanel(gridPanel, panelColor, "CHIZZA (399).jpg", "Chizza - 399Tk", new Dimension(300, 300));
        setupPanel(gridPanel, panelColor, "FRIED MEDIUM (159).jpg", "Fried Medium - 159Tk", new Dimension(300, 300));
        setupPanel(gridPanel, panelColor, "KFC BIG TREAT (999).jpg", "KFC Big Treat - 999Tk", new Dimension(300, 300));
        setupPanel(gridPanel, panelColor, "RIZO RICE (109).jpg", "Rizo Rice - 109Tk", new Dimension(300, 300));

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
        textBox.setBackground(new Color(0x520102));
        textBox.setForeground(Color.WHITE);
        textBox.setBorder(null);
        panel.add(textBox, BorderLayout.NORTH);

        JButton addToCartButton = new JButton("Add to Cart");
        addToCartButton.setPreferredSize(new Dimension(75, 30));
        addToCartButton.setBackground(new Color(0xb30627));
        addToCartButton.setForeground(Color.WHITE);
        addToCartButton.setFocusPainted(false);
        addToCartButton.setFont(new Font("Tahoma", Font.BOLD, 12));

        JButton orderNowButton = new JButton("Order Now");
        orderNowButton.setPreferredSize(new Dimension(75, 30));
        orderNowButton.setBackground(new Color(0xe06506));
        orderNowButton.setForeground(Color.WHITE);
        orderNowButton.setFocusPainted(false);
        orderNowButton.setFont(new Font("Tahoma", Font.BOLD, 12));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 0, 0));
        buttonPanel.add(addToCartButton);
        buttonPanel.add(orderNowButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        containerPanel.add(panel);
    }
}
