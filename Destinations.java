
package travelmanagrmentsystem;

import javax.swing.*;
import java.awt.*;

public class Destinations extends JFrame implements Runnable {

    Thread t1;

    JLabel[] label = new JLabel[10];
    JLabel caption;

    String[] text = {
        "JW Marriott Hotel", "Madarin Oriental Hotel", "Four Seasons Hotel",
        "Raddission Blue Hotel", "Classio Hotel", "The Bay Club Hotel",
        "Breeze Blow Hotel", "The Taj Hotel", "Happy Morning Hotel", "River View Hotel"
    };

    String[] imageFiles = {
        "dest1.jpg", "dest2.png", "dest3.jpg", "dest4.jpg", "dest5.jpg",
        "dest6.jpg", "dest7.jpeg", "dest8.jpg", "dest9.jpg", "dest10.jpg"
    };

    public void run() {
        try {
            for (int i = 0; i < label.length; i++) {
                label[i].setVisible(true);
                caption.setText(text[i]);
                Thread.sleep(2500);
                label[i].setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Destinations() {
        setBounds(500, 200, 800, 600);
        setLayout(null);

        caption = new JLabel();
        caption.setBounds(50, 500, 1000, 70);
        caption.setFont(new Font("Tahoma", Font.PLAIN, 40));
        caption.setForeground(Color.WHITE);
        add(caption);

        for (int i = 0; i < label.length; i++) {
            ImageIcon imgIcon = new ImageIcon(ClassLoader.getSystemResource("icons/" + imageFiles[i]));
            Image img = imgIcon.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
            ImageIcon scaledIcon = new ImageIcon(img);
            label[i] = new JLabel(scaledIcon);
            label[i].setBounds(0, 0, 800, 600);
            label[i].setVisible(false);
            add(label[i]);
        }

        t1 = new Thread(this);
        t1.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new Destinations();
    }
}
