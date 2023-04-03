package Debug;
import java.util.Scanner;

public class SignMagnitudeIntegersConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read decimal input from the user
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        // Determine the sign and magnitude of the number
        int sign = (decimal < 0) ? 1 : 0;
        int magnitude = Math.abs(decimal);

        // Convert magnitude to binary string
        String binary = Integer.toBinaryString(magnitude);

        // Pad binary string with leading zeros to ensure it has 8 bits
        binary = String.format("%7s", binary).replace(' ', '0');

        // Output the sign and binary representation of magnitude
        System.out.printf("Sign-Magnitude: %d%s%n", sign, binary);
    }
}
