import javax.swing.*;
import java.awt.*;

public class Frame1 extends JFrame{

    public Frame1() {
        setTitle("Hello World");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.GREEN);

        JLabel label = new JLabel("Welcome to the world");

        contentPane.add(label);

    }

    public static void main(String[] args) {
        Frame1 frame1 = new Frame1();
    }
}
