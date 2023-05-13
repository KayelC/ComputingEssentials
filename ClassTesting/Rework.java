import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rework extends JFrame implements ActionListener{
    private JButton outerC;
    private SubMenuOC subMenuOC;

    public Rework() {
        super("Main Menu");

        outerC = new JButton("Binary Systems");
        outerC.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 1, 10, 5));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5, 7));
        buttonPanel.add(outerC);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(buttonPanel, BorderLayout.CENTER);

        setSize(400, 140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == outerC) {
            subMenuOC = new SubMenuOC();
            subMenuOC.setVisible(true);
        }
    }

    class SubMenuOC extends JFrame implements ActionListener{
        private JButton innerC;
        private SubMenuBCD subMenuBCD;

        public SubMenuOC() {
            super("Binary System Menu");

            innerC = new JButton("Binary Coded Decimal");
            innerC.addActionListener(this);

            JPanel buttonPanel = new JPanel(new GridLayout(3, 2, 10, 5));
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
            buttonPanel.add(innerC);

            getContentPane().setLayout(new BorderLayout());
            getContentPane().add(buttonPanel, BorderLayout.CENTER);

            setSize(400, 140);
            setLocationRelativeTo(null);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == innerC) {
                subMenuBCD = new SubMenuBCD();
                subMenuBCD.setVisible(true);
            }
        }

        class SubMenuBCD extends JFrame implements ActionListener{
            private JButton explanation;
            private JButton checkint;
            private JButton worksheet;
            private JButton addition;
            public SubMenuBCD() {
                super("Binary Coded Decimal Menu");

                explanation = new JButton("Explanation");
                explanation.addActionListener(this);

                checkint = new JButton("Check Integer");
                checkint.addActionListener(this);

                worksheet = new JButton("Examples To Work Out");
                worksheet.addActionListener(this);
                
                addition = new JButton("Addition");
                addition.addActionListener(this);

                JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 5));
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                buttonPanel.add(explanation);
                buttonPanel.add(checkint);
                buttonPanel.add(worksheet);
                buttonPanel.add(addition);

                getContentPane().setLayout(new BorderLayout());
                getContentPane().add(buttonPanel, BorderLayout.CENTER);

                setSize(400, 140);
                setLocationRelativeTo(null);                
            }

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == explanation) {
                    String explanation, explanation2, explanation3, explanation4;

                explanation  = "BCD stands for Binary-Coded Decimal, which is a way of representing decimal digits using a binary code.\nIn BCD, each decimal digit is represented by a four-bit binary code, which can take on values from 0000 to 1001.";
                explanation2 = "For example, the decimal number 57 would be represented in BCD as 0101 0111,\nwhere the first four bits (0101) represent the digit 5 and the second four bits (0111) represent the digit 7.";
                explanation3 = "BCD is based on the idea of representing each decimal digit as a binary number.\nSince there are 10 possible values for a decimal digit (0-9), it requires four bits to represent each digit, because four bits can represent 16 possible values.\nTherefore, in BCD, each decimal digit is represented by a unique four-bit code, with no overlap between codes.";
                explanation4 = "One potential drawback of BCD is that it requires more storage space than traditional binary representation.\nFor example, a 16-bit binary number can represent values up to 65535, while a 16-bit BCD number can only represent values up to 9999.\nHowever, for applications that require precise decimal arithmetic or easy human readability, BCD can be a useful encoding scheme.";

                JOptionPane.showMessageDialog(null, explanation, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, explanation2, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, explanation3, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, explanation4, "Binary Coded Decimal Explanation", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (e.getSource() == checkint) { 
                    while (true) {
                        // Read decimal input from the user
                        String input = JOptionPane.showInputDialog(null, "Please Enter an Integer:");
            
                        if (input == null || input.equalsIgnoreCase("q")) {
                            JOptionPane.showMessageDialog(null, "Operation Cancelled");
                            break;
                        }
            
                        // Convert input string to integer
                        int decimal;
                        try {
                            decimal = Integer.parseInt(input);
                        } catch (NumberFormatException f) { 
                            JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                            continue;
                        }
            
                        // Convert decimal to BCD and display the result
                        String bcd = decimalToBCD(decimal);
                        JOptionPane.showMessageDialog(null, "BCD binary value: " + bcd);
                    }
                }
                else if (e.getSource() == worksheet) {
                    runWorksheetBcd();
                }
                else if (e.getSource() == addition) {
                    performAddition();
                }
            }
            public static void performAddition() {
                while (true) {
                    String input1 = JOptionPane.showInputDialog(null, "Please Enter the First Integer:");
    
                    if (input1 == null || input1.equalsIgnoreCase("q")) {
                        JOptionPane.showMessageDialog(null, "Operation Cancelled");
                        break;
                    }
    
                    // Convert the first input string to an integer
                    int firstInt;
                    try {
                        firstInt = Integer.parseInt(input1);
                     } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                        continue;
                    }
    
                    // Prompt the user to enter the second integer
                    String input2 = JOptionPane.showInputDialog(null, "Please Enter the Second Integer:");
    
                    if (input2 == null || input2.equalsIgnoreCase("q")) {
                        JOptionPane.showMessageDialog(null, "Operation Cancelled");
                        break;
                    }
    
                    // Convert the second input string to an integer
                    int secondInt;
                    try {
                        secondInt = Integer.parseInt(input2);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer.");
                        continue;
                    }
    
                    // Perform BCD addition
                    int sum = firstInt + secondInt;
    
                    // Convert decimal sum to BCD and display the result
                    String bcd2 = decimalToBCD(sum);
                    String bcd3 = decimalToBCD(firstInt);
                    String bcd4 = decimalToBCD(secondInt);

                    JOptionPane.showMessageDialog(null, "BCD value of first integer: " + bcd3);
                    JOptionPane.showMessageDialog(null, "BCD value of second integer: " + bcd4);
                    JOptionPane.showMessageDialog(null, "BCD binary value of sum: " + bcd2);
                }
            }

                public static void runWorksheetBcd() {
                    performQ1(); // +6 Rule Explanation
                    performQ2(); // E.g 2
                    performQ3(); // No Overlap Explanation
                }
                
                public static void performQ1() {
                    JOptionPane.showMessageDialog(null, "Perform 50 + 50 in BCD:");
                
                    int firstInt = 50;
                    int secondInt = 50;
                
                    // Perform BCD addition
                    int sum = firstInt + secondInt;
                
                    // Convert decimal sum to BCD and display the result
                    String bcd2 = decimalToBCD(sum);
                    String bcd3 = decimalToBCD(firstInt);
                    String bcd4 = decimalToBCD(secondInt);

                    JOptionPane.showMessageDialog(null, "BCD value of first integer: " + bcd3);
                    JOptionPane.showMessageDialog(null, "BCD value of second integer: " + bcd4);
                    JOptionPane.showMessageDialog(null, "BCD binary value of sum: " + bcd2);
                }
                
                public static void performQ2() {
                    JOptionPane.showMessageDialog(null, "Perform 62 + 44 in BCD:");
                
                    int firstInt = 62;
                    int secondInt = 44;
                
                    // Perform BCD addition
                    int sum = firstInt + secondInt;
                
                    // Convert decimal sum to BCD and display the result
                    String bcd2 = decimalToBCD(sum);
                    String bcd3 = decimalToBCD(firstInt);
                    String bcd4 = decimalToBCD(secondInt);

                    JOptionPane.showMessageDialog(null, "BCD value of first integer: " + bcd3);
                    JOptionPane.showMessageDialog(null, "BCD value of second integer: " + bcd4);
                    JOptionPane.showMessageDialog(null, "BCD binary value of sum: " + bcd2);
                }
                
                public static void performQ3() {
                    JOptionPane.showMessageDialog(null, "Perform 77 + 56 in BCD:");
                
                    int firstInt = 77;
                    int secondInt = 56;
                
                    // Perform BCD addition
                    int sum = firstInt + secondInt;
                
                    // Convert decimal sum to BCD and display the result
                    String bcd2 = decimalToBCD(sum);
                    String bcd3 = decimalToBCD(firstInt);
                    String bcd4 = decimalToBCD(secondInt);

                    JOptionPane.showMessageDialog(null, "BCD value of first integer: " + bcd3);
                    JOptionPane.showMessageDialog(null, "BCD value of second integer: " + bcd4);
                    JOptionPane.showMessageDialog(null, "BCD value of sum: " + bcd2);
                }
                public static String decimalToBCD(int decimal){
                    StringBuilder bcd = new StringBuilder();
                
                    while (decimal > 0){
                        int digit = decimal % 10;
                        String binary = String.format("%04d", Integer.parseInt(Integer.toBinaryString(digit)));
                        bcd.insert(0, binary);
                        decimal /= 10;
                    }
                
                    // Split the BCD representation into groups of four digits
                    for (int i = bcd.length() - 4; i > 0; i -= 4) {
                        bcd.insert(i," ");
                    }
                
                    return bcd.toString();
                }   
            }
                        public static String decimalToBCD(int decimal){
                            StringBuilder bcd = new StringBuilder();
                     
                            while (decimal > 0){
                            int digit = decimal % 10;
                            String binary = String.format("%04d", Integer.parseInt(Integer.toBinaryString(digit)));
                            bcd.insert(0, binary);
                            decimal /= 10;
                        }
                            // Split the BCD representation into groups of four digits
                            for (int i = bcd.length() - 4; i > 0; i -= 4) {
                            bcd.insert(i," ");
                     }
                            return bcd.toString();   
                }
            }
            
        
    

    public static void main(String[] args){
        Rework mainMenu = new Rework();
        mainMenu.setVisible(true);
    }
}