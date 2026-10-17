# Blood Donation Management System

## OOP Project – Stage 1

### 1. Project Description

The Blood Donation Management System is a Java-based project designed to manage blood donors, blood donations, blood inventory, and blood requests.

The system uses conditions and decision-making statements to validate information and display appropriate results.

### 2. Team Classes

| Student | Class Name | Responsibility |
|---|---|---|
| Jana | Donor | Manage donor information and validation |
|Farah | BloodDonation |Manage blood donation processes |
| Alanoud | BloodInventory | Manage blood inventory |
| Nora | BloodRequest | Manage blood requests |

### 3. Class Attributes and Methods

**Class 1: Donor**

Attributes:
- donorId — int
- donorName — String
- age — int
- weight — double
- bloodType — String

Methods:
- checkAge()
- checkWeight()

Conditions:
- Age must be between 18 and 65.
- Weight must be 50 kg or more.

**Class 2: BloodDonation**

Attributes:
- donationId — int
- donorId — int
- donationDate — String
- donationAmount — double
- donationStatus — String

Methods:
- checkDonationAmount()
- checkDonationStatus()

Conditions:
- Donation amount must be within the project's defined acceptable range.
- Donation status must be "Completed" to record a completed donation.

**Class 3: BloodInventory**

Attributes:
- inventoryId — int
- bloodType — String
- quantity — int
- expiryDate — String
- storageLocation — String

Methods:
- checkQuantity()
- checkExpiryDate()

Conditions:
- Blood quantity must be greater than zero.
- Blood must not be expired.

**Class 4: BloodRequest**

Attributes:
- requestId — int
- bloodType — String
- requestedQuantity — int
- hospitalName — String
- requestStatus — String

Methods:
- checkRequestedQuantity()
- checkAvailability()

Conditions:
- Requested quantity must be greater than zero.
- Requested quantity must not exceed the available inventory quantity.

### 4. Naming Conventions

All team members must follow these naming conventions:

- Class names: PascalCase (Donor, BloodDonation)
- Variable names: camelCase (donorId, bloodType)
- Method names: camelCase (checkAge, checkWeight)
- Java file names must match their public class names.
- Use consistent variable names and data types across classes.

### 5. Stage 1 Requirements

Each student must:

1. Work on one assigned class.
2. Define and explain two conditions.
3. Create two flowcharts.
4. Implement each condition in a separate Java method.
5. Use if/else or switch statements.
6. Use JOptionPane for input and output.
7. Capture screenshots of program execution.
8. Document their assigned work in the group report.

### 6. Team Collaboration

All students will use the same GitHub repository to share their Java files and maintain consistent naming conventions.

Each student is responsible for their assigned class.

All class names, shared variables, and method names should be reviewed before making changes.
