package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class ministatement extends JFrame {
    ministatement() {
        getContentPane().setBackground(new Color(243, 132, 132));
        setLayout(null);
        setSize(400, 600);
        setLocationRelativeTo(null);


        JLabel label1 = new JLabel("");
        label1.setBounds(20, 140, 400, 200);
        label1.setFont(new Font("System", Font.PLAIN, 16));
        add(label1);

        JLabel label2 = new JLabel("SA3 Bank");
        label2.setBounds(150, 20, 200, 20);
        label2.setFont(new Font("System", Font.PLAIN, 16));
        add(label2);

        JLabel label3 = new JLabel("");
        label3.setBounds(20, 80, 300, 20);
        label3.setFont(new Font("System", Font.PLAIN, 16));
        add(label3);

        JLabel label4 = new JLabel("");
        label4.setBounds(20, 400, 300, 20);
        label4.setFont(new Font("System", Font.PLAIN, 16));
        add(label4);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ministatement();
    }

}
