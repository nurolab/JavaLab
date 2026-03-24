import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo implements ActionListener {
    // Declare components as instance variables so they can be accessed in actionPerformed
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private int clickCount = 0;

    public SwingDemo() {
        // 1. Create the main application frame (window)
        frame = new JFrame("Swing Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        frame.setSize(300, 200); // Set the size
        frame.setLayout(null); // Use absolute positioning for simplicity

        // 2. Create UI components
        label = new JLabel("Clicks: 0");
        label.setBounds(110, 50, 80, 20); // x, y, width, height

        button = new JButton("Click Me");
        button.setBounds(100, 80, 100, 40); // x, y, width, height
        button.addActionListener(this); // Register the action listener

        // 3. Add components to the frame
        frame.add(label);
        frame.add(button);

        // 4. Make the frame visible (must be done last)
        frame.setVisible(true);
    }

    // 5. Implement the ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        // This method is called when the button is clicked
        clickCount++;
        label.setText("Clicks: " + clickCount);
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Ensure all Swing components are created and updated on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
