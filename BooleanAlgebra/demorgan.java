package BooleanAlgebra;
import javax.swing.*;

public class demorgan {
    public static void main (String[] args){
        String statement, exampleOR, explanationOR, explanationAND, exampleAND;
        
        statement = "DeMorgan's Theorems describe the equivalence between gates with inverted inputs and gates with inverted outputs.";

        explanationOR = "Two separate terms NOR'ed together is the same as the two terms inverted(Complemented) and AND'ed";
        exampleOR = "(NOT A+B) = (NOT A) . (NOT B)";

        explanationAND = "Two separate terms NAND'ed together is the same as the two terms inverted(Complemented) and OR'ed";
        exampleAND = "(NOT A.B) = (NOT A) + (NOT B)";

        JOptionPane.showMessageDialog(null, statement, "De Morgan's Law", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanationOR, "De Morgan's Law - OR Operation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, exampleOR, "De Morgan's Law - OR Operation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, explanationAND, "De Morgan's Law - AND Operation", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, exampleAND, "De Morgan's Law - AND Operation", JOptionPane.INFORMATION_MESSAGE);
    }
}
