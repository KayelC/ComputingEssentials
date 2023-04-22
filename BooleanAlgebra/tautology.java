package BooleanAlgebra;

import javax.swing.*;

public class tautology {
    public static void main (String[] args){
        String[] messages = {
            "While not Boolean Laws in their own right, these are a set of Mathematical Laws which can be used in the simplification of Boolean Expressions.",
            "0 . 0 = 0\nA 0 AND'ed with itself is always equal to 0",
            "1 . 1 = 1\nA 1 AND'ed with itself is always equal to 1",
            "1 . 0 = 0\nA 1 AND'ED with a 0 is equal to 0",
            "0 + 0 = 0\nA 0 OR'ed with itself is always equal to 0",
            "1 + 1 = 1\nA 1 OR'ed with itself is always equal to 1",
            "1 + 0 = 1\nA 1 OR'ed with a 0 is equal to 1",
            "/1 = 0\nThe Inverse(Complement) of a 1 is always equal to 0",
            "/0 = 1\nThe Inverse(Complement) of a 0 is always equal to 1"
    };
    String title = "Tautology";
    int index = 0;
    while (index < messages.length) {
        int option = JOptionPane.showOptionDialog(null, messages[index], title, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"🡢", "🡠"}, "Next");
        if (option == JOptionPane.CLOSED_OPTION) {
            // User closed the dialog, exit the loop
            break;
        } else if (option == 0) {
            index++;
        } else if (option == 1 && index > 0) {
            index--;
        }
    }
}
}
   

//String statement, t1, t2, t3, t4, t5, t6, t7, t8;

//statement = "While not Boolean Laws in their own right, these are a set of Mathematical Laws which can be used in the simplification of Boolean Expressions.";
//t1 = "0 . 0 = 0\nA 0 AND'ed with itself is always equal to 0";
//t2 = "1 . 1 = 1\nA 1 AND'ed with itself is always equal to 1";
//t3 = "1 . 0 = 0\nA 1 AND'ED with a 0 is equal to 0";
//t4 = "0 + 0 = 0\nA 0 OR'ed with itself is always equal to 0";
//t5 = "1 + 1 = 1\nA 1 OR'ed with itself is always equal to 1";
//t6 = "1 + 0 = 1\nA 1 OR'ed with a 0 is equal to 1";
//t7 = "/1 = 0\nThe Inverse(Complement) of a 1 is always equal to 0";
//t8 = "/0 = 1\nThe Inverse(Complement) of a 0 is always equal to 1";

//JOptionPane.showMessageDialog(null, statement, "Tautology", JOptionPane.INFORMATION_MESSAGE);
//JOptionPane.showMessageDialog(null, t1, "Tautology - 1", JOptionPane.INFORMATION_MESSAGE);
//JOptionPane.showMessageDialog(null, t2, "Tautology - 2", JOptionPane.INFORMATION_MESSAGE);
//JOptionPane.showMessageDialog(null, t3, "Tautology - 3", JOptionPane.INFORMATION_MESSAGE);
//JOptionPane.showMessageDialog(null, t4, "Tautology - 4", JOptionPane.INFORMATION_MESSAGE);
//JOptionPane.showMessageDialog(null, t5, "Tautology - 5", JOptionPane.INFORMATION_MESSAGE);
//JOptionPane.showMessageDialog(null, t6, "Tautology - 6", JOptionPane.INFORMATION_MESSAGE);
//JOptionPane.showMessageDialog(null, t7, "Tautology - 7", JOptionPane.INFORMATION_MESSAGE);
//JOptionPane.showMessageDialog(null, t8, "Tautology - 8", JOptionPane.INFORMATION_MESSAGE);