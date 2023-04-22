package BooleanAlgebra;
import javax.swing.*;

public class doublenegation {
    public static void main (String[] args){
        String statement, example;

        statement = "A term that is inverted twice is equal to the original term";
        example = "//A = A\n NOT(/A) = A";

        JOptionPane.showMessageDialog(null, statement, "Double Negation Law", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, example, "Double Negation Law", JOptionPane.INFORMATION_MESSAGE);
    }
}
