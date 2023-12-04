package BooleanAlgebra;
import javax.swing.*;

public class indepotent {
    public static void main (String[] args){
        String statement, example;
        
        statement = "An input that is AND'ed or OR'ed with itself is that input";
        example = "A + A = A\n A . A = A";

        JOptionPane.showMessageDialog(null, statement, "Idepotent Law", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, example, "Idepotent Law", JOptionPane.INFORMATION_MESSAGE);
    }
}