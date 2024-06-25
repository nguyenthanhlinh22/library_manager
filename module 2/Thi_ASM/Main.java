import src.MedicalRecordManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MedicalRecordManager manager = new MedicalRecordManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-----Medical Record Management Program---------");
            System.out.println("Menu:");
            System.out.println("1. Add new medical record");
            System.out.println("2. Delete medical record");
            System.out.println("3. View all medical records");
            System.out.println("4. Exit");
            System.out.println("------------------THANKS YOU-----------------");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    manager.addMedicalRecord();
                    break;
                case 2:
                    manager.deleteMedicalRecord();
                    break;
                case 3:
                    manager.displayMedicalRecords();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
