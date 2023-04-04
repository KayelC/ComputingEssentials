import java.util.Scanner;

public class SignAndMagnitudeRangeConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the number of bits
        System.out.print("Enter the number of bits: ");
        int numBits = input.nextInt();
        
        // Calculate the maximum and minimum values
        int maxVal = (int) Math.pow(2, numBits - 1) - 1;  // maximum value is 2^(numBits - 1) - 1
        int minVal = -(int) Math.pow(2, numBits - 1) + 1; // minimum value is -(2^(numBits - 1)) + 1
        
        // Display the range
        System.out.println("In Sign and Magnitude representation, " + numBits + "-bit integers have a range of " + minVal + " to " + maxVal);
    }
}

// Kayel Calleja