
package travelmanagrmentsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    String username;
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkpackages, bookpackages;
    JButton viewpackage, viewhotels, destinations, bookhotel, viewBookedhotel, payments, deletePersonalDetails;
    JButton calculators, notepad, about;

    Dashboard(String username) {
        this.username = username;

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);

        JLabel heading = new JLabel("Dashboard - " + username);
        heading.setBounds(80, 10, 600, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);

        String[] buttonNames = {
                "Add Personal Details", "Update Personal Details", "View Details", "Delete Personal Details",
                "Check Package", "Book Package", "View Package", "View Hotels", "Book Hotel",
                "View Booked Hotel", "Destinations", "Payments", "Calculators", "Notepad", "About"
        };

        JButton[] buttons = {
                addPersonalDetails = new JButton(buttonNames[0]),
                updatePersonalDetails = new JButton(buttonNames[1]),
                viewPersonalDetails = new JButton(buttonNames[2]),
                deletePersonalDetails = new JButton(buttonNames[3]),
                checkpackages = new JButton(buttonNames[4]),
                bookpackages = new JButton(buttonNames[5]),
                viewpackage = new JButton(buttonNames[6]),
                viewhotels = new JButton(buttonNames[7]),
                bookhotel = new JButton(buttonNames[8]),
                viewBookedhotel = new JButton(buttonNames[9]),
                destinations = new JButton(buttonNames[10]),
                payments = new JButton(buttonNames[11]),
                calculators = new JButton(buttonNames[12]),
                notepad = new JButton(buttonNames[13]),
                about = new JButton(buttonNames[14])
        };

        int y = 0;
        for (JButton btn : buttons) {
            btn.setBounds(0, y, 300, 50);
            btn.setBackground(new Color(0, 0, 102));
            btn.setForeground(Color.WHITE);
            btn.setFont(new Font("Tahoma", Font.PLAIN, 20));
            btn.setMargin(new Insets(0, 0, 0, 60));
            btn.addActionListener(this);
            p2.add(btn);
            y += 50;
        }

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);

        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 55));
        image.add(text);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        } else if (ae.getSource() == deletePersonalDetails) {
            new DeleteDetails(username);
        } else if (ae.getSource() == bookpackages) {
            new BookPackage(username);
        } else if (ae.getSource() == viewpackage) {
            new ViewPackage(username);
        } else if (ae.getSource() == bookhotel) {
            new BookHotel(username);
        } else if (ae.getSource() == viewBookedhotel) {
            new ViewBookHotel(username);
        } else if (ae.getSource() == checkpackages) {
            new CheckPackage();
        } else if (ae.getSource() == viewhotels) {
            new CheckHotels();
        } else if (ae.getSource() == destinations) {
            new Destinations();
        } else if (ae.getSource() == payments) {
            new Payment();
        } else if (ae.getSource() == calculators) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == notepad) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == about) {
            new bout();
        }
    }

    public static void main(String[] args) {
        new Dashboard("testuser");
    }
}