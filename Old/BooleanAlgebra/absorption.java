package BooleanAlgebra;
import javax.swing.*;

public class absorption {
    public static void main (String[] args){

    String statement, exampleOR, exampleAND;
        
    statement = "Absorption Law enables a reduction in a complicated expression to a simpler one by absorbing like terms.";

    exampleOR = "A + (A . B) = (A . 1) + (A . B) = A (1 . B ) = A";

    exampleAND = "A (A + B) = (A + 0) . (A + B) = A + (0 . B) = A";

    JOptionPane.showMessageDialog(null, statement, "Absorption Law", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, exampleOR, "Absorption Law - OR Operation", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, exampleAND, "Absorption Law - AND Operation", JOptionPane.INFORMATION_MESSAGE);
}
}
