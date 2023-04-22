package BooleanAlgebra;
import javax.swing.*;

public class distributive {
    public static void main (String[] args){
        String statement, exampleOR, exampleAND;
        
        statement = "Distributive Law permits the multiplying or factoring out of an expression.";

        exampleOR = "A(B + C) = A . B + A . C";

        exampleAND = "A+(B . C) = (A + B) . (A + C)";

        JOptionPane.showMessageDialog(null, statement, "Distributive Law", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, exampleOR, "Distributive Law - OR Operation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, exampleAND, "Distributive Law - AND Operation", JOptionPane.INFORMATION_MESSAGE);
    }
}
