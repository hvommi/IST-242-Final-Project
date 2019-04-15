//package pictures;


import java.awt.*;
import javax.swing.*;


public class pictures extends JFrame {
    private ImageIcon image1;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;

    pictures() {
        setLayout (new FlowLayout());

        image1 = new ImageIcon(getClass().getResource("Drew.PNG"));
        label1 = new JLabel(image1);
        add(label1);

        image2 = new ImageIcon(getClass().getResource("Drone.jpg"));
        label2 = new JLabel(image2);
        add(label2);
    }

      public static void main(String[] args) {
          pictures gui = new pictures();
          gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          gui.setVisible(true);
          gui.pack();
          gui.setTitle("Image Program");
      }

}