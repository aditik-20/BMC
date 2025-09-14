package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame
{
    JLabel label1 , label2 , label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1 , button2 , button3;
    Login() {
        super("Bank Management Title");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);


        label1 = new JLabel("Welcome TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card Number: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(textField2);


        label3= new JLabel("PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label3.setBounds(150,250,375,30);
        add(label3);
        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(passwordField3);

        button1 = new JButton("Sign In");
        button1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100, 30);

        add(button1);

        button2 = new JButton("Clear");
        button2.setFont(new Font("Times New Roman", Font.BOLD, 15));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100, 30);

        add(button2);

        button3 = new JButton("Sign Up");
        button3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        add(button3);



        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);
    }



    public static void main(String[] args)
    {
        new Login();
    }
}






