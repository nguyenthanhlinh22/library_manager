package src;

import java.time.LocalDate;

public abstract class MedicalRecord {
    protected int id;
    protected String medicalRecordCode;
    protected String patientCode;
    protected String patientName;
    protected LocalDate admissionDate;
    protected LocalDate dischargeDate;
    protected String reason;

    public MedicalRecord(int id, String medicalRecordCode, String patientCode, String patientName,
                         LocalDate admissionDate, LocalDate dischargeDate, String reason) {
        this.id = id;
        this.medicalRecordCode = medicalRecordCode;
        this.patientCode = patientCode;
        this.patientName = patientName;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.reason = reason;
    }

    public abstract String toCSV();
    public abstract void display();
}
