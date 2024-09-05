// Imported Packages
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModulusCalc {

    // Find Modulus Method
    public long findModulus(long dividend, long divisor) {
        long result = dividend;
        for (; result >= divisor; result -= divisor) {
            // Subtract divisor from dividend until dividend is less than divisor
        }
        return result;
    }

    public static void main(String args[]) {
        // GUI
        JFrame frame2 = new JFrame("ModulusCalc");
        frame2.setSize(1200, 800);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.getContentPane().setBackground(Color.decode("#05DBFC")); // Background Color

        // Default GUI Settings
        int spacer = 35;
        int defaultHeight = 260;
        int labelWidth = 200;
        int labelHeight = 50;
        int fontSize = 25;
        int textFieldWidth = 400;
        int textFieldHeight = 50;

        // Title Bar Panel
        JPanel titlePanel = new JPanel();
        titlePanel.setBounds(0, 0, 1200, 80); // Adjust size and position as needed
        titlePanel.setBackground(Color.decode("#03468F")); // #03468F
        titlePanel.setLayout(null);

        // GUI Title
        JLabel title = new JLabel("Modulus Calculator");
        title.setBounds(420, 10, 900, 60); // Adjust position within the panel
        title.setFont(new Font("Serif", Font.BOLD, 45));
        title.setForeground(Color.WHITE); // Set text color to white
        titlePanel.add(title);

        // Add title panel to the frame
        frame2.add(titlePanel);

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
        frame2.add(footerPanel);

        // Number Label
        JLabel numberLabel = new JLabel("Number:");
        numberLabel.setBounds(25, defaultHeight, labelWidth, labelHeight);
        numberLabel.setFont(new Font("Serif", Font.BOLD, fontSize));
        frame2.add(numberLabel);

        // Number Text Field
        JTextField numberTextField = new JTextField();
        numberTextField.setBounds(labelWidth + spacer, defaultHeight, textFieldWidth, textFieldHeight);
        numberTextField.setFont(new Font("Serif", Font.PLAIN, fontSize));
        frame2.add(numberTextField);

        // Modulus Label
        JLabel modLabel = new JLabel("Modulus:");
        modLabel.setBounds(25, defaultHeight + labelHeight + spacer, labelWidth, labelHeight);
        modLabel.setFont(new Font("Serif", Font.BOLD, fontSize));
        frame2.add(modLabel);

        // Modulus Text Field
        JTextField modTextField = new JTextField();
        modTextField.setBounds(labelWidth + spacer, defaultHeight + labelHeight + spacer, textFieldWidth, textFieldHeight);
        modTextField.setFont(new Font("Serif", Font.PLAIN, fontSize));
        frame2.add(modTextField);

        // Calculate Button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(labelWidth + spacer, defaultHeight + 2 * (labelHeight + spacer), 200, 50);
        calculateButton.setFont(new Font("Serif", Font.BOLD, fontSize));
        calculateButton.setBackground(Color.decode("#000278")); // Button color
        calculateButton.setOpaque(true);
        calculateButton.setBorderPainted(false);
        calculateButton.setForeground(Color.WHITE); // Text color
        calculateButton.setFocusable(false);
        frame2.add(calculateButton);

        // Result Label (initialized but not yet visible)
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(25, defaultHeight + 3 * (labelHeight + spacer), labelWidth + textFieldWidth, labelHeight);
        resultLabel.setFont(new Font("Serif", Font.BOLD, fontSize));
        frame2.add(resultLabel);

        // Action Listener for Calculate Button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    long number = Long.parseLong(numberTextField.getText());
                    long mod = Long.parseLong(modTextField.getText());

                    ModulusCalc calculator = new ModulusCalc();
                    long result = calculator.findModulus(number, mod);

                    // Update result label
                    resultLabel.setText("Result: " + result);
                    frame2.repaint(); // Refresh the frame to show the updated result

                } catch (NumberFormatException ex) {
                    // Handle the case where the input is not a valid integer
                    resultLabel.setText("Please enter valid integers.");
                    frame2.repaint(); // Refresh the frame to show the error message
                }
            }
        });

        frame2.setVisible(true);
    }
}
