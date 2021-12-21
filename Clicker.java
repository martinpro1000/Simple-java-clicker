import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Clicker implements ActionListener {

    //OPEN SOURCE PROGRAM BY GITHUB: martinpro1000
    
    private JLabel numberLabel;
    private int clicks = 0;
    public void createAndShow() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //optional
            JFrame frame = new JFrame();
            this.numberLabel = new JLabel("number of clicks:");
            JButton clicker = new JButton("CLICK ME!");
            clicker.setPreferredSize(new Dimension(100, 35));
            clicker.addActionListener(this);
            frame.add(clicker, BorderLayout.CENTER);
            frame.add(numberLabel, BorderLayout.SOUTH);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setResizable(false); //optional
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }catch(Exception e) {
            e.printStackTrace(System.err);
        }
    }

    public static void main(String[] args) {
        new Clicker().createAndShow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clicks += 1;
        numberLabel.setText("number of clicks: " + clicks);
    }
}
