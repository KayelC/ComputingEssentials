import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Nested extends JFrame implements ActionListener{
    private JButton outerC;
    private SubMenuOC subMenuOC;

    public Nested() {
        super("Main Menu");

        outerC = new JButton("Outer Class");
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
        private SubMenuIC subMenuIC;

        public SubMenuOC() {
            super("Outer Class Menu");

            innerC = new JButton("Inner Class");
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
                subMenuIC = new SubMenuIC();
                subMenuIC.setVisible(true);
            }
        }

        class SubMenuIC extends JFrame implements ActionListener{
            private JButton button1;
            public SubMenuIC() {
                super("Inner Class Menu");

                button1 = new JButton("2's Complement");
                button1.addActionListener(this);

                JPanel buttonPanel = new JPanel(new GridLayout(3, 2, 10, 5));
                buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 7, 5,7));
                buttonPanel.add(button1);

                getContentPane().setLayout(new BorderLayout());
                getContentPane().add(buttonPanel, BorderLayout.CENTER);

                setSize(400, 140);
                setLocationRelativeTo(null);                
            }

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1) {
                    JOptionPane.showMessageDialog(null,"test");
                }
            }
        }
    }

    public static void main(String[] args){
        Nested mainMenu = new Nested();
        mainMenu.setVisible(true);
    }
}