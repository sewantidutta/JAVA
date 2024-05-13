import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingexample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton red = new JButton("Red");
        JButton blue = new JButton("Blue");
        JButton green = new JButton("Green");
        JButton reset = new JButton("Reset");
        red.setBounds(145, 100, 100, 40);
        blue.setBounds(145, 150, 100, 40);
        green.setBounds(145, 200, 100, 40);
        reset.setBounds(145, 250, 100, 40);
        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Container contentPane = f.getContentPane();
                contentPane.setBackground(Color.RED);
            }
        });
        blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Container contentPane = f.getContentPane();
                contentPane.setBackground(Color.BLUE);
            }
        });
        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Container contentPane = f.getContentPane();
                contentPane.setBackground(Color.GREEN);
            }
        });
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Container contentPane = f.getContentPane();
                contentPane.setBackground(Color.WHITE);
            }
        });
        f.add(red);
        f.add(blue);
        f.add(green);
        f.add(reset);
        f.setSize(400, 500);
        f.setLayout(new GridBagLayout());
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}