import javax.swing.*;;
public class ComplementRange {
    public static void main (String[] args){
        String explanation, explanation2, explanation3, explanation4, explanation5, explanation6;

        explanation  = "Ranges refer to the set of values that can be represented by a particular data type or number system.\nIn computer programming, ranges are often used to determine the valid input values for a variable or to define the limits of a computation.";
        explanation2 = "To Calculate The Range of a 2's Complement Representation we must to the following :";
        explanation3 = "Step 1 : Calculate 2 to the power of the number of bits you have. \n2^8 = 256";
        explanation4 = "Step 2 : Find the negative range by halving the answer. \n 256/2 = 128";
        explanation5 = "Step 3 : This means we have the range of: \n-128 to +128";
        explanation6 = "Step 4 : We need to take account the number 0 in our calculation, simply subtract 1 from the positive side.\n Our new answer is : -128 to +127";

        JOptionPane.showMessageDialog(null, explanation, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation2, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation3, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation4, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation5, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation6, "2's Complement Ranges Explanation", JOptionPane.INFORMATION_MESSAGE);

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

            int minValue = -(1 << (bits - 1)); // minimum value that can be represented 
            int maxValue = (1 << (bits - 1)) - 1; // maximum value that can be represented

            JOptionPane.showMessageDialog(null, "Range of values in " + bits + "-bit 2's complement: \nMinimum value: "+ minValue + "\nMaximum value: "+ maxValue);
        } 
    }
}

// Kayel Calleja

// << is a left shift operator shifting it by 1 in this case.