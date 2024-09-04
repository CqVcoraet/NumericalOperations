/**
 * Indicate your first and last name along with a description of this class
 */
public class ModulusCalc {
    public static void main(String args[]){
        int number = 1234;
        int mod = 103;

        ModulusCalc calculator = new ModulusCalc(); // Create an instance of the class

        int result = calculator.findModulus(number, mod); // Call the method
        System.out.println("The modulus is: " + result); // Output the result
    }

    public int findModulus(int dividend, int divisor) {
        int result = dividend;
        for (; result >= divisor; result -= divisor) {
            // Subtract divisor from dividend until dividend is less than divisor
        }
        return result;
    }
}

