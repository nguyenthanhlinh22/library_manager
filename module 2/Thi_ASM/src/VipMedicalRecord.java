package src;

import java.time.LocalDate;

public class VipMedicalRecord extends MedicalRecord {
    private final String vipPackage;
    private final LocalDate vipExpiryDate;

    public VipMedicalRecord(int id,
                            String medicalRecordCode,
                            String patientCode,
                            String patientName,
                            LocalDate admissionDate,
                            LocalDate dischargeDate,
                            String reason,
                            String vipPackage,
                            LocalDate vipExpiryDate) {
        super(id,
                medicalRecordCode,
                patientCode,
                patientName,
                admissionDate,
                dischargeDate,
                reason);
        this.vipPackage = vipPackage;
        this.vipExpiryDate = vipExpiryDate;
    }

    @Override
    public String toCSV() {
        return id + "," + medicalRecordCode + "," + patientCode + "," + patientName + "," +
                admissionDate + "," + dischargeDate + "," + reason + "," + vipPackage + "," + vipExpiryDate;
    }

    @Override
    public void display() {
        System.out.println("ID: " + id + ", Medical Record Code: " + medicalRecordCode + ", Patient Code: " + patientCode +
                ", Patient Name: " + patientName + ", Admission Date: " + admissionDate +
                ", Discharge Date: " + dischargeDate + ", Reason: " + reason + ", VIP Package: " + vipPackage +
                ", VIP Expiry Date: " + vipExpiryDate);
    }
}

