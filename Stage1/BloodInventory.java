package blooddonationsystem;

import javax.swing.JOptionPane;

public class BloodInventory {

    public static void checkStockQuantity() {
        String input = JOptionPane.showInputDialog(null, "Enter Blood Inventory Units:");

        if (input != null && !input.trim().isEmpty()) {
            int units = Integer.parseInt(input.trim());
            if (units > 0) {
                JOptionPane.showMessageDialog(null, "Valid quantity: " + units + " units available.");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Stock quantity must be greater than 0.");
            }
        }
    }

    public static void checkBloodExpiration() {
        String input = JOptionPane.showInputDialog(null, "Enter Remaining Expiration Days:");

        if (input != null && !input.trim().isEmpty()) {
            int daysRemaining = Integer.parseInt(input.trim());
            if (daysRemaining > 0) {
                JOptionPane.showMessageDialog(null, "Valid blood unit: Not expired.");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Expired blood unit!");
            }
        }
    }

    public static void main(String[] args) {
        checkStockQuantity();
        checkBloodExpiration();
    }
}
