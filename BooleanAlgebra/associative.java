package BooleanAlgebra;
import javax.swing.*;

public class associative {
    public static void main (String[] args){

        String statement, exampleOR, exampleAND;
            
        statement = "Associative law allows the removal of brackets from an expression and regrouping of the variables";
    
        exampleOR = "A + (B + C) = (A + B) + C = A + B + C";
    
        exampleAND = "A (B . C) = (A . B) C = A . B . C ";
    
        JOptionPane.showMessageDialog(null, statement, "Associative Law", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, exampleOR, "Associative Law - OR Operation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, exampleAND, "Associative Law - AND Operation", JOptionPane.INFORMATION_MESSAGE);
    }
}
