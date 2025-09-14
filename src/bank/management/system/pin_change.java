package bank.management.system;

import javax.swing.*;
import java.awt.*;


public class pin_change extends JFrame {
    JButton button1, button2;
    JPasswordField p1, p2;

    pin_change() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1366, 768);
        l3.setLayout(null);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setBounds(450, 150, 400, 35);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 24));
        l3.add(label1);

        JLabel label2 = new JLabel("New PIN:");
        label2.setBounds(380, 230, 200, 35);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 22));
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(0xD9ECD6));
        p1.setFont(new Font("Raleway", Font.BOLD, 22));
        p1.setBounds(590, 230, 150, 35);
        l3.add(p1);

        JLabel label3 = new JLabel("Re-Enter New PIN:");
        label3.setBounds(380, 280, 200, 35);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System", Font.BOLD, 22));
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(0xD9ECD6));
        p2.setFont(new Font("Raleway", Font.BOLD, 22));
        p2.setBounds(590, 280, 150, 35);
        l3.add(p2);
        button1 = new JButton("CHANGE");
        button1.setBackground(new Color(0xD9ECD6));
        button1.setForeground(Color.BLACK);
        button1.setFont(new Font("Raleway", Font.BOLD, 18));
        button1.setBounds(590, 330, 150, 35);
        l3.add(button1);

        button2 = new JButton("BACK");
        button2.setBackground(new Color(0xD9ECD6));
        button2.setForeground(Color.BLACK);
        button2.setFont(new Font("Raleway", Font.BOLD, 18));
        button2.setBounds(590, 380, 150, 35);
        l3.add(button2);

        setLayout(null);
        setSize(1366, 768);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new pin_change();
    }
}