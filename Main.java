/*
 * Main.java shows the "Hello, World!" program in Java Swing.
 */
import javax.swing.*;

public class Main {
    /**
     * Create the GUI and shows it.
     */

    public static void main(String[] args) {
        //Create and set up the window.
        JFrame frame = new JFrame("Hello, World! - Swing");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add button
        JButton aButton = new JButton("Hello, World!");
        aButton.setBounds(125, 135, 150, 30);
        frame.add(aButton);

        //Display the window.
        //frame.pack();
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
