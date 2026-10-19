package blooddonationsystem;

public class BloodInventoryStage2 {

    // Private Instance Variables (Encapsulation)
    private String bloodType;      // e.g., "A+", "O-", "B+"
    private int units;             // Available units in stock
    private int expirationDays;    // Days remaining until expiration

    // Default Constructor
    public BloodInventoryStage2() {
        this.bloodType = "Unknown";
        this.units = 0;
        this.expirationDays = 0;
    }

    // Parameterized Constructor
    public BloodInventoryStage2(String bloodType, int units, int expirationDays) {
        setBloodType(bloodType);
        setUnits(units);
        setExpirationDays(expirationDays);
    }

    // Getters and Setters with Validation

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        if (bloodType != null && !bloodType.trim().isEmpty()) {
            this.bloodType = bloodType;
        } else {
            this.bloodType = "Unknown";
        }
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        if (units >= 0) {
            this.units = units;
        } else {
            System.out.println("Error: Units cannot be negative.");
            this.units = 0;
        }
    }

    public int getExpirationDays() {
        return expirationDays;
    }

    public void setExpirationDays(int expirationDays) {
        if (expirationDays >= 0) {
            this.expirationDays = expirationDays;
        } else {
            System.out.println("Error: Expiration days cannot be negative.");
            this.expirationDays = 0;
        }
    }

    // Additional Business Logic Methods

    // Method to check if blood unit is usable (not expired)
    public boolean isExpired() {
        return this.expirationDays <= 0;
    }

    // Method to add new stock
    public void addStock(int addedUnits) {
        if (addedUnits > 0) {
            this.units += addedUnits;
            System.out.println("Successfully added " + addedUnits + " units. Total stock: " + this.units);
        } else {
            System.out.println("Error: Invalid quantity to add.");
        }
    }

    // Method to display inventory information
    public void displayInventoryDetails() {
        System.out.println("=== Blood Inventory Details ===");
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Units in Stock: " + units);
        System.out.println("Expiration Days Remaining: " + expirationDays);
        System.out.println("Status: " + (isExpired() ? "EXPIRED" : "VALID"));
    }
}
