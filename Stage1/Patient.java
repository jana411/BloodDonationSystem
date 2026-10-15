package patient;

import javax.swing.JOptionPane;

public class Patient {

    public static void checkRequestUrgency() {
        String input = JOptionPane.showInputDialog(null, 
            "Enter Patient Request Urgency:\n1. Emergency\n2. Scheduled");
        
        if (input != null) {
            int choice = Integer.parseInt(input);
            
            if (choice == 1) {
                JOptionPane.showMessageDialog(null, "Status: Emergency Request! Blood unit dispatched immediately.");
            } else if (choice == 2) {
                JOptionPane.showMessageDialog(null, "Status: Scheduled Request. Added to the regular queue.");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Invalid selection. Please enter 1 or 2.");
            }
        }
    }

public static void checkBloodQuantity() {
        String input = JOptionPane.showInputDialog(null, 
            "Enter requested blood units (Max 3 units allowed per request):");
        
        if (input != null) {
            int units = Integer.parseInt(input);
            
            if (units > 0 && units <= 3) {
                JOptionPane.showMessageDialog(null, "Success: The requested quantity (" + units + " units) is approved.");
            } else if (units > 3) {
                JOptionPane.showMessageDialog(null, "Rejected: Requested units exceed the maximum limit (3 units).");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Invalid quantity entered.");
            }
        }
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to Patient Blood Request System (Stage 1)");
        
        checkRequestUrgency();
        checkBloodQuantity();
        
        JOptionPane.showMessageDialog(null, "Program execution completed.");
    }
}
