import java.util.*;
public class ComplementConsole {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        String NumInput;
        NumInput = "Please enter an integer: ";
        
        System.out.println(NumInput);
        int num1 = input.nextInt();
        System.out.println(NumInput);
        int num2 = input.nextInt();

        // convert decimal numbers to binary using two's complement
        String binaryNum1 = Integer.toBinaryString(num1 & 0xFF);
        String binaryNum2 = Integer.toBinaryString(num2 & 0xFF);
        
        // 0 padding
        binaryNum1 = String.format("%8s", binaryNum1).replace(' ', '0');
        binaryNum2 = String.format("%8s", binaryNum2).replace(' ', '0');

        // print out the binary representations
        System.out.println("Binary representation of " + num1 + " is " + binaryNum1);
        System.out.println("Binary representation of " + num2 + " is " + binaryNum2);

        // perform addition using binary numbers
        int sum = num1 + num2;

        // 0 padding
        String binarySum = String.format("%8s", Integer.toBinaryString(sum & 0xFF)).replace(' ', '0');

        // print out the binary representation of the sum
        System.out.println("Binary representation of the sum of " + num1 + " and " + num2 + " is " + binarySum);
    }
}
