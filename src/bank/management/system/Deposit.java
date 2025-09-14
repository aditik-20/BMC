package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Deposit extends JFrame {
    JButton button1 , button2;
    TextField textField;
    Deposit(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1366, 768);
        add(l3);

        JLabel label1 = new JLabel("Enter the amount you want to Deposit");
        label1.setBounds(360, 180, 400, 35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 22));
        l3.add(label1);
        textField = new TextField();
        textField.setBackground(new Color(0xCCE3C8));
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        textField.setBounds(390, 230, 320, 35);
        l3.add(textField);

        button1 = new JButton("Deposit");
        button1.setBackground(new Color(0xCCE3C8));
        button1.setFont(new Font("Raleway", Font.BOLD, 18));
        button1.setBounds(580, 330, 150, 35);
        l3.add(button1);
        button2 = new JButton("Back");
        button2.setBackground(new Color(0xCCE3C8));
        button2.setFont(new Font("Raleway", Font.BOLD, 18));
        button2.setBounds(580, 380, 150, 35);
        l3.add(button2);


        setLayout(null);
        setSize(1366, 768);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new Deposit();
    }}

