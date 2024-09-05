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
/**
 * Indicate your first and last name along with a description of this class
 */
public class NumReverse {

    // Method to reverse a number
    public long reverseNum(long number) {
        long reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        /*
         * Implement your number reversal algorithm below
         * Your code should work for any 4 digit integer.  
         * When your code is run, the original and the 
         * reversed number should print to the console.  
         */

        long exampleNumber = 1234;

        // Create an instance of NumReverse to call the reverseNum method
        NumReverse nr = new NumReverse();
        
        long reversedNumber = nr.reverseNum(exampleNumber);

        // Print the original and reversed numbers
        System.out.println("Original number: " + exampleNumber);
        System.out.println("Reversed number: " + reversedNumber);

        // GUI
        JFrame frame = new JFrame("Number Reverser");
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.decode("#05DBFC")); // Background Color

        frame.setVisible(true);
    }
}
