package BooleanAlgebra;
import javax.swing.*;

public class complement {
    public static void main (String[] args){
        String statement, explanationOR, exampleOR, explanationAND,  exampleAND; 
        
        statement = "The Complement is the inverse of a variable and is indicated by a bar over the variable as /Variable or in brackets as (NOT Variable)";

        // OR GATE
        explanationOR = "A term OR'ed with its complement equals '1'";
        exampleOR = "A + (NOT A) = 1";

        // AND GATE
        explanationAND = "A term AND'ed with its complement equals '0'";
        exampleAND = "A . (NOT A) = 0";

        JOptionPane.showMessageDialog(null, statement, "Complement Law", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, explanationOR, "Complement Law - OR Operator", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, exampleOR, "Complement Law - OR Operator", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, explanationAND, "Complement Law - AND Operator", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, exampleAND, "Complement Law - AND Operator", JOptionPane.INFORMATION_MESSAGE);
    }
}
