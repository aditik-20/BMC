package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class SignUp2 extends JFrame
{
    JButton next;
    JComboBox comboBox1,comboBox2,comboBox3,comboBox4,comboBox5;

    JTextField textPan, textAadhar;
    JRadioButton r1, r2, e1, e2;

    SignUp2() {
        super("Application Form");


        JPanel content = new JPanel();
        content.setLayout(null);
        content.setPreferredSize(new Dimension(850, 800));
        content.setBackground(new Color(222, 255, 228));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(45, 10, 100, 100);
        content.add(image);

        JLabel l1 = new JLabel("Page 2 : - ");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l1.setBounds(300, 30, 600, 30);
        content.add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l2.setBounds(300, 60, 600, 30);
        content.add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l3.setBounds(100, 120, 100, 30);
        content.add(l3);

        String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox1 = new JComboBox(religion);
        comboBox1.setBackground(new Color(222, 255, 228));
        comboBox1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        comboBox1.setBounds(350, 120, 320, 30);
        content.add(comboBox1);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l4.setBounds(100, 170, 100, 30);
        content.add(l4);

        String category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(222, 255, 228));
        comboBox2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        comboBox2.setBounds(350, 170, 320, 30);
        content.add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l5.setBounds(100, 220, 100, 30);
        content.add(l5);

        String income[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(222, 255, 228));
        comboBox3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        comboBox3.setBounds(350, 220, 320, 30);
        content.add(comboBox3);

        JLabel l6 = new JLabel("Educational");
        l6.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l6.setBounds(100, 270, 150, 30);
        content.add(l6);

        String education[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(222, 255, 228));
        comboBox4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        comboBox4.setBounds(350, 270, 320, 30);
        content.add(comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l7.setBounds(100, 320, 150, 30);
        content.add(l7);

        String occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(222, 255, 228));
        comboBox5.setFont(new Font("Times New Roman", Font.BOLD, 20));
        comboBox5.setBounds(350, 320, 320, 30);
        content.add(comboBox5);

        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l8.setBounds(100, 370, 200, 30);
        content.add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Times New Roman", Font.BOLD, 20));
        textPan.setBounds(350, 370, 320, 30);
        content.add(textPan);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l9.setBounds(100, 420, 200, 30);
        content.add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Times New Roman", Font.BOLD, 20));
        textAadhar.setBounds(350, 420, 320, 30);
        content.add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l10.setBounds(100, 470, 200, 30);
        content.add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(350, 470, 100, 30);
        content.add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        r2.setBackground(new Color(222, 255, 228));
        r2.setBounds(500, 470, 100, 30);
        content.add(r2);

        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(r1);
        seniorGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l11.setBounds(100, 520, 200, 30);
        content.add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        e1.setBackground(new Color(222, 255, 228));
        e1.setBounds(350, 520, 100, 30);
        content.add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        e2.setBackground(new Color(222, 255, 228));
        e2.setBounds(500, 520, 100, 30);
        content.add(e2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(e1);
        buttonGroup.add(e2);

        JLabel l12 = new JLabel("Form no. : ");
        l12.setFont(new Font("Times New Roman", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 20);
        content.add(l12);

        JLabel l13 = new JLabel();
        l13.setFont(new Font("Times New Roman", Font.BOLD, 14));
        l13.setBounds(770, 10, 60, 20);
        content.add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Times New Roman", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 600, 80, 30);
        content.add(next);

        setContentPane(content);
        setSize(850, 750);
        setLocation(450, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }



    public static void main(String[] args) {
        new SignUp2();
    }
}
