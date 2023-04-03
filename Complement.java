import javax.swing.*;
public class Complement {
    public static void main (String[] args){
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
            String input = JOptionPane.showInputDialog("Enter the first integer");

            if (input == null || input.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, "Operation Cancelled"); // to avoid crashing when cancelling
                break;
            }
            int decimal;
            try{
                decimal = Integer.parseInt(input);
            }catch (NumberFormatException e) { 
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                continue;
            }
            String input2 = JOptionPane.showInputDialog("Enter the second integer");

            if (input2 == null || input.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, "Operation Cancelled"); // to avoid crashing when cancelling
                break;
            }
            int decimal2;
            try{
                decimal2 = Integer.parseInt(input2);
            }catch (NumberFormatException e) { 
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                continue;
            }
            String binaryNum1 = Integer.toBinaryString(decimal & 0xFF);
            String binaryNum2 = Integer.toBinaryString(decimal2 & 0xFF);

            binaryNum1 = String.format("%8s", binaryNum1).replace(' ', '0');
            binaryNum2 = String.format("%8s", binaryNum2).replace(' ', '0');

            JOptionPane.showMessageDialog(null, "Binary representation of " + decimal + " is " + binaryNum1);
            JOptionPane.showMessageDialog(null, "Binary representation of " + decimal2 + " is " + binaryNum2);
            
            int sum = decimal + decimal2;
            String binarySum = String.format("%8s", Integer.toBinaryString(sum & 0xFF)).replace(' ', '0');
            JOptionPane.showMessageDialog(null, "Binary representation of the sum of " + decimal + " and " + decimal2 + " is " + binarySum);
        }
    }
}
