import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Exam11 {


    public Exam11() {
        JFrame frame = new JFrame("Calculator");
        String num[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#" };
        JPanel numberPanel = new JPanel(new GridLayout(4, 3, 2, 5));

        for (String s : num) {
            numberPanel.add(new JButton(s));
        }

        String ops[] = { "+", "-", "x", "/", ".", "%" };
        JPanel operatorPanel = new JPanel(new GridLayout(2, 3, 3, 5));

        for (String op : ops) {
            operatorPanel.add(new JButton(op));
        }

        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        JTextField n1 = new JTextField();
        JTextField n2 = new JTextField();
        JTextField result = new JTextField();

        inputPanel.add(new JLabel("Number 1"));
        inputPanel.add(n1);
        inputPanel.add(new JLabel("Number 2"));
        inputPanel.add(n2);
        inputPanel.add(new JLabel("Result"));
        inputPanel.add(result);


        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));
        centerPanel.add(inputPanel, BorderLayout.CENTER);
        centerPanel.add(operatorPanel, BorderLayout.EAST);


        centerPanel.setBorder(new EmptyBorder(10, 10, 120, 10));


        JButton equalButton = new JButton("=");


        JPanel equalPanel = new JPanel(new BorderLayout());
        equalPanel.add(equalButton, BorderLayout.CENTER);
        equalPanel.setBorder(new EmptyBorder(20, 20, 20, 20)); 


        frame.setLayout(new BorderLayout(10, 10));
        frame.add(numberPanel, BorderLayout.NORTH);   
        frame.add(centerPanel, BorderLayout.CENTER);  
        frame.add(equalPanel, BorderLayout.SOUTH);    


        frame.setSize(500, 450);                                    
        frame.setLocationRelativeTo(null);                          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setVisible(true);                                     
    }


    public static void main(String[] args) {
        new Exam11(); 
    }
}