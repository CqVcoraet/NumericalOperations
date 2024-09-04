// Imported Packages
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

        int spacer = 30;
        int buttonWidth = 150;
        int buttonHeight = 50;
        int labelWidth = 500;
        int labelHeight = 50;
        int fontSize = 25;

        // Problem 1
        JLabel problem1Label = new JLabel(problem1);
        problem1Label.setBounds(buttonWidth + spacer, 20, labelWidth, labelHeight);
        problem1Label.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem1Label.setVisible(false);
        frame.add(problem1Label);

        JButton problem1Button = new JButton("Problem 1");
        problem1Button.setBounds(25, 20, buttonWidth, buttonHeight);
        problem1Button.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem1Button.setFocusable(false);
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
        problem2Label.setBounds(buttonWidth + spacer, 20 + buttonHeight + spacer, labelWidth, labelHeight);
        problem2Label.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem2Label.setVisible(false);
        frame.add(problem2Label);

        JButton problem2Button = new JButton("Problem 2");
        problem2Button.setBounds(25, 20 + buttonHeight + spacer, buttonWidth, buttonHeight);
        problem2Button.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem2Button.setFocusable(false);
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
        problem3Label.setBounds(buttonWidth + spacer, 20 + 2 * (buttonHeight + spacer), labelWidth, labelHeight);
        problem3Label.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem3Label.setVisible(false);
        frame.add(problem3Label);

        JButton problem3Button = new JButton("Problem 3");
        problem3Button.setBounds(25, 20 + 2 * (buttonHeight + spacer), buttonWidth, buttonHeight);
        problem3Button.setFont(new Font("Serif", Font.BOLD, fontSize));
        problem3Button.setFocusable(false);
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
