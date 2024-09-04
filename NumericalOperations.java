// Imported Packages
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Udbhav Rajesh (Uddi)
 * This class is for the basic numerical operations
 * From APCSA Period 4.0
 */

public class NumericalOperations {
    public static void main(String args[]) {
        String problem1 = "Problem 1: " + (-79 + 3 * (4 + 82 - 68) / 7 % 19);
        String problem2 = "Problem 2: " + ((179 + 21 + 10) % 7 / 181 * 2);
        String problem3 = "Problem 3: " + (10 / 2 * 2 + 10 % 2);

        System.out.println(problem1);
        System.out.println(problem2);
        System.out.println(problem3);

        // GUI
        JFrame frame = new JFrame("Numerical Operations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.setResizable(false);
        frame.setLayout(null);

        // Set background color of the content pane
        frame.getContentPane().setBackground(Color.decode("#05DBFC")); // Background Color

        // Default GUI Settings
        int spacer = 35;
        int defaultHeight = 260;
        int buttonWidth = 180;
        int buttonHeight = 50;
        int labelWidth = 500;
        int labelHeight = 50;
        int fontSize = 25;

        // Title Bar Panel
        JPanel titlePanel = new JPanel();
        titlePanel.setBounds(0, 0, 1200, 80); // Adjust size and position as needed
        titlePanel.setBackground(Color.decode("#03468F")); // #03468F
        titlePanel.setLayout(null);

        // GUI Title
        JLabel title = new JLabel("Numerical Operations");
        title.setBounds(420, 10, 900, 60); // Adjust position within the panel
        title.setFont(new Font("Serif", Font.BOLD, 45));
        title.setForeground(Color.WHITE); // Set text color to white
        titlePanel.add(title);

        // Add title panel to the frame
        frame.add(titlePanel);

        // Footer Bar Panel
        JPanel footerPanel = new JPanel();
        footerPanel.setBounds(0, 690, 1200, 90); // Adjusted size and position
        footerPanel.setBackground(Color.decode("#03468F")); // #03468F
        footerPanel.setLayout(null);

        // Footer Title
        JLabel footerTitle = new JLabel("Udbhav Rajesh (Uddi)");
        footerTitle.setBounds(0, 10, 1200, 60); // Adjusted position within the panel
        footerTitle.setFont(new Font("Serif", Font.BOLD, 45));
        footerTitle.setForeground(Color.decode("#FFFFFF")); // Set text color to white
        footerTitle.setHorizontalAlignment(JLabel.CENTER); // Center align the text
        footerPanel.add(footerTitle);

        // Add footer panel to the frame
        frame.add(footerPanel);

        // Problem 1
        JLabel problem1Label = new JLabel(problem1);
        problem1Label.setBounds(buttonWidth + spacer, defaultHeight, labelWidth, labelHeight);
        problem1Label.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem1Label.setForeground(Color.decode("#007722")); // Hex color for problem labels
        problem1Label.setVisible(false);
        frame.add(problem1Label);

        JButton problem1Button = new JButton("Problem 1");
        problem1Button.setBounds(25, defaultHeight, buttonWidth, buttonHeight);
        problem1Button.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem1Button.setBackground(Color.decode("#000278")); // Hex color for button background
        problem1Button.setOpaque(true);
        problem1Button.setBorderPainted(false);
        problem1Button.setForeground(Color.WHITE); // White text color
        problem1Button.setFocusable(false);
        problem1Button.updateUI(); // Ensure the color change is applied
        frame.add(problem1Button);

        problem1Button.addActionListener(new ActionListener() {
            private boolean isVisible = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                isVisible = !isVisible; // Makes it togglable
                problem1Label.setVisible(isVisible);
            }
        });

        // Problem 2
        JLabel problem2Label = new JLabel(problem2);
        problem2Label.setBounds(buttonWidth + spacer, defaultHeight + buttonHeight + spacer, labelWidth, labelHeight);
        problem2Label.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem2Label.setForeground(Color.decode("#007722")); // Hex color for problem labels
        problem2Label.setVisible(false);
        frame.add(problem2Label);

        JButton problem2Button = new JButton("Problem 2");
        problem2Button.setBounds(25, defaultHeight + buttonHeight + spacer, buttonWidth, buttonHeight);
        problem2Button.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem2Button.setBackground(Color.decode("#000278")); // Hex color for button background
        problem2Button.setForeground(Color.WHITE); // White text color
        problem2Button.setOpaque(true);
        problem2Button.setBorderPainted(false);
        problem2Button.setFocusable(false);
        problem2Button.updateUI(); // Ensure the color change is applied
        frame.add(problem2Button);

        problem2Button.addActionListener(new ActionListener() {
            private boolean isVisible = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                isVisible = !isVisible; // Makes it togglable
                problem2Label.setVisible(isVisible);
            }
        });

        // Problem 3
        JLabel problem3Label = new JLabel(problem3);
        problem3Label.setBounds(buttonWidth + spacer, defaultHeight + 2 * (buttonHeight + spacer), labelWidth, labelHeight);
        problem3Label.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem3Label.setForeground(Color.decode("#007722")); // Hex color for problem labels
        problem3Label.setVisible(false);
        frame.add(problem3Label);

        JButton problem3Button = new JButton("Problem 3");
        problem3Button.setBounds(25, defaultHeight + 2 * (buttonHeight + spacer), buttonWidth, buttonHeight);
        problem3Button.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem3Button.setBackground(Color.decode("#000278")); // Hex color for button background
        problem3Button.setForeground(Color.WHITE); // White text color
        problem3Button.setOpaque(true);
        problem3Button.setBorderPainted(false);
        problem3Button.setFocusable(false);
        problem3Button.updateUI(); // Ensure the color change is applied
        frame.add(problem3Button);

        problem3Button.addActionListener(new ActionListener() {
            private boolean isVisible = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                isVisible = !isVisible; // Makes it togglable
                problem3Label.setVisible(isVisible);
            }
        });

        frame.setVisible(true);
    }
}




