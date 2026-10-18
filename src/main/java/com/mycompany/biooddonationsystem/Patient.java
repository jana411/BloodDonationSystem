package patientprojectoop;

public class Patient {
    private String patientId;
    private String patientName;
    private String bloodType;
    private int requestUrgency;  
    private int requestedUnits;  

    public Patient() {
        this.patientId = "";
        this.patientName = "";
        this.bloodType = "";
        this.requestUrgency = 0;
        this.requestedUnits = 0;
    }

    public Patient(String patientId, String patientName, String bloodType, int requestUrgency, int requestedUnits) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.bloodType = bloodType;
        this.requestUrgency = requestUrgency;
        this.requestedUnits = requestedUnits;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getRequestUrgency() {
        return requestUrgency;
    }

    public void setRequestUrgency(int requestUrgency) {
        this.requestUrgency = requestUrgency;
    }

    public int getRequestedUnits() {
        return requestedUnits;
    }

    public void setRequestedUnits(int requestedUnits) {
        this.requestedUnits = requestedUnits;
    }

    public boolean checkRequestUrgency() {
        return (this.requestUrgency == 1 || this.requestUrgency == 2);
    }

    public boolean checkBloodQuantity() {
        return (this.requestedUnits > 0 && this.requestedUnits <= 3);
    }

    @Override
    public String toString() {
        String urgencyStr;
        if (requestUrgency == 1) {
            urgencyStr = "Emergency";
        } else if (requestUrgency == 2) {
            urgencyStr = "Scheduled";
        } else {
            urgencyStr = "Invalid Choice";
        }

        return "Patient ID: " + patientId +
               "\nName: " + patientName +
               "\nBlood Type: " + bloodType +
               "\nRequest Urgency: " + urgencyStr +
               "\nRequested Units: " + requestedUnits;
    }
}