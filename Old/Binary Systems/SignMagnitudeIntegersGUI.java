import javax.swing.*;

public class SignMagnitudeIntegersGUI {
    public static void main(String[] args) {
        String explanation,explanation2,explanation3,explanation4,explanation5;
        
        explanation = "Sign and magnitude is a method for representing signed numbers, including both positive and negative values.\n In this system, a number is represented using two parts: the sign and the magnitude.";
        explanation2 = "The sign of a number indicates whether the value is positive or negative.\n In the sign and magnitude system, the sign is typically represented using the leftmost bit,\n with 0 indicating a positive value and 1 indicating a negative value.";
        explanation3 = "The magnitude of a number represents the absolute value of the number, which is the distance from zero without regard to the sign.\n The magnitude is typically represented using the remaining bits in the number.";
        explanation4 = "For example, in an 8-bit sign and magnitude system, the number +5 would be represented as 00000101, while the number -5 would be represented as 10000101.\n Note that the leftmost bit indicates the sign, while the remaining bits represent the magnitude.";
        explanation5 = "While sign and magnitude was once a common method for representing signed numbers,\n it has largely been replaced by more efficient and convenient systems such as two's complement.";
        
        JOptionPane.showMessageDialog(null,explanation,"Sign+Magnitude Explanation",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,explanation2,"Sign+Magnitude Explanation",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,explanation3,"Sign+Magnitude Explanation",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,explanation4,"Sign+Magnitude Explanation",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,explanation5,"Sign+Magnitude Explanation",JOptionPane.INFORMATION_MESSAGE);
        
        while(true){
            // Read decimal input from the user
            String input = JOptionPane.showInputDialog(null, "Please enter an integer within the range of -127 - +127:");

            if (input == null || input.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, "Operation Cancelled"); // to avoid crashing when cancelling
                break;
            }
            // Convert input string to integer
            int decimal;
            try{
                decimal = Integer.parseInt(input);
            }catch (NumberFormatException e) { 
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                continue;
            }

            // Determine the sign and magnitude of the number
            int sign = (decimal < 0) ? 1 : 0;
            int magnitude = Math.abs(decimal);

            // Convert magnitude to binary string
            String binary = Integer.toBinaryString(magnitude);

            // Pad binary string with leading zeros to ensure it has 8 bits
            binary = String.format("%7s", binary).replace(' ', '0');

            // Output the sign and binary representation of magnitude
            JOptionPane.showMessageDialog(null, "Sign-Magnitude: " + sign + binary);
            JOptionPane.showMessageDialog(null, "Sign: " + sign + "\nMagnitude: " + binary );
        }
    }
}

// Kayel Calleja