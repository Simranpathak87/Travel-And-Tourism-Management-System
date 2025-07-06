
package travelmanagrmentsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bout extends JFrame implements ActionListener{
    
    bout(){
        
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1 = new JLabel("About");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
       String s = "ABOUT PROJECT\n\n"
    + "Project Name: Travel and Tourism Management System\n\n"
    + "Objective:\n"
    + "The main objective of the Travel and Tourism Management System is to develop a platform\n"
    + "that automates the processes and activities of travel and tour operations. It is designed\n"
    + "to manage all the information related to travel destinations, bookings, customers, and\n"
    + "packages efficiently.\n\n"
    + "Project Description:\n"
    + "This application helps users to access travel-related information for specific destinations\n"
    + "with ease. Users can check tour details, hotel availability, and booking status. It reduces\n"
    + "manual work and improves the overall efficiency of travel agencies. Through this system,\n"
    + "users can also get updates and alerts regarding their trips.\n\n"
    + "Key Features and Advantages:\n"
    + "- Provides accurate and up-to-date travel information\n"
    + "- Simplifies manual work\n"
    + "- Minimizes documentation efforts\n"
    + "- Enhances user experience with a friendly interface\n"
    + "- Sends alerts and warning messages to travelers\n"
    + "- Stores and manages customer details efficiently\n"
    + "- Provides booking confirmation and tracking";
        
        
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        JButton back =new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);
        
        
        setVisible(true);
        
        
    }
     public void actionPerformed(ActionEvent ae){
         setVisible(false);
         
         
     }
    
     public static void main(String[] args){
        new bout();
     }  
    
}