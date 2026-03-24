import javax.swing.*;   // Import Swing package for GUI components
import java.awt.event.*; // Import event handling classes

public class SwingDemo1 {   // Main class

    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Demo"); // Create a window (frame)

        frame.setSize(400, 300); // Set width and height of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close app on exit

        JButton button = new JButton("Click Me"); // Create a button
        button.setBounds(150, 100, 100, 40); // Set position and size (x, y, width, height)

        JLabel label = new JLabel(); // Create a label (empty initially)
        label.setBounds(140, 160, 200, 30); // Set position and size

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!"); // Change label text when clicked
            }
        });

        frame.add(button); // Add button to frame
        frame.add(label);  // Add label to frame

        frame.setLayout(null); // Use no layout (absolute positioning)

        frame.setVisible(true); // Make frame visible
    }
}