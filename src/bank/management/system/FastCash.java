package bank.management.system;

import javax.swing.*;
import java.awt.*;


public class FastCash extends JFrame {
    JButton button1,button2,button3,button4,button5,button6,button7;

    FastCash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1366, 768);
        add(l3);

        JLabel label = new JLabel("Please select withdrawal amount");
        label.setBounds(390, 150, 700, 35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 22));
        l3.add(label);

        button1 = new JButton("Rs. 100");
        button1.setBackground(new Color(0xCCE3C8));
        button1.setBounds(375, 245, 150, 32);
        l3.add(button1);

        button2 = new JButton("Rs. 500");
        button2.setBackground(new Color(0xCCE3C8));
        button2.setBounds(575, 245, 150, 32);
        l3.add(button2);

        button3 = new JButton("Rs. 1000");
        button3.setBackground(new Color(0xCCE3C8));
        button3.setBounds(375, 295, 150, 32);

        l3.add(button3);

        button4 = new JButton("Rs. 2000");
        button4.setBackground(new Color(0xCCE3C8));
        button4.setBounds(575, 295, 150, 32);

        l3.add(button4);

        button5 = new JButton("Rs. 5000");
        button5.setBackground(new Color(0xCCE3C8));
        button5.setBounds(375, 345, 150, 32);

        l3.add(button5);

        button6 = new JButton("Rs. 10000");
        button6.setBackground(new Color(0xCCE3C8));
        button6.setBounds(575, 345, 150, 32);
        l3.add(button6);

        button7 = new JButton("Back");
        button7.setBackground(new Color(0xCCE3C8));
        button7.setBounds(575, 395, 150, 30);
        l3.add(button7);



        setLayout(null);
        setSize(1366, 768);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new FastCash();
    }
}