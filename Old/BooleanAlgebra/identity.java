package BooleanAlgebra;
import javax.swing.*;

public class identity {
    public static void main (String[] args){
        String statement, explanationOR, exampleOR, explanationAND,  exampleAND; 
        
        statement = "If a statement has been determined to be true, then the statement is true.";

        // OR GATE
        explanationOR = "The OR operation with a 'true' or '1' value results in a 'true' or '1', and the OR operation with a 'false' or '0' value results in the original value";
        exampleOR = "A + 1 = 1 (Nullification Law)\nA + 0 = A";

        // AND GATE
        explanationAND = "The AND operation with a 'true' or '1' value results in the original value, and the AND operation with a 'false' or '0' value results in 'false' or '0'";
        exampleAND = "A . 1 = A\nA . 0 = 0 (Nullification Law)";

        JOptionPane.showMessageDialog(null, statement, "Identity Law", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, explanationOR, "Identity Law - OR Operator", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, exampleOR, "Identity Law - OR Operator", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, explanationAND, "Identity Law - AND Operator", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, exampleAND, "Identity Law - AND Operator", JOptionPane.INFORMATION_MESSAGE);
    }
}
