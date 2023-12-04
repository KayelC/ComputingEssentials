import javax.swing.*;
public class SignAndMagnitudeRange {
    public static void main (String[] args){
        String explanation, explanation2, explanation3, explanation4;

        explanation  = "Ranges refer to the set of values that can be represented by a particular data type or number system.\nIn computer programming, ranges are often used to determine the valid input values for a variable or to define the limits of a computation.";
        explanation2 = "To Calculate The Range of a Sign+Magnitude Representation we must to the following :";
        explanation3 = "Determine the number of bits used to represent the value. \n 4-bits";
        explanation4 = "Calculate the minimum and maximum values. \n+/- 4 2 1\n1   1 1 1 = -7\n0   1 1 1 = +7";
        
        JOptionPane.showMessageDialog(null, explanation, "Sign+Magnitude Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation2, "Sign+Magnitude Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation3, "Sign+Magnitude Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation4, "Sign+Magnitude Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
        while (true) {
            // Read decimal input from the user
            String input = JOptionPane.showInputDialog(null, "Enter The Number of Bits in the Representation :");

            if (input == null || input.equalsIgnoreCase("q")) {
            JOptionPane.showMessageDialog(null, "Operation Cancelled");
            break;
            }

            // Convert input string to integer
            int bits;
            try {
            bits = Integer.parseInt(input);
            }   catch (NumberFormatException e) { 
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
            continue;
            }
            // Calculate the maximum and minimum values
            int maxValue = (int) Math.pow(2, bits - 1) - 1;  // maximum value is 2^(bits - 1) - 1
            int minValue = -(int) Math.pow(2, bits - 1) + 1; // minimum value is -(2^(bits - 1)) + 1
            
            JOptionPane.showMessageDialog(null, "Range of values in " + bits + "-bit Sign+Magnitude: \nMinimum value: "+ minValue + "\nMaximum value: "+ maxValue);
        }
    }
}

// Kayel Calleja