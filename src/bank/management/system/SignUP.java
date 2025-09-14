package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignUP extends JFrame  {
    JRadioButton r1, r2 , rr1, rr2 , rr3;
    JButton next;
    JTextField textName, textFname , textEmail, textState , textAdd , textPin , textCity;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    SignUP() {
        super("Application Form");
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

        JLabel label1 = new JLabel("Application Form No. " + first);
        label1.setBounds(140, 20, 600, 40);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        content.add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330, 70, 600, 30);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        content.add(label2);

        JLabel label3 = new JLabel("Personal Information");
        label3.setBounds(290, 100, 400, 30);
        label3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        content.add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Times New Roman", Font.BOLD, 25));
        labelName.setBounds(100, 140, 200, 30);
        content.add(labelName);

        textName = new JTextField();
        textName.setBounds(300, 140, 400, 30);
        textName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        content.add(textName);

        JLabel labelFname = new JLabel("Father's Name:");
        labelFname.setFont(new Font("Times New Roman", Font.BOLD, 25));
        labelFname.setBounds(100, 190, 200, 30);
        content.add(labelFname);

        textFname = new JTextField();
        textFname.setBounds(300, 190, 400, 30);
        textFname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        content.add(textFname);

        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setFont(new Font("Times New Roman", Font.BOLD, 25));
        DOB.setBounds(100, 240, 200, 30);
        content.add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 240, 400, 30);
        content.add(dateChooser);

        JLabel labelGender = new JLabel("Gender:");
        labelGender.setFont(new Font("Times New Roman", Font.BOLD, 25));
        labelGender.setBounds(100, 290, 200, 30);
        content.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        r1.setBounds(300, 290, 100, 30);
        r1.setBackground(new Color(222, 255, 228));
        content.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        r2.setBounds(420, 290, 120, 30);
        r2.setBackground(new Color(222, 255, 228));
        content.add(r2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel labelemail = new JLabel("Email:");
        labelemail.setFont(new Font("Times New Roman", Font.BOLD, 25));
        labelemail.setBounds(100, 340, 200, 30);
        content.add(labelemail);

        textEmail = new JTextField();
        textEmail.setBounds(300, 340, 400, 30);
        textEmail.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        content.add(textEmail);

        JLabel labelMs = new JLabel("Marital Status:");
        labelMs.setFont(new Font("Times New Roman", Font.BOLD, 25));
        labelMs.setBounds(100, 390, 200, 30);
        content.add(labelMs);

        rr1 = new JRadioButton("Married");
        rr1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rr1.setBounds(300, 390, 100, 30);
        rr1.setBackground(new Color(222, 255, 228));
        content.add(rr1);

        rr2 = new JRadioButton("Unmarried");
        rr2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rr2.setBounds(440, 390, 120, 30);
        rr2.setBackground(new Color(222, 255, 228));
        content.add(rr2);

        rr3 = new JRadioButton("Others");
        rr3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        rr3.setBounds(600, 390, 100, 30);
        rr3.setBackground(new Color(222, 255, 228));
        content.add(rr3);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(rr1);
        buttonGroup2.add(rr2);
        buttonGroup2.add(rr3);

        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setFont(new Font("Times New Roman", Font.BOLD, 25));
        labelAdd.setBounds(100, 440, 200, 30);
        content.add(labelAdd);

        textAdd = new JTextField();
        textAdd.setBounds(300, 440, 400, 30);
        textAdd.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        content.add(textAdd);

        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Times New Roman", Font.BOLD, 25));
        labelCity.setBounds(100, 490, 200, 30);
        content.add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(300, 490, 400, 30);
        textCity.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        content.add(textCity);

        JLabel labelPin = new JLabel("Pin Code:");
        labelPin.setFont(new Font("Times New Roman", Font.BOLD, 25));
        labelPin.setBounds(100, 540, 200, 30);
        content.add(labelPin);

        textPin = new JTextField();
        textPin.setBounds(300, 540, 400, 30);
        textPin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        content.add(textPin);

        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Times New Roman", Font.BOLD, 25));
        labelState.setBounds(100, 590, 200, 30);
        content.add(labelState);

        textState = new JTextField();
        textState.setBounds(300, 590, 400, 30);
        textState.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        content.add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Times New Roman", Font.BOLD, 25));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 640, 120, 40);
        content.add(next);

        JScrollPane scrollPane = new JScrollPane(content, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

        getContentPane().setBackground(new Color(222, 255, 228));
        setSize(870, 900);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    public static void main(String[] args)
    {

        new SignUP();
    }
}
