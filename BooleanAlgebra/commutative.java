package BooleanAlgebra;
import javax.swing.*;

public class commutative {
    public static void main (String[] args){
        String statement, example;

        statement = "The order of application of two separate terms is not important";
        example = "A . B = B . A\n A + B = B + A";

        JOptionPane.showMessageDialog(null, statement, "Commutative Law", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, example, "Commutative Law", JOptionPane.INFORMATION_MESSAGE);
    }
}