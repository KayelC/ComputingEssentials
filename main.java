import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main extends JFrame implements ActionListener{
    
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public main() {
        super("Main Menu");
        
        // Create buttons
        button1 = new JButton("Unsigned Integers");
        button2 = new JButton("Sign+Magnitude");
        button3 = new JButton("2's Complement");

        // Set action listeners for buttons
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        // Add buttons to the frame
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);
        
        // Set frame properties
        setSize(300, 110);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            us();
        } else if (e.getSource() == button2) {
            sm();
        } else if (e.getSource()== button3) {
            c();
        }
    }
        private void sm(){
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
        private void us(){
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
        private void c(){
            String explanation, explanation2, explanation3, explanation4;

            explanation = "2's complement is a way of representing signed integers in binary form.\n It is based on the idea of complementing a number,\n which means finding its opposite value, and adding one to it.";
            explanation2 = "To represent a negative number in 2's complement,\n you take the binary representation of its absolute value (positive equivalent),\n invert all the bits (change 1s to 0s and 0s to 1s), and then add one to the result.\n The resulting binary number represents the negative value of the original number.";
            explanation3 = "In 2's complement, the leftmost bit is used to indicate the sign of the number.\n If the leftmost bit is 1, the number is negative, and if it's 0, the number is positive.";
            explanation4 = "2's complement allows the computer to perform arithmetic operations such as addition,\n subtraction, and multiplication on both positive and negative numbers using the same circuitry.";
    
            JOptionPane.showMessageDialog(null, explanation, "2's Complement Explanation", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, explanation2, "2's Complement Explanation", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, explanation3, "2's Complement Explanation", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, explanation4, "2's Complement Explanation", JOptionPane.INFORMATION_MESSAGE);
            
            while (true) {
                String input = JOptionPane.showInputDialog("Enter an integer within the range of -128 to 127");
                
                if (input == null || input.equalsIgnoreCase("q")) {
                    JOptionPane.showMessageDialog(null, "Operation Cancelled"); // to avoid crashing when cancelling
                    break;
                }
                byte decimal;
                try {
                    decimal = Byte.parseByte(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid Input.\nPlease enter an appropriate Integer.");
                    continue;
                }
                String input2 = JOptionPane.showInputDialog("Enter an integer within the range of -128 to 127");
                
                if (input2 == null || input.equalsIgnoreCase("q")) {
                    JOptionPane.showMessageDialog(null, "Operation Cancelled"); // to avoid crashing when cancelling
                    break;
                }
                byte decimal2;
                try {
                    decimal2 = Byte.parseByte(input2);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid Input.\nPlease enter an appropriate Integer.");
                    continue;
                }
                int sum = decimal + decimal2;
                boolean overflow = sum > 127 || sum < -128;
                if (overflow) {
                    JOptionPane.showMessageDialog(null, "Overflow error: the result is out of range.");
                    continue;
                } else {
                    String binaryNum1 = String.format("%8s", Integer.toBinaryString(decimal & 0xFF)).replace(' ', '0');
                    String binaryNum2 = String.format("%8s", Integer.toBinaryString(decimal2 & 0xFF)).replace(' ', '0');
            
                    String binarySum = Integer.toBinaryString(sum & 0xFF);
                    binarySum = String.format("%8s", binarySum).replace(' ', '0');
            
                    JOptionPane.showMessageDialog(null, "Binary representation of " + decimal + " is " + binaryNum1);
                    JOptionPane.showMessageDialog(null, "Binary representation of " + decimal2 + " is " + binaryNum2);
            
                    JOptionPane.showMessageDialog(null, "Binary representation of the sum of " + decimal + " and " + decimal2 + " is " + binarySum);
                }
            }
        }
        
        public static void main (String[] args){
            main menu = new main();
            menu.setVisible(true);
            
        }
}