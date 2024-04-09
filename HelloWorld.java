/*
* The HelloWorld program implements an application that
* simply displays "Hello, World!" in a button using Java Swing.
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-01-01
*/

import javax.swing.JButton;
import javax.swing.JFrame;

final class HelloWorld {
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        //Create and set up the window
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
