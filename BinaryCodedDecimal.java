import javax.swing.*;

public class BinaryCodedDecimal {
    public static void main (String[] args){
        String explanation, explanation2, explanation3, explanation4;

        explanation  = "BCD stands for Binary-Coded Decimal, which is a way of representing decimal digits using a binary code.\nIn BCD, each decimal digit is represented by a four-bit binary code, which can take on values from 0000 to 1001.";
        explanation2 = "For example, the decimal number 57 would be represented in BCD as 0101 0111,\nwhere the first four bits (0101) represent the digit 5 and the second four bits (0111) represent the digit 7.";
        explanation3 = "BCD is based on the idea of representing each decimal digit as a binary number.\nSince there are 10 possible values for a decimal digit (0-9), it requires four bits to represent each digit, because four bits can represent 16 possible values.\nTherefore, in BCD, each decimal digit is represented by a unique four-bit code, with no overlap between codes.";
        explanation4 = "One potential drawback of BCD is that it requires more storage space than traditional binary representation.\nFor example, a 16-bit binary number can represent values up to 65535, while a 16-bit BCD number can only represent values up to 9999.\nHowever, for applications that require precise decimal arithmetic or easy human readability, BCD can be a useful encoding scheme.";

        JOptionPane.showMessageDialog(null, explanation, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation2, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation3, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanation4, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);

        while (true) {
            // Read decimal input from the user
            String input = JOptionPane.showInputDialog(null, "Please Enter an Integer:");

            if (input == null || input.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, "Operation Cancelled");
                break;
            }

            // Convert input string to integer
            int decimal;
            try {
                decimal = Integer.parseInt(input);
            } catch (NumberFormatException e) { 
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                continue;
            }

            // Convert decimal to BCD and display the result
            String bcd = decimalToBCD(decimal);
            JOptionPane.showMessageDialog(null, "BCD binary value: " + bcd);
        } 
    }
            public static String decimalToBCD(int decimal){
                StringBuilder bcd = new StringBuilder();
         
                while (decimal > 0){
                int digit = decimal % 10;
                String binary = String.format("%04d", Integer.parseInt(Integer.toBinaryString(digit)));
                bcd.insert(0, binary);
                decimal /= 10;
            }
                // Split the BCD representation into groups of four digits
                for (int i = bcd.length() - 4; i > 0; i -= 4) {
                bcd.insert(i," ");
         }
                return bcd.toString();   
    }
}
// Kayel Calleja

//        //  ######### LOOP EXPLANATION ######### \\
//          initialization: int i = bcd.length() -4; it sets a counter variable i to the index of the fourth-last character in the string.
//          Condition: i >0; this is checked before each iteration fo the loop as long as i is greater than 0 the lopp will continue to execute. this ensures that the spaces are only added at the beginning of the string.
//          Iteration i -= 4; This is the code that is executed after each iteration of the loop. In this case, we are decrementing i by 4 so that we skip over the previous group of four digits and move to the next group of four digits in the BCD representation. 
//        \\  ######### LOOP EXPLANATION #########  //     
