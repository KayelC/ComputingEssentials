import java.util.*;

public class ComplementRangeConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter The Number of Bits in the Representation : ");
        int bits = input.nextInt(); // number of bits in the 2's complement representation
        int minValue = -(1 << (bits - 1)); // minimum value that can be represented << is a left shift operator shifting it by 1 in this case.
        int maxValue = (1 << (bits - 1)) - 1; // maximum value that can be represented
        System.out.println("Range of values in " + bits + "-bit 2's complement:");
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}

// Kayel Calleja