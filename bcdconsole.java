import java.util.Scanner;

public class bcdconsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal value: ");
        int decimal = scanner.nextInt();
        String bcd = decimalToBCD(decimal);
        System.out.println("BCD binary value: " + bcd);
    }

    public static String decimalToBCD(int decimal) {
        StringBuilder bcd = new StringBuilder();
        while (decimal > 0) {
            int digit = decimal % 10;
            String binary = String.format("%04d", Integer.parseInt(Integer.toBinaryString(digit)));
            bcd.insert(0, binary);
            decimal /= 10;
        }
        return bcd.toString();
    }

}

// Kayel Calleja