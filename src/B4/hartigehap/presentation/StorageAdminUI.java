package B4.hartigehap.presentation;

import javax.swing.*;

/**
 *
 * @author John Boogaard
 */
public class StorageAdminUI extends JFrame {
    private JLabel labelLowStock;
    
    public StorageAdminUI() {
        setupFrame();
    }
    
    private void setupFrame() {
        
        JFrame frame = new StorageAdminUI();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Magazijnbeheer");
        frame.setContentPane(rootPane);
        frame.setVisible(true);
        frame.pack();
        
}
}