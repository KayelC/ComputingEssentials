import javax.swing.*;

class UnsignedIntegers {
    public static void main(String Args[]) {
        String explanation, explanation2, explanation3; // What to present in the Dialog Boxes

        explanation = "Unsigned registers are a type of computer hardware component that can store only non-negative integers.";
        explanation2 = "In other words, they are registers that can only hold values greater than or equal to zero.";
        explanation3 = "The term 'unsigned' refers to the fact that the register does not have a sign bit, which means that it cannot represent negative numbers.";

        JOptionPane.showMessageDialog(null, explanation, "Unsigned Integers Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation2, "Unsigned Integers Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation3, "Unsigned Integers Explanation", JOptionPane.INFORMATION_MESSAGE);

        while (true) {
            String input = JOptionPane.showInputDialog("Please enter an unsigned integer within the range of 0 - 255:"); // User Input Prompt
            if (input == null || input.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, "Operation Cancelled"); // To avoid crashing when cancelling
                break;
            }

            long value;
            try { //to avoid crashing when inputting an incorrect value
                value = Long.parseUnsignedLong(input); // User Input ; // parsing allows the conversion of a string into another variable.
            } catch (NumberFormatException e) { //'e' exception object 
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                continue;
            }
            String binary = String.format("%8s", Long.toBinaryString(value)).replace(' ', '0'); // to represent output with 8 digits always, regardless of the necessary bits. (always 8-bit word)
            JOptionPane.showMessageDialog(null, "Binary: " + binary + "\nDecimal: " + value + "\nHexadecimal: " + Long.toHexString(value));
        }
    }
}

// Kayel Calleja

