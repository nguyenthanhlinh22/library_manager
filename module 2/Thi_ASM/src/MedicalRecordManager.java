package src;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MedicalRecordManager {
    private static final String FILE_PATH = "medical_records.csv";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final List<MedicalRecord> records;

    public MedicalRecordManager() {
        records = new ArrayList<>();
        loadRecordsFromFile();
    }

    private void loadRecordsFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String medicalRecordCode = data[1];
                String patientCode = data[2];
                String patientName = data[3];
                LocalDate admissionDate = LocalDate.parse(data[4] );
                LocalDate dischargeDate = LocalDate.parse(data[5]);
                String reason = data[6];

                if (data.length == 8) { // Normal Medical Record
                    double hospitalFee = Double.parseDouble(data[7]);
                    records.add(new NormalMedicalRecord(id, medicalRecordCode, patientCode, patientName, admissionDate, dischargeDate, reason, hospitalFee));
                } else if (data.length == 9) { // VIP Medical Record
                    String vipPackage = data[7];
                    LocalDate vipExpiryDate = LocalDate.parse(data[8], DATE_FORMATTER);
                    records.add(new VipMedicalRecord(id, medicalRecordCode, patientCode, patientName, admissionDate, dischargeDate, reason, vipPackage, vipExpiryDate));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveRecordsToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (MedicalRecord record : records) {
                bw.write(record.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getNextId() {
        return records.isEmpty() ? 1 : records.get(records.size() - 1).id + 1;
    }

    public void addMedicalRecord() {
        Scanner scanner = new Scanner(System.in);
        int id = getNextId();

        System.out.print("Enter medical record code (format: BA-XXX): ");
        String medicalRecordCode = scanner.nextLine();

        try {
            for (MedicalRecord record : records) {
                if (record.medicalRecordCode.equals(medicalRecordCode)) {
                    throw new DuplicateMedicalRecordException("Bệnh án đã tồn tại.");
                }
            }
        } catch (DuplicateMedicalRecordException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.print("Enter patient code (format: BN-XXX): ");
        String patientCode = scanner.nextLine();
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();
        System.out.print("Enter admission date (dd/MM/yyyy): ");
        LocalDate admissionDate = LocalDate.parse(scanner.nextLine(), DATE_FORMATTER);
        System.out.print("Enter discharge date (dd/MM/yyyy): ");
        LocalDate dischargeDate = LocalDate.parse(scanner.nextLine(), DATE_FORMATTER);
        System.out.print("Enter reason for admission: ");
        String reason = scanner.nextLine();

        System.out.print("Is this a VIP record? (yes/no): ");
        String isVip = scanner.nextLine();

        if (isVip.equalsIgnoreCase("yes")) {
            System.out.print("Enter VIP package (VIP I, VIP II, VIP III): ");
            String vipPackage = scanner.nextLine();
            System.out.print("Enter VIP expiry date (dd/MM/yyyy): ");
            LocalDate vipExpiryDate = LocalDate.parse(scanner.nextLine(), DATE_FORMATTER);

            records.add(new VipMedicalRecord(id, medicalRecordCode, patientCode, patientName, admissionDate, dischargeDate, reason, vipPackage, vipExpiryDate));
        } else {
            System.out.print("Enter hospital fee: ");
            double hospitalFee = Double.parseDouble(scanner.nextLine());

            records.add(new NormalMedicalRecord(id, medicalRecordCode, patientCode, patientName, admissionDate, dischargeDate, reason, hospitalFee));
        }

        saveRecordsToFile();
        System.out.println("New medical record added successfully.");
    }

    public void deleteMedicalRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter medical record code to delete: ");
        String medicalRecordCode = scanner.nextLine();

        Optional<MedicalRecord> recordToDelete = records.stream()
                .filter(record -> record.medicalRecordCode.equals(medicalRecordCode))
                .findFirst();

        if (recordToDelete.isPresent()) {
            System.out.print("Are you sure you want to delete this record? (yes/no): ");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("yes")) {
                records.remove(recordToDelete.get());
                saveRecordsToFile();
                System.out.println("Medical record deleted successfully.");
            } else {
                System.out.println("Deletion cancelled.");
            }
        } else {
            System.out.println("Medical record not found.");
        }
    }

    public void displayMedicalRecords() {
        for (MedicalRecord record : records) {
            record.display();
        }
    }
}
