package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class SignUp3 extends JFrame {
    JButton submit, cancel;
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;

    SignUp3() {
        JPanel content = new JPanel();
        content.setLayout(null);
        content.setPreferredSize(new Dimension(850, 800));
        content.setBackground(new Color(222, 255, 228));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        content.add(image);

        JLabel l1 = new JLabel("Page 3 : - ");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l1.setBounds(250, 30, 600, 30);
        content.add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l2.setBounds(250, 60, 600, 30);
        content.add(l2);

        JLabel l3 = new JLabel("Account Type");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l3.setBounds(100, 120, 150, 30);
        content.add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(350, 120, 180, 30);
        content.add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(550, 120, 220, 30);
        content.add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        r3.setBackground(new Color(222, 255, 228));
        r3.setBounds(350, 160, 180, 30);
        content.add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Times New Roman", Font.BOLD, 16));
        r4.setBackground(new Color(222, 255, 228));
        r4.setBounds(550, 160, 250, 30);
        content.add(r4);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);

        JLabel l4 = new JLabel("Card Number : ");
        l4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l4.setBounds(100, 220, 200, 30);
        content.add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        l5.setBounds(100, 250, 300, 20);
        content.add(l5);
        JLabel l6 = new JLabel("XXXX XXXX XXXX 1234");
        l6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l6.setBounds(350, 220, 300, 30);
        content.add(l6);
        JLabel l7 = new JLabel("(It would appear on ATM card and cheque book)");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        l7.setBounds(350, 250, 400, 20);
        content.add(l7);

        JLabel l8 = new JLabel("PIN : ");
        l8.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l8.setBounds(100, 290, 200, 30);
        content.add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l9.setBounds(350, 290, 300, 30);
        content.add(l9);

        JLabel l10 = new JLabel("(4-digit password)");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        l10.setBounds(100, 320, 300, 20);
        content.add(l10);

        JLabel l11 = new JLabel("Services Required : ");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l11.setBounds(100, 360, 200, 30);
        content.add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c1.setBackground(new Color(222, 255, 228));
        c1.setBounds(350, 360, 150, 30);
        content.add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c2.setBackground(new Color(222, 255, 228));
        c2.setBounds(550, 360, 200, 30);
        content.add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c3.setBackground(new Color(222, 255, 228));
        c3.setBounds(350, 400, 150, 30);
        content.add(c3);

        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c4.setBackground(new Color(222, 255, 228));
        c4.setBounds(550, 400, 200, 30);
        content.add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c5.setBackground(new Color(222, 255, 228));
        c5.setBounds(350, 440, 150, 30);
        content.add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c6.setBackground(new Color(222, 255, 228));
        c6.setBounds(550, 440, 150, 30);
        content.add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.", true);
        c7.setFont(new Font("Times New Roman", Font.BOLD, 16));
        c7.setBackground(new Color(222, 255, 228));
        c7.setBounds(100, 500, 700, 30);
        content.add(c7);

        JLabel l12 = new JLabel("Form no. : ");
        l12.setFont(new Font("Times New Roman", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 20);
        add(l12);
        JLabel l13 = new JLabel();
        l13.setFont(new Font("Times New Roman", Font.BOLD, 14));
        l13.setBounds(770, 10, 60, 20);
        add(l13);

        submit = new JButton("Submit");
        submit.setFont(new Font("Times New Roman", Font.BOLD, 18));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250, 600, 100, 30);
        content.add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(450, 600, 100, 30);
        content.add(cancel);


        setContentPane(content);

        setSize(850, 750);
        setLocation(450, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[]args){
        new SignUp3();
    }

}