package Worksheets;
import javax.swing.*;
import javax.xml.namespace.QName;

import java.awt.*;
import java.awt.event.*;

public class worksheetbcd {
    public static void main(String[] args) { 
        performQ1(); // +6 Rule Explanation
        performQ2(); // E.g 2
        performQ3(); // No Overlap Explanation
    }
    public static void performQ1() {
        while (true) {
            JOptionPane.showMessageDialog(null, "Perform 50 + 50 in BCD:");


            int firstInt = 50;
            int secondInt = 50;

            // Perform BCD addition
            int sum = firstInt + secondInt;

            // Convert decimal sum to BCD and display the result
            String bcd2 = decimalToBCD(sum);
            JOptionPane.showMessageDialog(null, "BCD binary value of sum: " + bcd2);
            break;
        }
    }

    public static void performQ2() {
        while (true) {
            JOptionPane.showMessageDialog(null, "Perform 62 + 44 in BCD:");


            int firstInt = 62;
            int secondInt = 44;

            // Perform BCD addition
            int sum = firstInt + secondInt;

            // Convert decimal sum to BCD and display the result
            String bcd2 = decimalToBCD(sum);
            JOptionPane.showMessageDialog(null, "BCD binary value of sum: " + bcd2);
            break;
        }
    }

    public static void performQ3() {
        while (true) {
            JOptionPane.showMessageDialog(null, "Perform 77 + 56 in BCD:");


            int firstInt = 77;
            int secondInt = 56;

            // Perform BCD addition
            int sum = firstInt + secondInt;

            // Convert decimal sum to BCD and display the result
            String bcd2 = decimalToBCD(sum);
            JOptionPane.showMessageDialog(null, "BCD binary value of sum: " + bcd2);
            break;
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

