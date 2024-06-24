package src;

import java.time.LocalDate;

public class NormalMedicalRecord extends MedicalRecord {
    private final double hospitalFee;

    public NormalMedicalRecord(int id,
                               String medicalRecordCode,
                               String patientCode,
                               String patientName,
                               LocalDate admissionDate,
                               LocalDate dischargeDate,
                               String reason,
        double hospitalFee) {
        super(id,
                medicalRecordCode,
                patientCode,
                patientName,
                admissionDate,
                dischargeDate,
                reason);
        this.hospitalFee = hospitalFee;
    }

    @Override
    public String toCSV() {
        return id + "," + medicalRecordCode + "," + patientCode + "," + patientName + "," +
                admissionDate + "," + dischargeDate + "," + reason + "," + hospitalFee;
    }

    @Override
    public void display() {
        System.out.println("ID: " + id + ", Medical Record Code: " + medicalRecordCode + ", Patient Code: " + patientCode +
                ", Patient Name: " + patientName + ", Admission Date: " + admissionDate +
                ", Discharge Date: " + dischargeDate + ", Reason: " + reason + ", Hospital Fee: " + hospitalFee);
    }
}

